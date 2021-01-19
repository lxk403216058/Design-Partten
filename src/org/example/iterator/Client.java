package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-19 15:18
 **/
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        Output output = new Output(collegeList);
        output.printCollege();
    }
}
