package interfaceStudy;

public class CompleteCalc extends Calculataor {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return ERROR;
    }

    @Override
    public void description() {
        System.out.println("overriding");
    }

    public void showInfo() {
        System.out.println("Complete develop Calc!");
    }


}
