public class Test4 {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 1.23);
        customer.setAccount(account);
        account.deposit(100.0);
        account.withdraw(960.0);
        account.withdraw(2000.0);
        customer.setAccount(account);
        customer.display();
    }
}
