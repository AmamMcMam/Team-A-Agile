package com.kainos.ea.db;
import com.kainos.ea.resources.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface RolesMapper {
    @Select("select * from roles;")
    List<Role> viewJobRoles();
}
