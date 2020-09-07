package ArrayList;

public class BookArray {

    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("cisco", "athor");
        library[1] = new Book("yes", "bonne");
        library[2] = new Book("chocolate", "charlie");
        library[3] = new Book("hell", "demon");
        library[4] = new Book("coding", "egoing");

        for (Book book : library) {
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
