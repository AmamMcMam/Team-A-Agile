package com.kainos.ea.db;

import com.kainos.ea.resources.Band;
import com.kainos.ea.resources.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select("" +
            "SELECT " +
            "r.roleID," +
            "r.roleName," +
            "r.roleDesc," +
            "r.datePosted," +
            "r.hours," +
            "r.location," +
            "r.bandID," +
            "r.capabilityId," +
            "group_concat(re.responsibility)" +
            " FROM " +
            "roles r" +
            " LEFT JOIN " +
            "role_responsibilities rr" +
            " ON " +
            "r.roleID = rr.roleId" +
            " LEFT JOIN " +
            "responsibilities re" +
            " ON " +
            "rr.responsibilityId = re.responsibilityId" +
            " WHERE r.roleID = #{roleID}" +
            " GROUP BY " +
            "r.roleID;")
    Roles getRole(int roleID);

    @Select("select bandID, bandName, bandExpectations from band where bandID = #{roleBandId}")
    Band getBand(int roleBandId);
}