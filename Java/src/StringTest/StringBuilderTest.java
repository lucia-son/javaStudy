package StringTest;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("JAVA");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and ");
        buffer.append(1998);
        System.out.println(System.identityHashCode(buffer));

// String 클래스는 아니기 때문에, toString()메서드를 통해서 String 값 반환
        String str2 = buffer.toString();
        System.out.println(str2);

    }
}
