package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;

public class JobSpecificationService {
    private RoleMapper specificationMapper;

    public JobSpecificationService(RoleMapper specificationMapper) {
        this.specificationMapper = specificationMapper;
    }

    public JobSpecification getJobSpecification(int roleID) {
        return specificationMapper.getJobSpecification(roleID);
    }
}
