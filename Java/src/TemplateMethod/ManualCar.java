package TemplateMethod;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("People drive");
    }

    @Override
    public void stop() {
        System.out.println("People Stop");
    }

    @Override
    public void wiper() {
        System.out.println("Manual wiper");
    }

}
