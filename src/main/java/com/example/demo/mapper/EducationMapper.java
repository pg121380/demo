package com.example.demo.mapper;

import com.example.demo.bean.Education;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EducationMapper {

    @Select("select * from education")
    List<Education> getAllEducations();

    @Select("select * from education where eId=#{eId}")
    Education getEducationById(String eId);

    @Insert("insert into education values(#{eId},#{major},#{background},#{graduateDate},#{school},#{school},#{foreignLang})")
    void addEducation(Education education);

    @Delete("delete from education where eId=#{eId}")
    void deleteEducationById(String eId);

    @Update("update education set major=#{major},background=#{background},graduateDate=#{graduateDate},school=#{school},foreignLang=#{foreignLang}")
    void updateEducation(Education education);
}
