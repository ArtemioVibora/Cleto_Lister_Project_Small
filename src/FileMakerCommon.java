import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMakerCommon {

    private String word;
    private String sentence;
    private String meaning;
    private String book;
    private Date date;
    private String fileName;

    //Items will be stored here
    public static LinkedList<String> listOfItems = new LinkedList<>();

    public FileMakerCommon()
    {
        System.out.println("First Constructor Called");
    }

    public FileMakerCommon(String word, String sentence, String book, Date date, String meaning)
    {
        System.out.println("Second Constructor Called");
        this.word = word;
        this.sentence = sentence;
        this.meaning = meaning;
        this.book = book;
        this.date = date;
    }



    //Check if file is empty
    boolean isFileEmpty(File file)
    {
        return file.length() == 0;
    }

    public void makeFile()
    {
        File file = new File(fileName + ".simQC");
        if (file.exists())
        {

        }
    }

    String formatter(String word, String meaning, String sentence, String book, Date date) {
        StringBuilder sbFormatter = new StringBuilder();
        sbFormatter
                .append("\n")
                .append("#").append(word).append("#\n")
                .append("&").append(meaning).append("&\n")
                .append("$").append(sentence).append("$\n")
                .append("@").append(book).append("@\n")
                .append("%").append(date).append("%\n")
                .append("\n");
        return sbFormatter.toString();
    }




    //Setters and Getters

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning)
    {
        this.meaning = meaning;
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

    public String getMeaning()
    {
        return meaning;
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
