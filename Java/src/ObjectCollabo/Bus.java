package ObjectCollabo;

public class Bus {
    int busNumber;
    int passengerCount;
    int earnMoney;
    int fee;

    public Bus(int busNumber, int fee) {
        this.busNumber = busNumber;
        this.fee = fee;
    }

    public void take() { //승객 한명을 태우면 돈이 들어올거고,
        this.passengerCount++;
        this.earnMoney += this.fee;
    }
    public void showInfo() {
        System.out.println("Passengers of Bus:" + passengerCount );
        System.out.println("Money earned by Bus" + busNumber + ": " +earnMoney);
    }
}
