package schedulerEX;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {


            System.out.println("Select Distribution Method: L, R, P");

            int ch = System.in.read();
            Scheduler scheduler = null;

            if (ch == 'R' || ch == 'r') {
                scheduler = new RR();
            } else if (ch == 'L' || ch == 'l') {
                scheduler = new LeastJob();
            } else if (ch == 'P' || ch == 'p') {
                scheduler = new Priority();
            } else {
                System.out.println("NON-SUPPORTED METHOD");
            }
            scheduler.getNextCall();
            scheduler.sendCalltoAgent();

    }
}