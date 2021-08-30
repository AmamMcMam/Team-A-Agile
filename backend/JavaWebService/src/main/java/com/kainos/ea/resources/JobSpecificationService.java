package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.db.SpecificationMapper;

public class JobSpecificationService {
    private JobSpecification jobSpecification;
    private RoleMapper specificationMapper;

    public JobSpecificationService(RoleMapper specificationMapper){
        this.specificationMapper = specificationMapper;
    }

//    public JobSpecification getJobSpec(int roleID) {
//        return jobSpecification;
//    }

    public JobSpecification getJobSpecification(int roleID) {
        return specificationMapper.getJobSpecification(roleID);
    }



}
