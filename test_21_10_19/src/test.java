/**
 * Name: Yang Wutao
 */
import java.util.Arrays;

public class test {

    public static void func(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array1 = {9,8,7,6,5,0};
        func(array,array1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

}
