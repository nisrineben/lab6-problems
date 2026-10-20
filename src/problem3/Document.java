package problem3;

public class Document {
    protected int numRec=1;
    protected String title;
    protected Library library;
    public Document(String title,Library library){
        this.numRec=numRec++;
        this.title=title;
        this.library=library;
    }
}
