package ss02_loop_java.bai_tap.hien_thi_20_so_nguyen_to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số 1 từ bàn phím để hiển thị những số nguyên tố nhỏ hơn: ");
        int numbers = sc.nextInt();  /// số nhập vào
        int N = 2;    /// tập hợp Những số nhỏ hơn số nhập vào number
        while (N <= numbers) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) { /// in ra số nguyên tố i
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}