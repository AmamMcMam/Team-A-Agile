package com.kainos.ea.db;
import com.kainos.ea.models.Capability;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface CapabilityMapper {
    @Select("select roleID, roleName, roleDesc, datePosted, hours, location, bandID, capabilityID " +
            "from roles JOIN capability using(capabilityID) " +
            "where capabilityID = #{cap}")
    List<Role> rolesPerCapability(@Param("cap") int capability);

    @Select("select capabilityID, capability from capability")
    List<Capability> getCapabilities();
}
