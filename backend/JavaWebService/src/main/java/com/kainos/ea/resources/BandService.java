package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.db.RolesMapper;

import java.util.List;

public class BandService {
    private Band band;
    private RoleMapper roleMapper;

    public BandService(RoleMapper roleMapper){
        this.roleMapper = roleMapper;
    }

    public Band getBand(int bandID) {
        return roleMapper.getBand(bandID);
    }
}
