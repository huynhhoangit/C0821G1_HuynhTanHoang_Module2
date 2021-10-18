//package ss06_inheritance_java.bai_tap.bai_tap_them;
//
//
//import java.util.Scanner;
//
//public class StudentManager {
//    public static Student[] studentList = new Student[100];
//
//
//    static {
//        studentList[0] = new Student("chanh", 18, null);
//
//
//    }
//
//    public static void add() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập  Tên : ");
//        String name = scanner.nextLine();
//        System.out.println("nhập  Tuổi : ");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập Số Nhà : ");
//        String houseNumber = scanner.nextLine();
//        System.out.println("nhập  Tên Đường : ");
//        String stress = scanner.nextLine();
//        System.out.println("nhập Tên Phường: ");
//        String ward = scanner.nextLine();
//        System.out.println("nhập Tên Quận: ");
//        String district = scanner.nextLine();
//        System.out.println("nhập  Tên TP : ");
//        String province = scanner.nextLine();
//        Address address = new Address(houseNumber, stress, ward, district, province);
//        Student student = new Student(name, age, address);
//        for (int i = 0; i < studentList.length; i++) {
//            if (studentList[i] == null) {
//                studentList[i] = student;
//
//                break;
//            }
//        }
//    }
//
//    public static void displayListStudent() {
//        for (Student student : studentList) {
//            if (student != null) {
//                System.out.println(student);
//            }
//        }
//    }
//}
