/**
 * Name: Yang Wutao
 */
import java.util.Arrays;
import java.util.Scanner;
public class test {
    //////copy array//////
    public static int[] copyArray(int[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    ////////find the max number in array
    public static int maxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {

                max = array[i];
            }
        }
        return max;
    }

    ////////binary search///////   (only ordered array)
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,8,9,13};
        System.out.println("input the number you wanna search");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = binarySearch(arr,n);
        System.out.println(n+" at the position of"+ret+"th");
    }

    public static void main2(String[] args) {
        int[] arr = {0,9,8,29,8};
        int ret = maxInArray(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = copyArray(array);
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }

}
