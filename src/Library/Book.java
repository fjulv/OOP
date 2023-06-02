package Library;

public class Book extends Library{
    private String title;
    private  String author;
    private boolean available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String displayInfo(){
        return System.out.printf("Title: %s. Author: %s. Available: %b.", title, author, available).toString();
    }
}
