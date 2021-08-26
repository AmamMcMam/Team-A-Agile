package com.kainos.ea.db;
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
    //roleID | roleName                    | roleDesc    | datePosted | hours     | location          | bandID | capabilityID

    @Select("select roleID,roleName,roleDesc,datePosted,hours,location,bandID,capabilityID from roles JOIN capability using(capabilityID) where capability = #{cap}")
    List<Roles> rolesPerCapability(@Param("cap") String capability);

    @Select("select capability from capability where capabilityID = #{id};")
    String capabilityOfId(@Param("id") String id);
}
