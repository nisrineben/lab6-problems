package problem3;

public class Novel extends Book{
    public double price;
    public Novel( String title, String author,double price, int nbrPages, Library library) {
        super( title, author, nbrPages, library);
        this.price=price;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", Price: " + price;
    }

}
