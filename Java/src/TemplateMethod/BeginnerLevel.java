package TemplateMethod;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Slow run");
    }

    @Override
    public void jump() {
        System.out.println("don't know how to jump");
    }

    @Override
    public void turn() {
        System.out.println("don't know how to turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" ** I am on Beginner Level ** ");
    }
}
