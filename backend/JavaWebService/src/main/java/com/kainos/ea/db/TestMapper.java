package com.kainos.ea.db;
import com.kainos.ea.resources.Capability;
import com.kainos.ea.resources.User;
import com.kainos.ea.resources.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface TestMapper {
    @Select("select firstname from testTable")
    List<User> findAllUsers();

    @Select("select * from roles;")
    List<Roles> viewJobRoles();

    @Select("select roleID,roleName,roleDesc,datePosted,hours,location,bandID,capabilityID from roles JOIN capability using(capabilityID) where capabilityID = #{cap}")
    List<Roles> rolesPerCapability(@Param("cap") int capability);

    @Select("select capabilityID, capability from capability")
    List<Capability> getCapabilities();
}
