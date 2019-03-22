package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private int age;


    public void setStudentDetail(String id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getId(){
        return id;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()==o2.getAge())
        {
            if(o1.getName().equals(o2.getName()))
            {
                return o2.getId().compareTo(o1.getId());
            }
            else
                return  o2.getName().compareTo(o1.getName());
        }
        else
            return o2.getAge()-o1.getAge();
    }
}

class MainTest{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        List<Student> studentList = new ArrayList<>();

        student1.setStudentDetail("iit01","Deepak",22);
        studentList.add(student1);
        student2.setStudentDetail("iit029","Durgesh",22);
        studentList.add(student2);
        student3.setStudentDetail("iit03","Kislay",23);
        studentList.add(student3);
        student4.setStudentDetail("iit04", "Achintya", 25);
        studentList.add(student4);
        student5.setStudentDetail("iit05","Saurabh",24);
        studentList.add(student5);

        Collections.sort(studentList, new StudentSorter());

        for(Student std: studentList)
            System.out.println(std);

    }
}
