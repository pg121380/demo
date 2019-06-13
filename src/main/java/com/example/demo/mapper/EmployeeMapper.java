package com.example.demo.mapper;

import com.example.demo.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    @Select("select * from employee")
    List<Employee> getAllEmployees();

    @Select("select * from employee where eId=#{eid}")
    Employee getEmployeeById(String eid);

    @Select("select * from employee where eName like CONCAT('%',#{name},'%')")
    Employee getEmployeeByName(String name);

    @Update("update employee set eName=#{eName},postId=#{postId},age=#{age},isMarried=#{isMarried},deptId=${deptId},hireDate=#{hireDate} where eId = #{eId}")
    void updateEmployee(Employee employee);

    @Delete("delete from employee where eId=#{eId}")
    void deleteEmployeeById(String eId);

    @Insert("insert into employee values(#{eName},#{postId},#{age},#{isMarried},#{deptId},#{hireDate})")
    void addEMployee(Employee employee);
}
