package com.kainos.ea.db;
import com.kainos.ea.resources.JobResponsibilities;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface JobResponsibility {

    @Mapper
        @Select("select responsibilityID from roles where roleID = #{id}")
        List<JobResponsibilities> getJobResp(@Param("id") int roleID);
    }


