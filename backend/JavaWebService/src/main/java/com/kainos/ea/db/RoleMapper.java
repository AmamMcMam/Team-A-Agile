package com.kainos.ea.db;

import com.kainos.ea.models.Band;
import com.kainos.ea.models.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select("" +
            "SELECT r.roleID, r.roleName, r.roleDesc, r.datePosted, r.hours, r.location, r.bandID, r.capabilityId, r.link," +
            "group_concat(re.responsibility) as jobResponsibilities FROM roles r" +
            " LEFT JOIN role_responsibilities rr ON r.roleID = rr.roleId" +
            " LEFT JOIN responsibilities re ON rr.responsibilityId = re.responsibilityId WHERE r.roleID = #{roleID}" +
            " GROUP BY " + "r.roleID;")
    Role getRole(int roleID);

    @Select("select bandID, bandName, bandExpectations from band where bandID = #{roleBandId}")
    Band getBand(int roleBandId);
}
