package abstractClass;

public class ComputerTest {
    public static void main(String[] args) {
       //Computer c1 = new Computer();
        Computer c2 = new Desktop();
       //Computer c3 = new Notebook();
        Computer c4 = new MyNotebook();
        Notebook c5 = new MyNotebook();

        c2.display(); //Desktop Display
        c4.typing(); //myNotebook typing
        c5.display(); //Notebook Display
    }
}
