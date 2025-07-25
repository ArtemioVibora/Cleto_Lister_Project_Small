import java.util.Date;

public class FileMakerCommon {

    private String word;
    private String sentence;
    private String book;
    private Date date;

    public FileMakerCommon()
    {
        System.out.println("First Constructor Called");
    }

    public FileMakerCommon(String word, String sentence, String book, Date date)
    {
        System.out.println("Second Constructor Called");
        this.word = word;
        this.sentence = sentence;
        this.book = book;
        this.date = date;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWord() {
        return word;
    }

    public String getSentence() {
        return sentence;
    }

    public String getBook() {
        return book;
    }

    public Date getDate() {
        return date;
    }
}
