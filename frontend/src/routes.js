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
    const response = await fetch(api_url+'api/',{method:'GET',headers:{}})
    const data = await response.json();
    res.render('homePage', {test: data}); 

  });

app.get('/job-roles', async (req, res) => {
    const response = await fetch(api_url+'job-roles',{method:'GET',headers:{}})
    const roleData = await response.json();
    res.render('jobRolesPage', {items: roleData}); 

});

app.get('/bands', async (req, res) => {
    const response = await fetch(api_url+'bands',{method:'GET',headers:{}})
    const bandData = await response.json();
    res.render('bandPage', {items: bandData}); 
});

app.get('/job-roles/:id', async (req, res) => {
    var id = req.params.id;
    const response = await fetch(api_url+'job-roles/'+id,{method:'GET',headers:{}})
    const roleData = await response.json();
    const bandResponse = await fetch(api_url+'bands/'+roleData.bandID,{method:'GET',headers:{}})
    const bandData = await bandResponse.json();
    res.render('jobRolePage', {role: roleData, band: bandData}); 

});

app.get('/bands/:id/competency', async (req, res) => {
    var id = req.params.id;
    const response = await fetch(api_url+'bands/'+id+'/competency',{method:'GET',headers:{}})
    const competencyData = await response.json();
    const namesResponse = await fetch(api_url+'competencyNames',{method:'GET',headers:{}})
    const competencyNames = await namesResponse.json();
    res.render('competencyPage', {competency: competencyData, names: competencyNames}); 
});

app.listen(6555, function() { 
    console.log('Express started') 
 });
