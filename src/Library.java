public class Library {
    private Book[] books;
    public Library(int size) {
        books = new Book[size];
    }
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i]==null) {
                books[i]=book;
                break;
            }
        }
    }
    public void printLibraryList() {
        for (Book book:books
             ) {
            if (book==null) {
                break;
            }
            System.out.println(book);
        }
    }
    public void changePublishingYear(String bookTitle, int publishingYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookTitle()==bookTitle) {
                books[i].setPublishingYear(publishingYear);
                break;
            }
        }

    }
    @Override
    public String toString() {
        System.out.println("Library: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            } else {
                break;
            }
        }
        return "";
    }
}
