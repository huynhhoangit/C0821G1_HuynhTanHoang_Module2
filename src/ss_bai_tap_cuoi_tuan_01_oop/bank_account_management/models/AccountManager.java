package ss_bai_tap_cuoi_tuan_01_oop.bank_account_management.models;

import java.util.Scanner;

public class AccountManager {
    public static Account[] accountList = new Account[100];

    static {
        accountList[0] = new Account(123456789, "Huỳnh Tấn Hoàng", 50);
        accountList[1] = new Account(123456999, "Huỳnh Tấn B", 150);
        accountList[2] = new Account(123456888, "Huỳnh Tấn B", 1050);
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản : ");
        long accountNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên tài khoản : ");
        String accountName = scanner.nextLine();
        System.out.println("Nhập số tài khoản : ");
        double accountMoney = Integer.parseInt(scanner.nextLine());
        Account account = new Account(accountNumber, accountName, accountMoney);
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i] == null) {
                accountList[i] = account;
                break;
            }

        }
    }

    public static void displayListAccount() {
        int index = 0;
        for (Account account : accountList) {
            if (account != null) {
                System.out.println(index++ + " " + account);

            }
        }
    }

    public static void TopUpAccount() {

        Scanner scanner = new Scanner(System.in);
        displayListAccount();
        System.out.println("Chọn số Thứ Tự Cần Nạp Tiền ");
        int chooseAccount = Integer.parseInt(scanner.nextLine());
        Account account = accountList[chooseAccount];
        System.out.println("nhập số tiền bạn cần nạp");
        boolean check = true;
        while (check) {
            int TopUpAcc = Integer.parseInt(scanner.nextLine());
            if (TopUpAcc < 0) {
                System.out.println(" Bạn Đã nhập sai số tiền cần nạp");
                System.out.println(" Vui lòng nhập lại số tiền bạn cần nạp ");
            } else {
                account.setTopUpAccount(TopUpAcc);
                System.out.println(" Bạn Đã nạp " + TopUpAcc + "$ Thành công vào tài khoản : " + account.getAccountNumber());
                displayListAccount();
                check = false;
            }

        }
    }

    public static void AccountWithdrawal() {
        Scanner scanner = new Scanner(System.in);
        displayListAccount();
        System.out.println("Chọn số Thứ Tự Cần Rút Tiền ");
        int chooseAccount = Integer.parseInt(scanner.nextLine());
        Account account = accountList[chooseAccount];
        System.out.println("Nhập số tiền bạn cần Rút");
        double balance = account.getAccountMoney();
        boolean check = true;
        while (check) {
            int WithdrawalAcc = Integer.parseInt(scanner.nextLine());
            if (WithdrawalAcc > balance) {
                System.out.println(" Bạn Đã Số Tiền Muốn Rút Nhiều Hơn Số Dư trong Tài khoản :");
                System.out.println(" Vui lòng nhập lại số tiền bạn cần Rút ");
            } else {
                account.setAccountWithdrawal(WithdrawalAcc);
                System.out.println(" Bạn Đã Rút Thành công " + WithdrawalAcc + "$ trong tài khoản : " + account.getAccountNumber());
                displayListAccount();
                check = false;
            }

        }

    }

    public static void Expire() {
        Scanner scanner = new Scanner(System.in);
        displayListAccount();
        System.out.println("Chọn số Thứ Tự tài khoản cần giử tiết kiệm ");
        int chooseAccount = Integer.parseInt(scanner.nextLine());
        Account account = accountList[chooseAccount];
        double balance = account.getAccountMoney();
        account.setExpire(balance);
        System.out.println(" Số Tiền Sau Khi Đáo hạn  " + account.getAccountMoney() + "$ trong tài khoản : " + account.getAccountNumber());
        displayListAccount();
    }

    public static void TransferMoney() {
        Scanner scanner = new Scanner(System.in);
        displayListAccount();
        System.out.println("Chọn số Thứ Tự tài khoản cần chuyển tiền ");
        int chooseAccountsend = Integer.parseInt(scanner.nextLine());
        Account accountsend = accountList[chooseAccountsend];
        double balanceAccount = accountsend.getAccountMoney();
        System.out.println("Nhập số tiền cần chuyển :");
        boolean checkbbalance = true;
        do {
            double balancesend = Integer.parseInt(scanner.nextLine());
            if (balancesend > balanceAccount) {
                System.out.println(" Bạn Đã Số Tiền Muốn chuyển Nhiều Hơn Số Dư trong Tài khoản :");
                System.out.println(" Vui lòng nhập lại số tiền bạn cần chuyển ");
                checkbbalance = true;
            } else {
                displayListAccount();
                boolean checkAccount;
                do {
                    System.out.println("Chọn số Thứ Tự tài khoản cần chuyển tiền ");
                    int chooseAccountget = Integer.parseInt(scanner.nextLine());
                    Account accountget = accountList[chooseAccountget];
                    double balanceAccountget = accountget.getAccountMoney();
                    if (chooseAccountget == chooseAccountsend) {
                        System.out.println("Bạn Không thể chuyển tiền cho tài khoản của chính bạn");
                        System.out.println("Vui lòng chọn lại tài khoản khác :");
                        checkAccount = true;
                    } else {
                        accountsend.setAccountMoney(balanceAccount - balancesend);
                        accountget.setAccountMoney(balanceAccountget + balancesend);
                        System.out.println("Bạn Đã chuyển Thành Công " + balancesend + "$ từ " +
                                accountsend.getAccountNumber() + " Đến Tài khoản : " + accountget.getAccountNumber());
                        displayListAccount();
                        checkAccount = false;
                    }
                } while (checkAccount);
                checkbbalance = false;
            }
        } while (checkbbalance);

    }
}



