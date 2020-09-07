package inheritance;

public class VIPcustomer extends Customer {

    private int agentID;
    private double salesRatio;

    //상위클래스에 디폴트 생성자가 있는 경우,
    public VIPcustomer() {
        super(); //상위클래스를 가리키는 참조자 키워드, 즉  상위클래스가 먼저 메모리를 잡게 되고
        //하위클래스가 그 메모리를 사용할 수 있게 됨.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    //상위클래스에 디폴트 생성자 대신 파라미터가 있는 생성자만 있는 경우,
    //하위클래스에서도 동일하게 파라미터를 가지는 생성자를 사용함
    public VIPcustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public int getAgentID() {
        return agentID;
    }
}
