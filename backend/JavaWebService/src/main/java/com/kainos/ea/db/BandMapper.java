package com.kainos.ea.db;

import com.kainos.ea.models.Band;
import com.kainos.ea.models.CompetencyElement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BandMapper {

    @Select("select bandName, bandID from band;")
    List<Band> getBands();

    @Select("select competencyID, competencyName from competency")
    List<CompetencyElement> getCompetencyNames();

    @Select("select competencyElementID, competency_element.bandID, competency_element.competencyID, elementName, elementDescription, competencyName " +
            "from competency_element join band using(bandID) join competency where " +
            "band.bandID = #{compBandID} and competency.competencyID = competency_element.competencyID")
    List<CompetencyElement> getCompetencyPerBand(int compBandID);
}