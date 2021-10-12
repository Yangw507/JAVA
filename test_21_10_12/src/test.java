/**
 * Name: Yang Wutao
 */
import java.util.Scanner;

public class test {

    //method of plus
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //method of returning the max number of 3
    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int maxNum1(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 > num3) {
            return num2;
        }
        return num3;
    }

    /////////method of calculating n's factorial/////////////
    public static int fac(int x) {
        int fac = 1;
        for (int i = 0; i <= x; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int ret = maxNum(maxNum(n1, n2), n3);
        System.out.println(ret);
    }


    //假设是32位机器，打印一个数的二进制 基数位上的数 （从右往左 下标从0 开始）
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i) & i) + " ");
        }
    }

    //better way for main2
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    //判断二进制一的个数
    public static void main2(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int count = 0;
      for (int i = 0; i < 32; i++) {
          if (((n >> i) & 1) == 1) {
              count++;
          }
      }
        System.out.println(count);

    }


    public static void main1(String[] args) {
        int count = 3;
        Scanner scan = new Scanner(System.in);//只需要在这里定义一次，若放在while里，那出了while又无法使用了！

        while (count != 0) {
            System.out.println("please input your password:");
            String password = scan.nextLine();
            if (password.equals("123456")) {
                System.out.println("password correct!");
                break;
            } else {
                System.out.println("password incorrect!!");
                count--;
                System.out.println("you have "+count+" chance");
            }
        }
        int i = scan.nextInt();
        if (i == 1) {
            System.out.println("ok");
        }
    }


}
