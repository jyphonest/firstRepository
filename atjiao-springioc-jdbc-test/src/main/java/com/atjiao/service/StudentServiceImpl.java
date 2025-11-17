package com.atjiao.service;

import com.atjiao.dao.StudentDaoImpl;
import com.atjiao.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  {

    @Autowired
    private StudentDaoImpl studentDao;

    public List<Student> findAll() {

        List<Student> studentList =  studentDao.queryAll();

        return studentList;
    }
}