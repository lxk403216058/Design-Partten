package org.example.iterator;

import java.util.Iterator;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-19 15:00
 **/
public class ComputerCollege implements College {
    Department[] departments;
    //保存当前数组的对象个数

    int numberOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("php专业", "php专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numberOfDepartment] = department;
        numberOfDepartment += 1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
