package withArrayList;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> csList = new ArrayList<Customer>(); //customer상속받은 모든 클래스형이 들어갈 수 있는 리스트

        Customer cslee = new Customer(10010,"lee");
        Customer csson = new Customer(20020,"son");
        Customer cspark = new GoldCustomer(30030,"park");
        Customer cschew = new GoldCustomer(30040,"chew");
        Customer cshong = new VIPcustomer(30040,"hong",12345);

        csList.add(cslee);
        csList.add(csson);
        csList.add(cspark);
        csList.add(cschew);
        csList.add(cshong);

        System.out.println("-------<CS INFO>-------");
        for(Customer cs : csList)
            System.out.println(cs.showCustomerInfo());

        System.out.println("-------<Sales Ratio & Point>-------");
        int price = 10000;
        for(Customer cs : csList) {
            int cost = cs.calcPrice(price);
            System.out.println(cs.getCustomerName() + " paid : " + cost);
            System.out.println(cs.getCustomerName() + " POINT : " + cs.bonusPoint);
        }
    }

}
