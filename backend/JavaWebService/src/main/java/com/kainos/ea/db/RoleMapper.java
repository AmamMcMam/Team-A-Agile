package com.kainos.ea.db;

import com.kainos.ea.resources.Band;
import com.kainos.ea.resources.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select roleID, roleName, bandID from roles where roleID = #{roleID}")
    Roles getRole(int roleID);

    @Select("select bandID, bandName, bandExpectations from band where bandID = #{roleBandId}")
    Band getBand(int roleBandId);
}
