/**
 * Name: Yang Wutao
 */

//编写一个Calculator，有两个属性num1，num2，这两个数据的值，不能在定义的同时初始化，最后实现加减乘除
class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }
    public int subtraction() {
        return this.num1 - this.num2;
    }
    public int mul() {
        return this.num1 * this.num2;
    }
    public double dev() {
        return this.num1*1.0 / this.num2;
    }
}

public class test1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println(calculator.getNum1()+" add "+calculator.getNum2()+" = "+calculator.add());
    }

}
