package problem3;

public class Document {
    private static int count=0;
    protected int numRec;
    protected String title;
    protected Library library;
    public Document(String title,Library library){
        this.numRec=count++;
        this.title=title;
        this.library=library;
    }
    @Override
    public String toString() {
        return "Record number: " + numRec
                + ", Title: " + title;
    }
}
