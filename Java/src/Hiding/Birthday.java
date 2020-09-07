package Hiding;

class Bday {

    //default (public,private) : 패키지 내에서 서로 접근 가능
    //public : 외부에서 다 접근 가능
    //private : 정보 은닉, 같은 파일이어도 클래스 내에서만 사용할 수 있게 됨
    private int day;
    private int month;
    private int year;

    // 데이터는 숨겼지만 퍼블릭 메서드로 오픈해주기
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2) {
            if(day <= 1 || day > 28) {
                System.out.println("Day error");
            }
        }
        else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

public class Birthday {
    public static void main(String[] args) {
        Bday day = new Bday();
        day.setYear(2018);
        day.setMonth(2);
        day.setDay(30);

        System.out.println(day.getYear() + "." + day.getMonth()+ "." + day.getDay());
    }
}
