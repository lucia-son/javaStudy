package schedulerEX;

public class LeastJob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("Least Job First");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("Send to the Least Busy Agent");
    }
}
