package com.atguigu.studentmanagement;

import java.util.Scanner;

public class StudentView {
    Scanner sc = new Scanner(System.in);
    Student[] students = new Student[50];
    Student[] newStudents = new Student[50];
    int count = 0;

    public void start() {
        while (true) {
            System.out.println("-----------students management--------------");
            System.out.println("1 add student");
            System.out.println("2 update student");
            System.out.println("3 delete student");
            System.out.println("4 view student");
            System.out.println("5 quit");
            System.out.println("please select 1-5");
            int num = sc.nextInt();
            System.out.println("-----------------------------------");
            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    viewStudent();
                    break;
                case 5:
                    System.out.println("quit: 0 or cancel: 9");
                    int key = sc.nextInt();
                    if(key ==0){
                        System.out.println("see you next time");
                        return;
                    }
                    break;
            }
        }
    }

    private void viewStudent() {
        System.out.println("Id" + " " + "name" + " " + "age" + " " + "gender");
        if (count == 0) {
            System.out.println("No student!");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(students[i].getId() + " " + students[i].getName() + " " + students[i].getAge() + " " + students[i].getGender());
            }
        }
    }

    private void deleteStudent() {
        System.out.println("input student id to delete");
        int id = sc.nextInt();
        int idx = ArrayUtils.findIndexById(students, id, count);
        System.arraycopy(students,0,newStudents,0, idx);
        System.arraycopy(students, idx+1, newStudents, idx, students.length-idx-1);
        students = newStudents;
        count--;
        System.out.println("Deleted successfully");
    }

    private void updateStudent() {
        System.out.println("input student id to update");
        int id = sc.nextInt();
        int idx = ArrayUtils.findIndexById(students, id, count);
        if(idx==-1){
            System.out.println("student doesn't exist");
            return;
        }
        System.out.println("input student name");
        String name = sc.next();
        System.out.println("input student age");
        int age = sc.nextInt();
        System.out.println("input student gender");
        String gender = sc.next();
        Student s= new Student(id, name, age, gender);
        students[idx] = s;
        System.out.println("Updated successfully");
    }

    private void addStudent() {
        System.out.println("input student id");
        int id = sc.nextInt();
        System.out.println("input student name");
        String name = sc.next();
        System.out.println("input student age");
        int age = sc.nextInt();
        System.out.println("input student gender");
        String gender = sc.next();
        Student s = new Student(id, name, age, gender);
        students[count] = s;
        count++;
        System.out.println("student is added");
    }
}
