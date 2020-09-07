package Singleton;
//singleton 패턴
public class Company {
    private static Company onlyOne = new Company();
    private Company() { } //외부에서 이 company 생성자를 못 쓰게 하겠다. 즉 외부에서 생성자로 객체 못 생성한다.
    public static Company getOnlyOne() { //Company객체를 생성하지 않고 메서드 부를 수 있는 방법은 statict형으로
        if(onlyOne == null) {
            onlyOne = new Company();
        }
        return onlyOne;
    }
}
