package problem2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    ArrayList<Customer> costumers=new ArrayList<>();
    public Bank(String name){
        this.name=name;
    }
    private boolean findCustomer(Customer customer){
        for(Customer c:costumers){
            if(c==customer)return true;
        }
        return false;
    }
    public void addCustomer(Customer customer){

        if(!findCustomer(customer))costumers.add(customer);
    }
    public boolean addTransaction(Customer customer,Double transaction) {
        for (Customer c : costumers) {
            if (c == customer) {
                c.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }
    public void printStatement(Customer customer){
        List<Double> transactions=customer.getTransactions();
        System.out.println("The costumer name : "+customer.getName());
        for(int i=0;i<transactions.toArray().length;i++){
            System.out.println("Transaction "+i+" : "+(double)transactions.get(i));
        }
    }
}
