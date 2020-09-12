package Generics;

public class Plastic extends Material {
    @Override
    public String toString() {
        return "This material is Plastic";
    }

    @Override
    public void doPrinting() {
        System.out.println("Printing with plastic material");
    }
}
