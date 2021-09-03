const express = require('express')
const nunjucks = require('nunjucks');
const path = require('path');
const jobs = require('./jobRoles.js')
const caps = require('./capabilities.js')

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

app.get('/job-roles', async (req, res) => {
    const results = await jobs.getJobRoles();
    res.render('jobRolesPage', {items: results}); 
});

app.get('/bands', async (req, res) => {
    const response = await fetch(api_url+'/bands',{method:'GET',headers:{}})
    const bandData = await response.json();
    res.render('bandPage', {items: bandData}); 
});

app.get('/job-roles/:id', async (req, res) => {
    const results = await jobs.getJobRole(req.params.id);
    res.render('jobRolePage', {role: results.roleData, band: results.bandData});
});

app.get('/capabilities', async (req, res) => {
    const results = await caps.getCapabilities()
    res.render('capabilities', {items: results});
});

app.get('/capabilities/:id', async (req, res) => {
    const results = await caps.getCapabilityRoles(req.params.id);
    res.render('jobRolesPage', {items: results}); 
});

app.get('/bands/:id/competency', async (req, res) => {
    var id = req.params.id;
    const response = await fetch(api_url+`/bands/${id}/competency`,{method:'GET',headers:{}})
    const competencyData = await response.json();
    const namesResponse = await fetch(api_url+'/competencyNames',{method:'GET',headers:{}})
    const competencyNames = await namesResponse.json();
    res.render('competencyPage', {competency: competencyData, names: competencyNames}); 
});

app.listen(6555, function() { 
    console.log('Express started') 
 });
