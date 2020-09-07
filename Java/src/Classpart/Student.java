package Classpart;

public class Student {
        int studentID;
        String studentName;
        Subject korean;
        Subject math;


        public Student(int id, String name) {
                studentID = id;
                studentName = name;
                korean = new Subject("국어");
                math = new Subject("수학");
        }

        public void setKorean(int score) {
                korean.setScore(score);
        }

        public void setMath(int score) {
                math.setScore(score);
        }

        public void showScore() {
                int total = korean.getScore() + math.getScore();
                System.out.println("학생" + studentID + "(" + studentName + ")" + "의 국어 성적은 " + korean.score + ", 수학 성적은" + math.score + "으로 총 점수는" + total + "입니다.");

        }
}

