package adapterDesignPattern;

public class AXISBankAPIAdapter implements BankAPIAdapter{

    double savings;

    @Override
    public double getBalance(int accountNumber) {
        return savings;
    }

    @Override
    public boolean addMoney(double amount) {
        savings += amount;
        return true;
    }

    @Override
    public boolean pay(String from, String to, int amount) {
        return false;
    }
}
