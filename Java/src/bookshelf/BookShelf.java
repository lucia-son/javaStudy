package bookshelf;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQ(String title) {
        shelf.add(title); //배열 맨 뒤로 들어가는 add
    }

    @Override
    public String deQ() {
        return shelf.remove(0);  //배열 가장 첫 책 나오기
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
