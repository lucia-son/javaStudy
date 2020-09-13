package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseable autoCloseable = new AutoCloseable();
        try(autoCloseable){
            throw new Exception(); //USED FOR EXCEPTION TEST
        } catch(Exception e) {
            System.out.println("exception");
        }
    }
}
