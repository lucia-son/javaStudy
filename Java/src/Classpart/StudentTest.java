package Classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student stJames = new Student(100, "James");
        stJames.setKorean(80);
        stJames.setMath(75);

        Student stMary = new Student(111, "Mary");
        stMary.setKorean(100);
        stMary.setMath(100);

        stJames.showScore();
        stMary.showScore();
    }
}
