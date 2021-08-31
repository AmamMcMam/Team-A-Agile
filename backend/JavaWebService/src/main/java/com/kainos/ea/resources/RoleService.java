package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.db.RolesMapper;

import java.util.List;

public class RoleService {
    private RolesMapper rolesMapper;
    private RoleMapper roleMapper;

    public RoleService(RolesMapper rolesMapper, RoleMapper roleMapper){
        this.rolesMapper = rolesMapper;
        this.roleMapper = roleMapper;
    }

    public List<Role> getRoles() {
        return rolesMapper.viewJobRoles();
    }

    public Role getRole(int roleID) {
        return roleMapper.getRole(roleID);
    }

    public Role getJobSpecification(int roleID) {
        return roleMapper.getJobSpecification(roleID);
    }
}
