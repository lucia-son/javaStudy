package bookshelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public int getCount() {
        return shelf.size();
    }

}
