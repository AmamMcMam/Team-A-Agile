package com.kainos.ea.db;
import com.kainos.ea.resources.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface RolesMapper {
    @Select("select r.roleID, r.roleName, r.roleDesc, r.datePosted, r.hours, r.location, r.bandID, r.capabilityId, group_concat(rr.responsibilityId) as jobResponsibilities from roles r left join role_responsibilities rr on r.roleID = rr.roleId group by r.roleID;")
    List<Roles> viewJobRoles();

}
