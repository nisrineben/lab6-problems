package problem2;

public class Main {
    public static void main(String[] args) {
        //creating 2 costumers:
        Customer c1=new Customer("Adel");
        Customer c2=new Customer("Samir");
        Bank bank=new Bank("CIH");
        c1.credit(33.0);
        c2.debit(22.0);
        c2.credit(36.0);
        c1.debit(25.0);
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addTransaction(c1,14.0);
        bank.printStatement(c1);
        bank.printStatement(c2);

    }
}
