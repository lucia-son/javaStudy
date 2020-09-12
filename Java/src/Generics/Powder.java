package Generics;

public class Powder extends Material{
    @Override
    public String toString() {
        return "This material is Powder";
    }

    @Override
    public void doPrinting() {
        System.out.println("Printing with Powder Material");
    }
}
