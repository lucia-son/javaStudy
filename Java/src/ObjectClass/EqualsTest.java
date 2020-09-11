package ObjectClass;

class Student{
    int studentId;
    String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    //Re-define equals() method
    public boolean equals(Object obj){
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if(studentId == std.studentId)
                return true;
            else
                return false;
        } return false;
    }

    public int hashCode() {
        return studentId;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        //String class already defined "equals class"
        System.out.println((str1 == str2)); //주소값을 보고 물리적으로 확인
        System.out.println(str1.equals(str2)); //문자열이 같은지 논리적인 확인

        Student std1 = new Student(10001, "Tomas");
        Student std2 = new Student(10001, "Tomas");

        System.out.println((std1 == std2));
        System.out.println(std1.equals(std2));

        System.out.println(str1.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
    }
}
