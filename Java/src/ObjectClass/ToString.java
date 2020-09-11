package ObjectClass;


import javax.rmi.ssl.SslRMIClientSocketFactory;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
public class ToString {
    public static void main(String[] args) {
        Book book = new Book("Home", "seventeen");
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);

    }

}
