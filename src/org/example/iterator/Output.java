package org.example.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-19 15:10
 **/
public class Output {
    //学院集合

    List<College> collegeList;

    public Output(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 遍历所有学院，然后嗲用printDepartment 输出各个学院的xi
     */
    public void printCollege() {
        //从collegeList  取出所有学院 ， Java中的 List 已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("-------" + college.getName() + "--------");
            printDepartment(college.createIterator());
        }
    }

    /**
     * 输出学院 输出 系
     *
     * @param iterator
     */
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
