public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Ivan", "Bunin");
        Author author3 = new Author("Nikolay", "Gogol");
        Author author4 = new Author("Nikolay", "Gogol");
        Book newBook1 = new Book("Yevgeny Onegin",author1,1997);
        Book newBook2 = new Book("Caucasus",author2,1978);
        Book newBook3 = new Book("Ruslan & Lyudmila", author1, 1888);
        Book newBook4 = new Book("Poems",author2,1910);
        Book newBook5 = new Book("Dark souls",author3,1912);
        Book newBook6 = new Book("Dark souls",author3,1912);

        newBook2.setPublishingYear(1989);

        Book [] bookArray = new Book[5];
        bookArray[0] = newBook5;
        bookArray[1] = newBook4;
        putBookInArray(newBook3, bookArray);
        putBookInArray(newBook2, bookArray);
        putBookInArray(newBook6, bookArray);
        putBookInArray(newBook5, bookArray);

        System.out.println(author1);
        System.out.println(bookArray[0]);
        System.out.println("===================================================");

        System.out.println("author 3, author 1, equals = "+author3.equals(author1));
        System.out.println("author 3, author 4, equals = "+author3.equals(author4));
        System.out.println("newBook 5, newBook 2, equals = "+newBook5.equals(newBook2));
        System.out.println("newBook 5, newBook 6, equals = "+newBook5.equals(newBook6));

        System.out.println("author 3, author 1, equals by hashCode = "+(author3.hashCode()==author1.hashCode()));
        System.out.println("author 3, author 4, equals by hashCode = "+(author3.hashCode()==author4.hashCode()));
        System.out.println("newBook 1, newBook 3, equals by hashCode = "+(newBook1.hashCode()==newBook3.hashCode()));
        System.out.println("newBook 5, newBook 6, equals by hashCode = "+(newBook5.hashCode()==newBook6.hashCode()));

        System.out.println("===========================================");

        Library library = new Library(5);
        library.addBook(newBook1);
        library.addBook(newBook2);
        library.addBook(newBook3);
        library.addBook(newBook4);
        library.addBook(newBook5);
//        library.printLibraryList();

        library.changePublishingYear("Yevgeny Onegin",1998);
        library.printLibraryList();
        System.out.println("==============================================");
        System.out.println(library);

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