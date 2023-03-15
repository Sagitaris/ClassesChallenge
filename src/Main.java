public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account(12345, 1000.0,
                "Bob Brown", "myemail@bob.com",
                1234567);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        Account timsAccount = new Account("Tim", "tim@email.com", 12345);
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());

        Account account = new Account();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountBalance());
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
