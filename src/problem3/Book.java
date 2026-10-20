package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    public Book(String title,String author,int nbrPages,Library library) {
        super(title, library);
        this.author=author;
        this.nbrPages=nbrPages;
    }

    public Book() {
    }
}
