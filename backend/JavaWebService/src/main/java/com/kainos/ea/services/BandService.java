package com.kainos.ea.services;

import com.kainos.ea.db.BandMapper;
import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.models.Band;
import com.kainos.ea.models.CompetencyElement;


import java.util.List;

public class BandService {
    private RoleMapper roleMapper;
    private BandMapper bandMapper;

    public BandService(RoleMapper roleMapper, BandMapper bandMapper){
        this.roleMapper = roleMapper;
        this.bandMapper = bandMapper;
    }
    public BandService(RoleMapper roleMapper){
        this.roleMapper = roleMapper;
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
