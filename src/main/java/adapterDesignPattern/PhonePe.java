package adapterDesignPattern;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }

    double checkBalance() {
        return bankAPI.getBalance(1348302341);
    }

    boolean addMoney(double amount){
        return bankAPI.addMoney(amount);
    }
}
