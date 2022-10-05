public class Main {
//    static Book [] bookArray = new Book[5];
    public static void main(String[] args) {
        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Ivan", "Bunin");
        Author author3 = new Author("Nikolay", "Gogol");
        Book newBook1 = new Book("Yevgeny Onegin",author1,1997);
        Book newBook2 = new Book("Caucasus",author2,1978);
        Book newBook3 = new Book("Ruslan & Lyudmila", author1, 1888);
        Book newBook4 = new Book("Poems",author2,1910);
        Book newBook5 = new Book("Dark souls",author3,1912);

        newBook2.setPublishingYear(1989);

//        System.out.println(newBook2.getAuthor().getFirstName()+" "+newBook2.getAuthor().getLastName());
        Book [] bookArray = new Book[5];
        bookArray[0] = newBook5;
        bookArray[1] = newBook4;
//        putBookInArray(newBook1, bookArray);
        putBookInArray(newBook3, bookArray);
        putBookInArray(newBook2, bookArray);
        putBookInArray(newBook1, bookArray);
        putBookInArray(newBook5, bookArray);
        printBookArray(bookArray);

    }
    public static void putBookInArray(Book book, Book [] bookArray){

        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i]==null){
                bookArray[i]=book;
                break;
            }
        }
    }
    public static void printBookArray(Book [] bookArray){
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i]!=null){
                System.out.println(bookArray[i].getAuthor().getFirstName() + " " +
                        bookArray[i].getAuthor().getLastName() + ": " +
                        bookArray[i].getBookTitle() + ". " + bookArray[i].getPublishingYear());
            }
        }

    }
}