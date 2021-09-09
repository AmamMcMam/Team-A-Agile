package com.kainos.ea.db;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface RolesMapper {
    @Select("select roleID, roleName, datePosted, location from role;")
    List<Role> viewJobRoles();
}
