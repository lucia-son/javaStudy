package inheritance;

public class Customer {

    protected int customerID; //상속된 클래스에게만 보이는 접근제어자 protected,
    protected String customerName; // protected는 private이지만 같은 상속 관계내에서는 public
    protected String customerGrade;
    int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        customerGrade = "silver";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade  = "silver";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo() {
        return customerName + "님 등급은 " + customerGrade + "이며, 가용 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}

