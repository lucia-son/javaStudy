package TemplateMethod;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void washcar() {};//필요에 의해 하위클래스에서 재정의 가능한 메서드:구현부 비워 일반메서드로 선언

    public void getOn() {
        System.out.println("get on car");
    }
    public void getOff() {
        System.out.println("get off car");
    }
    public final void run() { //하나의 시나리오 .하위에서 바꾸면 안된다면 final로 선언되는 '템플릿 메서드'
        getOn();
        drive();
        wiper(); //템플릿 메서드에 하나의 기능이 더 추가된다면 하위클래스에서 추가로 구현해야주어야 함
        stop();
        washcar();
        getOff();
    }
}
