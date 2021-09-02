package com.kainos.ea.db;
import com.kainos.ea.resources.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface RolesMapper {

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
            "group_concat(re.responsibility) as jobResponsibilities" +
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
            " GROUP BY " +
            "r.roleID;")
    List<Role> viewJobRoles();
}
