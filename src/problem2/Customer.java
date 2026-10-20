package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions=new ArrayList<>();
    public Customer(String name){
        this.name=name;
    }
    public void credit(Double amount){
        transactions.add(amount);
    }
    public void debit(Double amount){
        transactions.add(-amount);
    }

    public String getName() {
        return name;
    }
    public void addTransaction(Double tr){
        transactions.add(tr);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
