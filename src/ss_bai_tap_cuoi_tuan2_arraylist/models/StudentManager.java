package ss_bai_tap_cuoi_tuan2_arraylist.models;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> studentList = new ArrayList<Student>();

    static {

        studentList.add(new Student(101, "Huỳnh Tấn A",
                "86 hoàng thi loan ", 100));
        studentList.add(new Student(102, "Huỳnh Tấn B",
                "80 phước Lý 1", 52));
        studentList.add(new Student(103, "Huỳnh Tấn C",
                "82 phước Lý 9", 89));

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


    public static void edit() {
        display();
        System.out.print("Hãy nhập id của Sinh Viên cần sửa: ");
        int StudentCodeToEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentCode() == StudentCodeToEdit) {
                check = true;
                System.out.print("\t1. Sửa Tên Sinh viên \n");
                System.out.print("\t2. Sửa Địa chỉ Sinh viên \n");
                System.out.print("\t2. Sửa Điểm số sinh viên \n");
                System.out.print("Bạn muốn sửa loại gì? \n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Hãy nhập tên mới: ");
                        String newStudentName = scanner.nextLine();
                        studentList.get(i).setStudentName(newStudentName);
                        break;
                    case 2:
                        System.out.print("Hãy nhập Địa chỉ mới: ");
                        String newStudentAddress = scanner.nextLine();
                        studentList.get(i).setStudentAddress(newStudentAddress);
                        break;
                    case 3:
                        System.out.print("Hãy nhập Điểm số mới: ");
                        int newStudentScores = Integer.parseInt(scanner.nextLine());
                        studentList.get(i).setStudentScores(newStudentScores);
                        break;
                    default:
                        System.out.print("Bạn nhập lỗi. Hãy nhập lại");
                }
                break;
            }
        }
        if (!check) {
            System.out.print("Id mà bạn đã nhập không có trong danh sách. \n");
        }

    }

    public static void delete() {
        display();
        System.out.print("Hãy nhập id của sản phẩm cần xóa: ");
        int StudentCodeToDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentCode() == StudentCodeToDelete) {
                studentList.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.err.print("Id mà bạn đã nhập không có trong danh sách. \n");
        }
    }

    public static void search() {
        System.out.print("Hãy nhập Mã sinh viên cần tìm : ");
        boolean check = false;
        int StudentCodeToSearch = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentCode() == StudentCodeToSearch) {
                System.out.println(studentList.get(i).toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.err.print("Id mà bạn đã nhập không có trong danh sách. \n");
        }
    }

    public static void sortAscendingToStudentScores() {
        Collections.sort(studentList, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

                return (int) (o1.getStudentScores() - o2.getStudentScores());

            }



        });
        display();
    }
    public static void sortDescendingToStudentScores () {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getStudentScores() - o1.getStudentScores());
            }
        });
        display();
    }
}

