package TemplateMethod;

public class ClassTest {
    public static void main(String[] args) {
        Car myCar = new ManualCar();
        myCar.run();
        System.out.println("===============");
        Car yourCar = new AICar();
        myCar.run();
    }
}
