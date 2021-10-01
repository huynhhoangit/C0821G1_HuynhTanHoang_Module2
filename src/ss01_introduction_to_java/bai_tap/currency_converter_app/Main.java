package ss01_introduction_to_java.bai_tap.currency_converter_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng chọn số theo thứ tự:");
        System.out.println(".1/ Chuyển Từ USD Sang VNĐ");
        System.out.println(".2/ Chuyển Từ VNĐ Sang USD");
        int choose = Integer.parseInt(scanner.nextLine());
        float exchangerate = 23;
        float USD;
        float VND;

        switch (choose) {
            case 1:
                System.out.println("Xin Vui Lòng Nhập Số Tiền Bạn Muốn Chuyển: ");
                USD = Integer.parseInt(scanner.nextLine());
                VND = USD * exchangerate;
                System.out.println("Số Tiền Quy Đổi Ngoại Tệ Là : " + VND);
                break;
            case 2:
                System.out.println("Xin Vui Lòng Nhập Số Tiền Bạn Muốn Chuyển: ");
                VND = Integer.parseInt(scanner.nextLine());
                USD = VND / exchangerate;
                System.out.println("Số Tiền Quy Đổi Ngoại Tệ Là : " + USD);
        }
    }
}
