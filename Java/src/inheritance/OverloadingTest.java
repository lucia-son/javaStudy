package inheritance;

public class OverloadingTest {
    public static void main(String[] args) {
        Customer lee = new Customer(100010, "lee");
        int price = lee.calcPrice(10000);
        System.out.println("지불금액은" + price + "이며" + lee.showCustomerInfo());

        VIPcustomer kim = new VIPcustomer(10120, "kim lang", 6500);
        price = kim.calcPrice(10000);
        System.out.println("지불금액은" + price + "이며" + kim.showCustomerInfo());

        Customer Park = new VIPcustomer(10120, "park", 6500);
        price = Park.calcPrice(10000);
        System.out.println("지불금액은" + price + "이며" + Park.showCustomerInfo());

        Customer Min = new GoldCustomer();
        price = Min.calcPrice(10000);
        System.out.println("지불금액은" + price + "이며" + Min.showCustomerInfo());
    }
}
