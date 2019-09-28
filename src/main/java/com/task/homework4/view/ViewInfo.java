package com.task.homework4.view;

import com.task.homework4.controller.MainController;
import com.task.homework4.domain.Student;

import java.util.ArrayList;

public class ViewInfo {
    MainController mainController= new MainController();
    public void run(){
        System.out.println("FindById: ");
        print(mainController.findById(1L));
        System.out.println("FindByDepartmentAndCourse: ");
        print(mainController.findByDepartmentAndCourse(7L,4));
        System.out.println("FindByDepartment: ");
        print(mainController.findByDepartment(7L));
        System.out.println("FindByGroup: ");
        print(mainController.findByGroup("IP-64"));
        System.out.println("FindByYear: ");
        print(mainController.findByYear(1920));
        System.out.println("DeleteById: ");
        print(mainController.deleteById(2L));

    }
    public  void print(ArrayList<Student> students){
        for (Student student:students) {
            print(student);
        }
    }
    public  void print(Student students){
        System.out.println(students);
    }
}
