package ArrayList;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookarray1 = new Book[3];
        Book[] bookarray2 = new Book[3];

        bookarray1[0] = new Book("hill","john");
        bookarray1[1] = new Book("cat","mary");
        bookarray1[2] = new Book("abc","dalson");
        System.arraycopy(bookarray1, 0,bookarray2, 0, 3);

        for(Book book : bookarray2)
            book.showBookInfo();

        bookarray1[0].setBookName("BOO");
        bookarray1[0].setAuthor("JACOBS");
        System.out.println("_________________");
        for(Book book : bookarray1)
            book.showBookInfo();
        System.out.println("_________________");
        for(Book book : bookarray2)
            book.showBookInfo();



    }

}
