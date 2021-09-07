require("dotenv").config();

const fetch = require("node-fetch");
const api_url = process.env.API_URL;

exports.getCapabilities = async () => {
    const response = await fetch(`${api_url}/capabilities`,{method:"GET",headers:{}});
    return await response.json();
};

exports.getCapabilityRoles = async (id) => {
    const response = await fetch(`${api_url}/capabilities/${id}`,{method:'GET',headers:{}})
    const capabilityData = await response.json();
    const leadInformationResponse = await fetch(`${api_url}/capabilities/${id}/lead`,{method:'GET',headers:{}})
    const leadData = await leadInformationResponse.json();
    return {capabilityData, leadData};
};