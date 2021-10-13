/**
 * Name: Yang Wutao
 */


public class test {

    //Hanoi
    public static void move(char a, char b) {
        System.out.print(a+"-->"+b+" ");
    }

    public static void hanoi(int n, char start, char transi, char desti) {
        if (n == 1) {
            move(start,desti);
        } else {
            hanoi(n-1,start,desti,transi);
            move(start,desti);
            hanoi(n-1,transi,start,desti);

        }
    }
    ///////////////////////////一只青蛙一次可以跳一个或者两个台阶，请问跳上n个台阶有几种跳法？////////////////////
    public static int jump(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return jump(n - 1) + jump(n - 2);
        }
    }

    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');

    }


}
