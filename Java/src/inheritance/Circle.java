package inheritance;

public class Circle {
    /* private int x;
    private int y;
    */
    Point point; //has a  관계, 상속이란 무조건 가져오는 것은 아님

    private int radius;

    public Circle() {
        point = new Point();
    }
}

