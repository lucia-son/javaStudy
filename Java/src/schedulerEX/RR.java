package schedulerEX;

public class RR implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("Round Robin");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("Send to the Next Agent");
    }
}
