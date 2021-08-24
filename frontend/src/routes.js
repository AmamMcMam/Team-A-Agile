const express = require('express')
const nunjucks = require('nunjucks'); 

const app = express()
nunjucks.configure('viewdir', { 
    express: app 
}); 

app.set('view engine', 'njk');
app.use(express.static(__dirname+'/public/images'));

// Add routes
app.get('/', async (req, res) => {
    res.render('template'); 
  });

app.listen(6555, function() { 
    console.log('Express started') 
 });
