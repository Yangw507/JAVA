
public class test_21_10_8 {


//introduce (String[] args)	
	public static void main2(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("hhh");

	}

//introduce double 
    public static void main3(String[] args) {
    	double d = 12.5;
    	System.out.println(d);
    }

//introduce float
    public static void main4(String[] args) {
    	float f = 12.3f;
        System.out.println(f);
    }

//introduce char
    public static void main5(String[] args) {
        char ch = '杨';
        System.out.println(ch);
    }

//introduce byte
    public static void main6(String[] args) {
        byte d = 12; 
    }

//introduce constant
    public static void main7(String[] args) {
        final int MAX = 10;
        System.out.println(MAX);
    }

//introduce type conversion
    public static void main8(String[] args) {
        //implicit type conversion
        int a = 10;
        long b = a;//from small type to big type
        //explicit type conversion
        long c = 10L;
        int d = a;//from big type to small type
    }

//conversion of integer and character
    public static void main(String[] args) {
/*    	//convert integer to string
    	int num = 10;
    	//method 1
    	String str1 = num + "";
    	//method 2
    	String str2 = String.valueOf(num);
    	//convert string to integer*/
    	String str = "100";
    	int num = Integer.parseInt(str);
    	System.out.println(num);
    }

//long 
	public static void main1(String[] args) {
		long a = 10L;

		System.out.println(a);
		System.out.println(Long.MAX_VALUE);
	}


}