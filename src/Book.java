public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book(String bookTitle, Author author, int publishingYear){
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthor() {
        return author;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }


}
