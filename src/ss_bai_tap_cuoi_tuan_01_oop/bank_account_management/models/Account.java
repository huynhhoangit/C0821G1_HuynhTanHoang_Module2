package ss_bai_tap_cuoi_tuan_01_oop.bank_account_management.models;

public class Account {

    private long accountNumber;    // số tài khoản
    private String accountName;    // tên chủ tài khoản
    private double accountMoney;   // số tiền trong tài khoản
    public  static final double interestRate = 0.035;
//    private long RechargeAccount;
    public Account() {
    }

    public Account(long accountNumber, String accountName, double accountMoney) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Account(long accountNumber, String accountName ) {  // tạo tài khoản mới
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountMoney = 50 ;
    }

//    public long getRechargeAccount() {
//        return RechargeAccount;
//    }
//
//    public void setRechargeAccount(long rechargeAccount) {
//        this.RechargeAccount = rechargeAccount;
//    }



    public void setTopUpAccount(double TopUpAccount) {
       this.accountMoney = accountMoney + TopUpAccount;
    }

    public void setAccountWithdrawal(double AccountWithdrawal) {
        this.accountMoney = accountMoney - AccountWithdrawal - 3.3 ; // 3.3 là phí rút tiền
    }

    public void setExpire(double Expire) {
        this.accountMoney = accountMoney + Expire * interestRate ;
    }



    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountMoney=" + accountMoney +
                '}';
    }
}
