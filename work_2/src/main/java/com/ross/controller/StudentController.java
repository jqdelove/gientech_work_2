package com.ross.controller;

import com.ross.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 接口
 * @author: jinqi
 * @create: 2023-03-26 09:02
 **/
@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        // 假设这里从数据库或其他数据源获取学生列表数据
        students.add(new Student("张三", 18));
        students.add(new Student("李四", 19));
        return students;
    }

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Student> getStudentsAsXml() {
        List<Student> students = new ArrayList<>();
        // 假设这里从数据库或其他数据源获取学生列表数据
        students.add(new Student("张三", 18));
        students.add(new Student("李四", 19));
        return students;
    }
}

