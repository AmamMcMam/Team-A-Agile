const express = require('express')
const nunjucks = require('nunjucks');
const path = require('path');
// console.log(path.join(__dirname, "public"))


require('dotenv').config()

const app = express()
app.set('view engine', 'njk');
app.use(express.static(path.join(__dirname, "public")));

nunjucks.configure('viewdir', {
    express: app 
}); 

// Add routes
app.get('/', async (req, res) => {
    res.render('homePage'); 
  });

const jobs = require('./jobRoles')
app.get('/job-roles', async (req, res) => {
    res.render('jobRolesPage', {items: await jobs.getJobRoles()}); 
});

app.get('/job-roles/:id', async (req, res) => {
    const results = await jobs.getJobRole(req.params.id);
    res.render('jobRolePage', {role: results[0], band: results[1]});
});

const caps = require('./capabilities')
app.get('/capabilities', async (req, res) => {
    res.render('capabilities', {items: await caps.getCapabilities()});
});

app.get('/capabilities/:id', async (req, res) => {
    const id = req.params.id;
    console.log(await caps.getCapabilityRoles(id));
    res.render('jobRolesPage', {items: await caps.getCapabilityRoles(req.params.id)}); 
});

app.listen(6555, function() {
    console.log('Express started') 
 });
