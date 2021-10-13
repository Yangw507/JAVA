/**
 * Name: Yang Wutao
 */

public class test3 {

    //method to realize "Array.toString()"
    public static String myToString(int[] array) {
        String ret = "[";
        //System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {10,20};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);

    }
}
