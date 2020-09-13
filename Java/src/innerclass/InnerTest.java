package innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {  //이 안에  static은 사용할 수 없음(static:인스턴스 생성과 상관없이 호출가능하기 때문)
        int inNum = 200;
        void inTest() {
            System.out.println(num); //외부클래스 변수 사용 가능
            System.out.println(sNum);
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
    OutClass outClass = new OutClass(); //클래스 생성자를 통해 inClass가 생성
    outClass.inClass.inTest();
    OutClass.InClass inclass = outClass.new InClass();
    }
}