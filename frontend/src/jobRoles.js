require("dotenv").config();

const fetch = require("node-fetch");
const api_url = process.env.API_URL;

exports.getJobRoles = async () => {
    const response = await fetch(`${api_url}/job-roles`,{method:"GET",headers:{}});
    return await response.json();
};

exports.getJobRole = async (id) => {
    const response = await fetch(`${api_url}/job-roles/${id}`,{method:"GET",headers:{}});
    const roleData = await response.json();
    const bandResponse = await fetch(`${api_url}/bands/${roleData.bandID}`,{method:"GET",headers:{}});
    const bandData = await bandResponse.json();
    return {roleData, bandData};
};