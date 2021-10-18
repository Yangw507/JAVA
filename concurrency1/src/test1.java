/**
 * Name: Yang Wutao
 */


public class test1 {

    private static long count = 100_0000_0000L;

    public static void main(String[] args) {
        //serial();
        concurrency();
    }

    private static void serial() {
        long beg = System.currentTimeMillis();//获取当前时间戳

        int a = 0;
        for (long i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b++;
        }

        long end = System.currentTimeMillis();
        System.out.println("time:"+(end -beg)+"ms");
    }

    private static void concurrency() {
        long beg = System.currentTimeMillis();

        Thread t1 = new Thread() {
          public void run() {
              int a = 0;
              for (long i = 0; i < count; i++) {
                  a++;
              }
          }
        };

        Thread t2 = new Thread() {
          public void run() {
              int b = 0;
              for (long i = 0; i < count; i++) {
                  b++;
              }
          }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time:"+(end -beg)+"ms");

    }


}
