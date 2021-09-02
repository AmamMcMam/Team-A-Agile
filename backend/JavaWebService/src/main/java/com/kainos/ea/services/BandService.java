package com.kainos.ea.services;

import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.models.Band;

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
