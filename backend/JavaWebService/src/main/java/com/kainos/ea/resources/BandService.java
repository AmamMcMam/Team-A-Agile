package com.kainos.ea.resources;

import com.kainos.ea.db.BandMapper;
import com.kainos.ea.db.RoleMapper;


import java.util.List;

public class BandService {
    private RoleMapper roleMapper;
    private BandMapper bandMapper;

    public BandService(RoleMapper roleMapper, BandMapper bandMapper){
        this.roleMapper = roleMapper;
        this.bandMapper = bandMapper;
    }

    public Band getBand(int bandID) {
        return roleMapper.getBand(bandID);
    }

    public List<Band> getBands() {
        return bandMapper.getBands();
    }

    public List<CompetencyElement> getCompetencyPerBand(int bandID){
        return bandMapper.getCompetencyPerBand(bandID);
    }

    public List<CompetencyElement> getCompetencyNames(){
        return bandMapper.getCompetencyNames();
    }
}