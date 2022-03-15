package Task5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double a) {
        balance = balance + a;
        return balance;
    }

    double SnyatieSoSchota(double b) {
        balance = balance - b;
        return balance;
    }
}

//class create {
//    public static void main(String[] args) {
//        BankAccount a = new BankAccount();
//        a.id = 5;
//        a.balance = 1;
//        a.popolnenieScheta(50);
//        System.out.println(a.balance);
//    }
//}

class result {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.id = 5;
        a.balance = 1;
        a.popolnenieScheta(50);
        System.out.println(a.balance);


    }


}