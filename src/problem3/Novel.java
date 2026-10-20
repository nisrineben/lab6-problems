package problem3;

public class Novel extends Book{
    public double price;
    public Novel(int numRec, String title,double price, String author, int nbrPages, Library library) {
        super(numRec, title, author, nbrPages, library);
        this.price=price;
    }
}
