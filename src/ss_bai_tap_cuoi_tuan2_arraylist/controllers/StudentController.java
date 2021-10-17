package ss_bai_tap_cuoi_tuan2_arraylist.controllers;

import ss_bai_tap_cuoi_tuan2_arraylist.models.Student;
import ss_bai_tap_cuoi_tuan2_arraylist.models.StudentManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    static Scanner scanner = new Scanner(System.in);



    public static void displaymenu() {
        int choice = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("1. Student Management");
            System.out.println("2. Teacher Management");
            System.out.println("3. Staff Management");
            System.out.println("4. Exit");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {

                case 1:
                    System.out.println("Student Management");
                    displayStudentManagement();
                    break;
                case 2:
                    System.out.println("Teacher Management");

                    System.out.println("Tính Năng Chưa Được Cập Nhập");
                    break;
                case 3:
                    System.out.println("Staff Management");
                 System.out.println("Tính Năng Chưa Được Cập Nhập");
                    break;

                case 4:
                    flag = false;


            }

        }

    }
    public static void displayStudentManagement(){
        boolean flag = true;
        while (flag) {
            System.out.println("1 Display list Student");
            System.out.println("2 Add new Student");
            System.out.println("3 Edit Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Search Student");
            System.out.println("6 sắp xếp điểm từ thấp  đến Cao");
            System.out.println("7 sắp xếp điểm từ cao đến thấp");
            System.out.println("8 Return main menu");

            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {

                case 1:
                    System.out.println("1 Display list Student");
                    StudentManager.display();
                    break;
                case 2:
                    System.out.println("2 Add new Student");
                    StudentManager.add();
                    break;
                case 3:
                    System.out.println("3 Edit Student");
                    StudentManager.edit();
                    break;
                case 4:
                    System.out.println("4 Delete Student");
                    StudentManager.delete();
                    break;
                case 5:
                    System.out.println("5 Search Student");
                    StudentManager.search();
                    break;
                case 6:
                    System.out.println("6 Sắp Xếp Điểm Tăng Dần");
                    StudentManager.sortAscendingToStudentScores();
                    break;
                case 7:
                    System.out.println("6 Sắp Xếp Điểm Giảm Dần");
                    StudentManager.sortDescendingToStudentScores();
                    break;
                case 8:
                    System.out.println("4 Return main menu");
                    StudentController.displaymenu();
                    break;

            }
        }

    }

    public static void main(String[] args) {
        displaymenu();
    }
}
