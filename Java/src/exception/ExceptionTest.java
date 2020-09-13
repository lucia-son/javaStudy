package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        //FileInputStream 파일을 읽어들이는 스트림
        FileInputStream fis = null ;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);;
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
