package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,String language, Library library) {
        super( title, library);
        this.language=language;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", Language: " + language;
    }
}
