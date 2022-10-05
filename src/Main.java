public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Ivan", "Bunin");
        Book newBook1 = new Book("Yevgeny Onegin",author1,1997);
        Book newBook2 = new Book("Caucasus",author2,1978);
        newBook2.setPublishingYear(1989);

        System.out.println(newBook2.getAuthor().getFirstName()+" "+newBook2.getAuthor().getLastName());

    }
}