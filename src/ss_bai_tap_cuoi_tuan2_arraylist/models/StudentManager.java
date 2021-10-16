package ss_bai_tap_cuoi_tuan2_arraylist.models;

import ss_bai_tap_cuoi_tuan2_arraylist.controllers.StudentController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> studentList = new ArrayList<Student>();

    static {

        studentList.add(new Student(101, "Huỳnh Tấn A",
                "86 hoàng thi loan ", 10));
        studentList.add(new Student(102, "Huỳnh Tấn B",
                "80 phước Lý 1", 52));
        studentList.add(new Student(103, "Huỳnh Tấn C",
                "82 phước Lý 9", 89));

    }

    public void studentManager() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý Sinh Viên Trường ABC \n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list student\n" +
                    "2.\tAdd new student\n" +
                    "3.\ttEdit student \n" +
                    "4.\tReturn main menu\n");
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    StudentController.displaymenu();


            }

        }


    }

    public static void edit() {

    }


    public static void display() {

        for (Student students : studentList) {
            System.out.println(students.toString());
        }
    }

    public static void add() {
        System.out.print("Hãy nhập id Sinh Viên: ");
        int idStudent = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên Sinh Viên: ");
        String studentName = scanner.nextLine();
        System.out.print("Hãy nhập Địa Chỉ: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Hãy Nhập Điểm :");
        int studentScores = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentCode() == idStudent) {
                System.out.print("Id Sinh Viên này đã tồn tại trong danh sách. Hãy nhập lại \n");
                break;
            } else {
                studentList.add(new Student(idStudent, studentName, studentAddress, studentScores));
                break;
            }
        }
    }

}

