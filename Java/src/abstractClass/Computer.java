package abstractClass;

public abstract class Computer {
    public abstract void display(); //구현을 안하고 메서드 선언만 하겠다
    public abstract void typing();  //역시 구현부 {} 가 없기 때문에 추상메서드
    // 반환자료형과 메서드명을 보고, 어떤 파라미터를 받아 어떤 반환을 하게 되는지에 대한 추상적인 틀만 있음
    //이러한 추상 메서드는 하위 클래스에서 구현을 하게 된다

    public void turnOn() {
        System.out.println("Turn On Computer");
    }

    public void turnOff() {
        System.out.println("Turn Off Computer");
    }
}
