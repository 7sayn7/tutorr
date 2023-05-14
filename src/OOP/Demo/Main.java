package OOP.Demo;

public class Main {
    public static void main(String[] args) {
//        CardAccount cardAccount = new CardAccount();
//        cardAccount.put(100);
//        System.out.println(cardAccount.getAmount());
//        cardAccount.take(30);
//        System.out.println(cardAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(100);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(30);
        System.out.println(depositAccount.getAmount());
    }
}