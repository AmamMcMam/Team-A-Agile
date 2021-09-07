package com.kainos.ea.db;
import com.kainos.ea.models.Capability;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface CapabilityMapper {
    @Select("select roleID, roleName, datePosted, location " +
            "from role JOIN capability using(capabilityID) " +
            "where capabilityID = #{cap}")
    List<Role> rolesPerCapability(@Param("cap") int capability);

    @Select("select capabilityID, capability from capability")
    List<Capability> getCapabilities();

    @Select("select capabilityLeadName, capabilityLeadPhoto, capabilityLeadMessage "
            + "from capability "
            + "where capabilityID = #{cap}")
    Capability getLeadPerCapability(@Param("cap") int capabilityID);
}
