package ke.co.safaricom;

public class App {

    public static void main(String[] args) {
        Account sampleAccount = new Account();
        System.out.println(sampleAccount.getAccountBalance());
        sampleAccount.deposit(1000);
        System.out.println(sampleAccount.getAccountBalance());
        System.out.println(sampleAccount.withdraw(1000));
        System.out.println(sampleAccount.withdraw(900));
        System.out.println(sampleAccount.getAccountBalance());
    }

}