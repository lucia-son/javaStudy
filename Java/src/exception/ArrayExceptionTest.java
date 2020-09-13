package exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for(int i = 0; i <= 5; i++) {
             System.out.println(arr[i]);
            }
            } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e); //로그 남기는 부분
            //return;
        } finally {
            System.out.println("finally end");
        }
        System.out.println("end");
    }
}
