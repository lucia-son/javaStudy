package TemplateMethod;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Quick run");
    }

    @Override
    public void jump() {
        System.out.println("High Jump");
    }

    @Override
    public void turn() {
        System.out.println("Fast turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("** I am on Super Level **");
    }
}
