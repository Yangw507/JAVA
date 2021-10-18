/**
 * Name: Yang Wutao
 */


public class test {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("hello world, I'm a thread");
            while (true) {

            }
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        while (true) {

        }
    }
}
