package StaticStudy;

import java.sql.SQLOutput;

public class StaticTest {
    public static void main(String[] args) {
        Student stuA = new Student();
        System.out.println(stuA.studentID);
        Student stuB = new Student();
        System.out.println(stuB.studentID);

        //static 변수 공유하는 지 확인하기
        System.out.println(stuA.getSerialNum()); //원래는 클래스명으로 메서드 호출해야함
        System.out.println(stuB.getSerialNum());
        //인스턴스 객체와 상관없이 클래스 통해 참조 가능
        System.out.println(Student.getSerialNum());
    }
}
