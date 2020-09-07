package ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        Student hanna = new Student(1001, "hanna");
        Student kerry = new Student(1002, "kerry");
        Student george = new Student(1003, "george");

        hanna.addSubject("korean",90);
        hanna.addSubject("math",91);
        hanna.addSubject("science",87);

        hanna.showStudentInfo();
        kerry.showStudentInfo();
        george.showStudentInfo();
    }
}
