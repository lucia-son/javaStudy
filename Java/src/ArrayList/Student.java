package ArrayList;
import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }
    public void showStudentInfo() {
        for(Subject subject : subjectList)
            System.out.println("Student "+studentName+"의"+subject.getName() + "점수는 " +subject.getScorePoint() );

    }
}
