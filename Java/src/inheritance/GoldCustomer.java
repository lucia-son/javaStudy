package inheritance;

public class GoldCustomer extends Customer {
    public GoldCustomer() {
        customerGrade = "Gold";
        bonusRatio = 0.1;
    }

    //alt+insert 단축키로 쉽게 오버라이딩 메소드 선택해오기
    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
