package ss02_loop_java.thuc_hanh.ung_dung_cho_vai_tien_lai;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
       System.out.println("Nhập Số Tiền Đầu Tư: ");
        money = input.nextDouble();
        System.out.println("Nhập Số Tháng Bạn Muốn Đầu Tư: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Total of interest: " + totalInterest);
        }
    }
}
