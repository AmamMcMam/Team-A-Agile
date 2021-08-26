const express = require('express')
const nunjucks = require('nunjucks');
const fetch = require('node-fetch')

const app = express()
nunjucks.configure('viewdir', { 
    express: app 
}); 

app.set('view engine', 'njk');
app.use(express.static(__dirname+'/public/images'));

// Add routes
app.get('/', async (req, res) => {
    const response = await fetch('http://localhost:8080/api/',{method:'GET',headers:{}})
    const data = await response.json();
    console.log(data);
    res.render('layout', {test: data}); 

  });

app.get('/job-roles/', async (req, res) => {
    var id = req.query.id;
    const response = await fetch('http://localhost:8080/api/job-roles/' + id,{method:'GET',headers:{}})
    const data = await response.json();
    console.log(data);
    res.render('bandPage', {data: data}); 

});

app.listen(6555, function() { 
    console.log('Express started') 
 });
