package bookshelf;

public interface Queue {
    void enQ(String title);
    String deQ();
    int getSize();
}
