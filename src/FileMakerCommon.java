import java.io.File;
import java.util.Date;
import java.io.FileReader;
import java.io.FileWriter;

public class FileMakerCommon {

    private String word;
    private String sentence;
    private String book;
    private Date date;
    private String fileName;

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

    public void makeFile()
    {
        File file = new File(fileName + ".co");
        if (file.exists())
        {

        }
    }

    //Setters and Getters

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

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public String getFileName() {
        return fileName;
    }
}
