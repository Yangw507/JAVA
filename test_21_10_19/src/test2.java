/**
 * Name: Yang Wutao
 */

class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class test2 {

    public static void swap(MyValue myVal1, MyValue myVal2) {
        int tmp = myVal1.getVal();
        myVal1.setVal(myVal2.getVal());
        myVal2.setVal(tmp);
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();

        myValue1.setVal(10);
        myValue2.setVal(20);

        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }

}
