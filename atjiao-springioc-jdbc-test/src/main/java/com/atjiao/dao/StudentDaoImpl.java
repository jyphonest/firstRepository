package com.atjiao.dao;
import com.atjiao.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询全部学生数据
     * @return
     */

    public List<Student> queryAll() {

        String sql = "select id , name , account , password , phone , email , isban ,role from user ;";

        /*
          query可以返回集合!
          BeanPropertyRowMapper就是封装好RowMapper的实现,要求属性名和列名相同即可
         */
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

        return studentList;
    }
}