package StaticStudy;

public class Student {

    //외부에서 이 값을 변경하면 안되기 때문에 private으로 선언
    private static int serialNum = 10000;

    //외부에서 이 값을 가져가서 보고싶다면 getter 생성하여 사용하면됨
    public static int getSerialNum() {
        return serialNum;
    }

    int studentID;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }
}
