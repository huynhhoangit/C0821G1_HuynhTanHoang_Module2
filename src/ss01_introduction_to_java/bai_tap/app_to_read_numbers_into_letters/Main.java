package ss01_introduction_to_java.bai_tap.app_to_read_numbers_into_letters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn cần đọc: ");
        int number = sc.nextInt();
        String ChaNumber = null;
        String SChaNumber = null;
        int n1 = 0 ;
        int n2 = 0 ;

        if (number < 10) {
            switch (number) {
                case 0:
                    ChaNumber = "Không";
                    break;
                case 1:
                    ChaNumber = "Một";
                    break;
                case 2:
                    ChaNumber = "Hai";
                    break;
                case 3:
                    ChaNumber = "Ba";
                    break;
                case 4:
                    ChaNumber = "Bốn";
                    break;
                case 5:
                    ChaNumber = "Năm";
                    break;
                case 6:
                    ChaNumber = "Sáu";
                    break;
                case 7:
                    ChaNumber = "Bảy";
                    break;
                case 8:
                    ChaNumber = "Tám";
                    break;
                case 9:
                    ChaNumber = "Chín";
                    break;
            }
            System.out.printf("Đọc Số : %s ", ChaNumber);

        }else if(number<100){
            n1=number/10 ;
            n2=number%10 ;
            switch (n1) {
                case 1:
                    SChaNumber = "Mười";

                    break;
                case 2:
                    SChaNumber = "Hai Mươi";
                    break;
                case 3:
                    SChaNumber = "Ba Mươi";
                    break;
                case 4:
                    SChaNumber = "Bốn Mươi";
                    break;
                case 5:
                    SChaNumber = "Năm Mươi";
                    break;
                case 6:
                    SChaNumber = "Sáu Mươi";
                    break;
                case 7:
                    SChaNumber = "Bảy Mươi";
                    break;
                case 8:
                    SChaNumber = "Tám Mươi";
                    break;
                case 9:
                    SChaNumber = "Chín Mươi";
                    break;
            }
            switch (n2) {
                case 1:
                    ChaNumber = "Một";

                    break;
                case 2:
                    ChaNumber = "Hai";
                    break;
                case 3:
                    ChaNumber = "Ba";
                    break;
                case 4:
                    ChaNumber = "Bốn";
                    break;
                case 5:
                    ChaNumber = "Năm";
                    break;
                case 6:
                    ChaNumber = "Sáu";
                    break;
                case 7:
                    ChaNumber = "Bảy";
                    break;
                case 8:
                    ChaNumber = "Tám";
                    break;
                case 9:
                    ChaNumber = "Chín";
                    break;
                case 0:
                    ChaNumber = "";
                    break;
            }
            System.out.printf("Đọc Số :  %s %s ", SChaNumber, ChaNumber);

        }else{
            System.out.print("Vui Lòng Nhập Từ 0 Đến 100 ");
        }

    }
}
