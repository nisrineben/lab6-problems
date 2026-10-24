package problem3;

public class Textbook extends Book{
    String level;
    public Textbook( String title,String level,String author, int nbrPages, Library library) {
        super( title, author, nbrPages, library);
        this.level=level;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", Level: " + level;
    }
}
