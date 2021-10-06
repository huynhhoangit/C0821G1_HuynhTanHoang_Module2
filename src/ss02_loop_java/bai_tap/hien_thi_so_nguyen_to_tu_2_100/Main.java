package ss02_loop_java.bai_tap.hien_thi_so_nguyen_to_tu_2_100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số 1 từ bàn phím Kiểm tra số nguyên tố: ");
        int numbers = sc.nextInt();  /// số nhập vào
        if(KtSoNguyenTo(numbers)){
             System.out.println("Số Bạn Vừa Nhập Vào "+numbers+" Là Số Nguyên Tố !");
          }else {
             System.out.println("Số Bạn Vừa Nhập Vào "+numbers+" Không Phải Là Số Nguyên Tố !");
         }
        System.out.println(" Hiển Thị Số Nguyên Tố Từ 2 - 100 !");
          int N = 2 ;
        while (N < 100) {
            if (KtSoNguyenTo(N)) {
                System.out.println("Số "+N+" Là Số Nguyên Tố !");

            }
            N++;
        }

    }

    public static boolean KtSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}

