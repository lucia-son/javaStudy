package abstractClass;

public abstract class Notebook extends Computer {
//여전히 추상메서드 하나를 가지고 있어 추상 클래스 상태
    @Override
    public void display() {
        System.out.println("Notebook Display");
    }

}
