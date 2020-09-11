package ObjectClass;

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

class Circle implements Cloneable{
    Point point;
    private int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x,y);
        this.radius = radius;
    }

    public String toString(){
        return "원점: " + this.point + " 반지름: " + radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,4); // Create clone instance with constructor
        Circle cloneCircle = (Circle)circle.clone();   //Create clone ver.

        System.out.println(System.identityHashCode(circle)); //real address
        System.out.println(System.identityHashCode(cloneCircle)); //real address

        System.out.println(circle); //toString() ver.
        System.out.println(cloneCircle); //toString() ver.
    }
}
