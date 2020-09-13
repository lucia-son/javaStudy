package exception;

public class AutoCloseable implements java.lang.AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close()");
    }
}
