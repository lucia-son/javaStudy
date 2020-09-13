package lambdatest;

public class StringConcatTest {
    //객체지향방식: 인터페이스-클래스로구현-클래스의 메서드 호출 사용
    public static void main(String[] args) {
        StringConcatImpl testimpl = new StringConcatImpl();
        testimpl.makeString("hello","java");

    //람다식 방식: 인터페이스 선언 - 바로 구현 및 사용
        StringConcat concat = (s1, s2) -> System.out.println(s1 +" " + s2);
        concat.makeString("hello", "java");
    }
}
