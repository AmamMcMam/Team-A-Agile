package com.kainos.ea.db;

import com.kainos.ea.models.Band;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select("SELECT r.roleName, r.roleDesc, r.datePosted, r.hours, r.location, r.bandID, r.link," +
            "group_concat(re.responsibilityTitle) as jobResponsibilities FROM role r" +
            " LEFT JOIN role_responsibility rr ON r.roleID = rr.roleId" +
            " LEFT JOIN responsibility re ON rr.responsibilityId = re.responsibilityId" +
            " WHERE r.roleID = #{roleID}" +
            " GROUP BY " + "r.roleID;")
    Role getRole(int roleID);

    @Select("select bandID, bandName from band where bandID = #{roleBandId}")
    Band getBand(int roleBandId);
}
