package com.kainos.ea.db;

import com.kainos.ea.resources.Band;
import com.kainos.ea.resources.CompetencyElement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BandMapper {

    @Select("select bandName from band;")
    List<Band> getBands();

    @Select("select competency_element.bandID, competency_element.competencyID, elementName, elementDescription " +
            "from competency_element join band using(bandID) join competency where band.bandID " +
            "= #{compBandID} and competency.competencyID = band.bandID")
    List<CompetencyElement> getCompetencyPerBand(int compBandID);

}
