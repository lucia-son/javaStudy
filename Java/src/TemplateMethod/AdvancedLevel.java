package TemplateMethod;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Fast run");
    }

    @Override
    public void jump() {
        System.out.println("Low Jump");
    }

    @Override
    public void turn() {
        System.out.println("don't know turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("** I am on Advanced Level **");
    }
}
