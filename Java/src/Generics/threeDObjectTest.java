package Generics;


public class threeDObjectTest {
    public static void main(String[] args) {
        //타입이 대체될 곳에 문자를 쓰고, 사용할 때에는 참조형타입(클래스)을 써서 사용
        threeDprinter<Powder> printer = new threeDprinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);
        printer.doPrinting();
    // 하나의 클래스를 만들고 여러 자료형이 쓰일 수 있도록 코딩
        threeDprinter<Plastic> printer1 = new threeDprinter<Plastic>();
        printer1.setMaterial(new Plastic());
        Plastic plastic = printer1.getMaterial();
        System.out.println(printer1);
        printer1.doPrinting();

        //상속 클래스를 통한 <T> 포함 가능 자료형에 대한 제한
        /*threeDprinter<Water> printer2 = new threeDprinter<Water>();
        printer2.setMaterial(new Water());
        Water water = printer2.getMaterial();
        System.out.println(printer2);*/
    }
}
