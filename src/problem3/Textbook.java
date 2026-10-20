package problem3;

public class Textbook extends Book{
    String level;
    public Textbook(int numRec, String title,String level,String author, int nbrPages, Library library) {
        super(numRec, title, author, nbrPages, library);
        this.level=level;
    }
}
