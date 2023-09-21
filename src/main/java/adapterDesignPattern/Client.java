package adapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe user1 = new PhonePe(new ICICIBankAPIAdapter());
        System.out.println(user1.checkBalance());
        System.out.println(user1.addMoney(1000));
        System.out.println(user1.checkBalance());
        System.out.println(user1.addMoney(2000));
        System.out.println(user1.checkBalance());
    }
}
