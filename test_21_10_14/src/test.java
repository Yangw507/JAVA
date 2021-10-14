/**
 * Name: Yang Wutao
 */
import java.util.*;

public class test {

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean flg =false;///注意这个flg必须定义在for循环里！！！

            for (int j = 0; j < array.length - 1 - i; j++) {
                int tmp = 0;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}