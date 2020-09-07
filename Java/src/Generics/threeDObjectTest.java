package Generics;

public class threeDObjectTest {
    public static void main(String[] args) {
        threeDprinter<Powder> printer = new threeDprinter<Powder>();

        printer.setMaterial(new Powder());

        Powder powder = printer.getMaterial();
    }
}
