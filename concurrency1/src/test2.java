/**
 * Name: Yang Wutao
 */


public class test2 {
    /////////////////////创建线程（Thread）的 方式

    public static void main(String[] args) {
        //1.显示继承Thread类
        //2.通过匿名内部类的方式继承Thread
//        Thread t = new Thread() {
//            public void run() {
//
//            }
//        };
//        t.start();

        //3.显示创建一个类，实现Runnable 接口， 再把Runnable的实例并联到Thread实例上

        //4.通过匿名内部类来实现Runnable接口

        //5.使用lambda表达式来指定线程执行内容
        Thread t = new Thread(() -> {
            System.out.println("this is thread");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("this is also a thread");
        });
        t.start();
        t2.start();
    }

}
