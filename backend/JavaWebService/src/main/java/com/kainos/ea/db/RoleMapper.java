package com.kainos.ea.db;

import com.kainos.ea.models.Band;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select("select roleID, roleName, bandID from roles where roleID = #{roleID}")
    Role getRole(int roleID);

    @Select("select bandID, bandName, bandExpectations from band where bandID = #{roleBandId}")
    Band getBand(int roleBandId);

}