package adapterDesignPattern;

public interface BankAPIAdapter {

    public double getBalance(int accountNumber);
    public boolean addMoney(double amount);
    public boolean pay(String from, String to, int amount);
}
