package ClassTestEx;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        //Object클래스의 메서드인 getClass를 사용
        //이미 생성된 인스턴스로 Class클래스를 가져올 수 있음
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("ClassTestEx.Person");
        System.out.println(pClass3.getName());
    }
}
