package StringTest;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        //false in that addresses are diff.

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);
        //true in that the same static pool is shared

        String str5 = new String("java");
        System.out.println(System.identityHashCode(str5));
        String str6 = new String("good");
        str5 = str5.concat(str6);
        // Now that str5 points toward Combined String("javagood" not original String("java")
        // string"java" is immutable
        System.out.println(System.identityHashCode(str5));
    }
}
