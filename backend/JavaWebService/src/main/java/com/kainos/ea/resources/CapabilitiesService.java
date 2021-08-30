package com.kainos.ea.resources;

import com.kainos.ea.db.CapabilityMapper;
import com.kainos.ea.resources.Capability;
import com.kainos.ea.resources.Role;
import java.util.List;

public class CapabilitiesService {
    private CapabilityMapper capabilityMapper;

    public CapabilitiesService(CapabilityMapper capabilityMapper){
        this.capabilityMapper = capabilityMapper;
    }

    public List<Role> rolesPerCapability(int cap) {
        return capabilityMapper.rolesPerCapability(cap);
    }

    public List<Capability> getCapabilities() {
        return capabilityMapper.getCapabilities();
    }
}
