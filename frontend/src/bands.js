require('dotenv').config()

const fetch = require('node-fetch')
const api_url = process.env.API_URL;

exports.getBands = async () => {
    const response = await fetch(`${api_url}/bands`,{method:'GET',headers:{}})
    return await response.json();
};

exports.getCompetenciesPerBand = async (id) => {
    const response = await fetch(`${api_url}/bands/${id}/competency`,{method:'GET',headers:{}})
    const competencyData = await response.json();
    const namesResponse = await fetch(`${api_url}/competencyNames`,{method:'GET',headers:{}})
    const competencyNames = await namesResponse.json();
    return{competencyData, competencyNames}
}