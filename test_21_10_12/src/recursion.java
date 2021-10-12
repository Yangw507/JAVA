/**
 * Name: Yang Wutao
 */
import java.util.Scanner;

public class recursion {

    //method of recursion to calculate factorial of n
    public static int fac(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fac(x - 1);
    }

    //print 1234's number one by one by recursion
    public static void print(int x) {
        if (x > 9) {
            print(x / 10);
        }
        System.out.print(x % 10 + " ");
    }

    //输入一个非负整数，返回组成它数字之和 1729 返回 1+7+2+9 = 19
    public static int func(int x) {
        int ret = 0;
        if (x > 9) {
            return (x % 10) + func(x / 10);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }


}
