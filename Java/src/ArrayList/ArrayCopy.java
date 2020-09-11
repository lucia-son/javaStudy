package ArrayList;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = new int[]{10, 20, 30, 40, 50};
        int[] array2 = new int[]{1, 3, 5, 7, 9};

        System.arraycopy(array1, 0, array2, 1, 3);
        for (int num : array2)
            System.out.println(num);
    }
}