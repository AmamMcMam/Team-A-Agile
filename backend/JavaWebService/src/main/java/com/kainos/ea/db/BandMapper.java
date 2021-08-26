package com.kainos.ea.db;

import com.kainos.ea.resources.Band;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BandMapper {
    @Select("select bandID, bandName, bandExpectations from band where bandID = #{id}")
    Band getRolePerBand(int id);
}
