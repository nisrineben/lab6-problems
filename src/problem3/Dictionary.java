package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(int numRec, String title,String language, Library library) {
        super(numRec, title, library);
        this.language=language;
    }
}
