package com.kainos.ea.db;
import com.kainos.ea.resources.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface TestMapper {
    @Select("select firstname from testTable")
    List<User> findAllUsers();
}
