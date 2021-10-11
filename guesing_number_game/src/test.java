/**
 * Name: Yang Wutao
 */
/*import java.util.Scanner;
import java.util.Random;*/
import java.util.*;

public class test {

    //
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 999999; i++) {
            while (i != 0) {
                count++;
                i = i / 10;
            }

        }
    }

    //count number include 9 within 1--100
    public static void main7(String[] args) {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i / 10 == 9) {
                count++;
            } else if (i % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    //1/1 - 1/2 + 1/3 - 1/4 ....+ 1/99 - 1/100
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        int flag = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }

    //greatest common divisor
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入两个数字");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = b;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    //print multiplication table
    public static void main4(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();

        }

    }


    //print 1--n all prime numbers
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            int j = 0;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.println(i + " is prime number");
            }
        }
    }

    //estimate prime number
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " not prime number!");
                break;
            }
        }

    }

    //guessing number game
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int randNum = random.nextInt(100);//[0,100)
        //System.out.println(randNum);

        while (true) {
            System.out.println("input the number:");
            int num = scan.nextInt();
            if (num < randNum) {
                System.out.println("小了");
            } else if (num == randNum) {
                System.out.println("right!");
                break;
            }else {
                System.out.println("大了");
            }
        }

    }
}
