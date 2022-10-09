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

    @Override public String toString(){
        return bookTitle+" by "+author.toString()+". "+publishingYear;
    }
    @Override public boolean equals(Object other) {
        if (this.getClass()!=other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return (bookTitle+author.getFirstName()+author.getLastName()+getPublishingYear()).equals(book.bookTitle+book.author.getFirstName()+book.author.getLastName()+getPublishingYear());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookTitle,author,publishingYear);
    }


}
