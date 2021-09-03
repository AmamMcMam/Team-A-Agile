require('dotenv').config()

const fetch = require('node-fetch')
const api_url = process.env.API_URL;

exports.getCapabilities = async () => {
    const response = await fetch(`${api_url}/capabilities`,{method:'GET',headers:{}});
    return await response.json();
};

exports.getCapabilityRoles = async (id) => {
    console.log(id);
    const response = await fetch(`${api_url}/capabilities/${id}`,{method:'GET',headers:{}})
    return await response.json();
}