package ss_bai_tap_cuoi_tuan_01_oop.bank_account_management.controllers;


import ss_bai_tap_cuoi_tuan_01_oop.bank_account_management.models.AccountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("Select Menu\n" +
                    "1.Add tài khoản \n" +
                    "2.Show tài khoản\n" +
                    "3.Nạp tài khoản\n" +
                    "4.Rút tài khoản\n" +
                    "5.Tinh lãi giử tài khoản\n" +
                    "6.Chuyển Tiền \n" +
                    "7.Exti");
            System.out.print("Chọn : ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    AccountManager.add();
                    break;
                case 2:
                    AccountManager.displayListAccount();
                    break;
                case 3:
                    AccountManager.TopUpAccount();
                    break;
                case 4:
                    AccountManager.AccountWithdrawal();
                    break;
                case 5:
                    AccountManager.Expire();
                    break;
                case 6:
                    AccountManager.TransferMoney();
                    break;
                case 7:
                    System.out.println("Thank you for using our products and services (\"service\").");
                    check = false;

            }
        }
    }
}