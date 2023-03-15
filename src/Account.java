public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account() {
        this(56789, 2.50, "Default name", "Default address",123456789);
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, int phoneNumber) {
        this(99999, 100.55, customerName, email,phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFundsIntoAccount(double amount) {

        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        accountBalance += amount;
        System.out.println("Account balance updated");
    }

    public void withdrawFundsFromAccount(double amount) {

        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("You don't have enough money");
            return;
        }
        accountBalance -= amount;
        System.out.println("Account balance updated");
    }
}
