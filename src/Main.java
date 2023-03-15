public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        account.setAccountNumber(123);
        account.setAccountBalance(5000.0);
        account.setCustomerName("Sam");
        account.setEmail("sam@gmail.com");
        account.setPhoneNumber(123456789);

        account.withdrawFundsFromAccount(8000);
        account.depositFundsIntoAccount(3000);
        account.withdrawFundsFromAccount(2000);

        System.out.println("Account balance = " + account.getAccountBalance());

    }
}
