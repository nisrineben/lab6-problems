package problem3;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(int numRec, String title,String month,int year,Library library) {
        super(numRec, title, library);
        this.month=month;
        this.year=year;
    }
}
