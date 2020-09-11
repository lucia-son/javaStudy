package schedulerEX;

public class Priority implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("Get the VIP's call");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("Send to the Best Agent");
    }
}
