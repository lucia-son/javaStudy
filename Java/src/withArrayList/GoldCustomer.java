package withArrayList;

public class GoldCustomer extends Customer{
        double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName); //멤버 변수 할당은 상위클래스에서 이루어지게 된다. *
        customerGrade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }


}
