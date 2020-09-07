package Singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company c1 = Company.getOnlyOne();
        Company c2 = Company.getOnlyOne();

        System.out.println(c1);
        System.out.println(c2);

        Calendar cal = Calendar.getInstance();
    }
}
