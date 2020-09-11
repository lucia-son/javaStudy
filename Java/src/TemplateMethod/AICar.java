package TemplateMethod;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("Robot drives");
    }

    @Override
    public void stop() {
        System.out.println("Robot stops");
    }

    @Override
    public void wiper() {
        System.out.println("Auto wiper");
    }
}
