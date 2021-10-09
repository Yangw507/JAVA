 import java.util.Scanner;
 public class test_21_10_9 {

//estimate a year is leap year or not
 	public static void main2(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		while (scan.hasNextInt()) {
 			int year = scan.nextInt();
 			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
 				System.out.println("leap year!");
 			} else {
 			      System.out.println("not leap year!"); 
 			}
 		}
 	}

//introduce switch 
    public static void main3(String[] args) {
        int a = 1;
        switch (a) {
        	case 1: {
        		System.out.println("1");
        		break;
        	}
        	case 2: {
        		System.out.println("2");
        		break;
        	}
        	default: {
        		System.out.println("wrong number!");
        		break;
        	}
        }
    }	
//calculate factorial
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int input = scan.nextInt();
    	int sum = 0;
    	int fac = 1;
    	int i = 1;
    	while (i <= input) {
            fac *= i; 
            sum += fac;
    		i++;
    	}
    	System.out.println(sum);
    }

//introduce input method of java------------Scanner
 	public static void main1(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int a = scan.nextInt();
 		System.out.println(a);
 	}
 }