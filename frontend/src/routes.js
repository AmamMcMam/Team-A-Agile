const express = require('express')
const nunjucks = require('nunjucks');
const fetch = require('node-fetch')
const path = require('path');
// console.log(path.join(__dirname, "public"))


require('dotenv').config()

const app = express()
app.set('view engine', 'njk');
app.use(express.static(path.join(__dirname, "public")));

nunjucks.configure('viewdir', {
    express: app 
}); 

const api_url = process.env.API_URL;

// Add routes
app.get('/', async (req, res) => {
    const response = await fetch(`${api_url}/api/`,{method:'GET',headers:{}})
    const data = await response.json();
    res.render('homePage', {test: data}); 
  });

app.get('/job-roles', async (req, res) => {
    const response = await fetch(`${api_url}/job-roles`,{method:'GET',headers:{}})
    const roleData = await response.json();
    res.render('jobRolesPage', {items: roleData}); 
});

app.get('/job-roles/:id', async (req, res) => {
    var id = req.params.id;
    const response = await fetch(`${api_url}/job-roles/${id}`,{method:'GET',headers:{}})
    const roleData = await response.json();
    const bandResponse = await fetch(`${api_url}/bands/${roleData.bandID}`,{method:'GET',headers:{}})
    const bandData = await bandResponse.json();
    console.log({role: roleData, band: bandData})
    res.render('jobRolePage', {role: roleData, band: bandData});
});

app.get('/capabilities', async (req, res) => {
    const response = await fetch(`${api_url}/capabilities`,{method:'GET',headers:{}})
    const caps = await response.json();
    console.log(caps);
    res.render('capabilities', {items: caps});
});

app.get('/capabilities/:id', async (req, res) => {
    var id = req.params.id;
    const response = await fetch(`${api_url}/capabilities/${id}`,{method:'GET',headers:{}})
    const roleData = await response.json();
    res.render('jobRolesPage', {items: roleData}); 
});

app.listen(6555, function() {
    console.log('Express started') 
 });
