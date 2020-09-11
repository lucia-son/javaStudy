package bookshelf;

public class ShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQ("a");
        shelfQueue.enQ("b");
        shelfQueue.enQ("c");

        System.out.println(shelfQueue.deQ());
        System.out.println(shelfQueue.deQ());
        System.out.println(shelfQueue.deQ());
        System.out.println(shelfQueue.getSize());

    }
}
