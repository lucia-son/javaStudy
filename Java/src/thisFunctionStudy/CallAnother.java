package thisFunctionStudy;

public class CallAnother {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name + p1.age + p1.returnSelf());
    }
}

class Person {
    String name;
    int age;

    public Person() {
        /* this.name = "이름 없음";
         this.age = 1;
        이와 같이 적는 대신 아래에서 파리미터를 받는 생성자를
        호출하여 간단히 초기화 가능*/
        //생성자에서 다른 생성자를 부를 때 this문 앞에 다른 명령문 올수없음
        //생성되지 않은 메모리에 값을 할당할 수 있음
        this("이름 없음",1);
    }
    //this가 나타내는 주소값 확인하기
    public Person returnSelf() {   //자기 자신 클래스명으로 반환형으로 잡으면
        return this;               //this는 자신의 주소값을 나타낸다
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
