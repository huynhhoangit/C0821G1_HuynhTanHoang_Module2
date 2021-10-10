package ss06_bai_tap_cuoi_tuan_01_oop.nhap_tt_xe;

import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("Select Menu\n" +
                    "1.Add Vehicle \n" +
                    "2.Show Vehicle\n" +
                    "3.Exti");
            System.out.print("Chọn : ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    VehicleManager.add();
                    break;
                case 2:
                    VehicleManager.displayListVehicle();
                    break;
                case 3:
                    System.out.println("thank you for using our products and services (\"service\").");
                    check = false ;

            }
        }
    }
}




