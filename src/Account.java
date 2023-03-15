public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

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
