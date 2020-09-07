package ObjectCollabo;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){ //어떤 버스를 타는지에 대한 정보를 매개변수로 활용
        bus.take(); //bus객체를 받아 그 객체의 메서드를 이용
        money -= bus.fee;
    }
    public void takeSub(Subway subway){
        subway.take();
        money -= subway.fee;
    }
    public void showInfo() {
        System.out.println("Now, " + studentName + " has " + money +" won left.");
    }
}
