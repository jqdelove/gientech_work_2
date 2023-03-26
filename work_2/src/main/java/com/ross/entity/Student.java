package com.ross.entity;

import lombok.Data;

/**
 * @description: 数据
 * @author: jinqi
 * @create: 2023-03-26 09:02
 **/
@Data
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
