package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer Lee = new Customer();
        Lee.setCustomerID(10100);
        Lee.setCustomerName("Lee Min");

        Customer Kim = new VIPcustomer(10120, "kim lang", 6500);

        System.out.println(Lee.showCustomerInfo());
        System.out.println(Kim.showCustomerInfo());
    }

}
