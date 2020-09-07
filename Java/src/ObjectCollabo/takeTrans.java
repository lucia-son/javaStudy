package ObjectCollabo;

public class takeTrans {

    public static void main(String[] args) {
        Bus bus39 = new Bus(39, 500);
        Subway subway3 = new Subway(3,1500);
        Student han = new Student("Han", 5000);
        Student sun = new Student("Sun", 6250);

        han.takeBus(bus39);
        han.takeSub(subway3);
        han.showInfo();
        System.out.println("_________________________");
        sun.takeBus(bus39);
        sun.takeSub(subway3);
        sun.showInfo();
        System.out.println("_________________________");
        bus39.showInfo();
        System.out.println("_________________________");
        subway3.showInfo();
    }
}
