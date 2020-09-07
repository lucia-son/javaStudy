package ObjectCollabo;

public class Subway {
    int lineNumber;
    int passengerCount;
    int earnMoney;
    int fee;

    public Subway(int lineNumber, int fee) {
        this.lineNumber = lineNumber;
        this.fee = fee;
    }

    public void take() { //승객 한명을 태우면 돈이 들어올거고,
        this.passengerCount++;
        this.earnMoney += this.fee;
    }
    public void showInfo() {
        System.out.println("Passengers of Subway:" + passengerCount );
        System.out.println("Money earned by Subway" + lineNumber + ": " +earnMoney);
    }
}
