package ss06_bai_tap_cuoi_tuan_01_oop.nhap_tt_xe;

import java.util.Arrays;
import java.util.Scanner;

public class VehicleManager {
    public static Vehicle[] vehicleList = new Vehicle[100];

    static {
        vehicleList[0] = new Vehicle("Huỳnh Tấn Hoàng", "xe máy", "HonDa", "Đỏ Đen", "HD123456", "92f1-152.6", 150, 35000, 1050);
    }

    static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Họ Và Tên chủ phương tiện: ");
        String nameOwner = scanner.nextLine();
        System.out.println("Nhập Loại Phương Tiện (xe máy hoặc oto )");
        String nameVehicle = scanner.nextLine();
        System.out.println("Nhập Nhã Hiệu Xe ");
        String brandcar = scanner.nextLine();
        System.out.println("Nhập Màu Xe ");
        String color = scanner.nextLine();
        System.out.println(" Nhập Số Máy ");
        String engineNumber = scanner.nextLine();
        System.out.println(" Nhập Biển Số Xe của Bạn ");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập Dung Tích Xe");
        int capacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Giá Xe");
        int carValue = Integer.parseInt(scanner.nextLine());
        int registrationTax;

        if (capacity < 100) {
            registrationTax = carValue * 1 / 100;
        } else if (capacity >= 100 && capacity < 200) {
            registrationTax = carValue * 3 / 100;
        } else {
            registrationTax = carValue * 5 / 100;
        }
       Vehicle vehicle = new Vehicle(nameOwner, nameVehicle, brandcar, color, engineNumber, licensePlates, capacity, carValue, registrationTax);

        for (int i = 0; i < vehicleList.length; i++) {
            if (vehicleList[i] == null) {
                vehicleList[i] = vehicle;
                break;
            }

        }
    }

    public static void displayListVehicle() {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }
}
