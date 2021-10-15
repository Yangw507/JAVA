/**
 * Name: Yang Wutao
 */

//////////////////////////define and introduce the class in java/////////////////////////////

//class Test1 {
//    public int a;
//    public static int count;
//
//}
//
//public class test {
//
//    public static void main(String[] args) {
//        Test1 t1 = new Test1();
//        t1.a++;
//        Test1.count++;
//        System.out.println(t1.a);
//        System.out.println(Test1.count);
//        System.out.println("====================");
//        Test1 t2 = new Test1();
//        t2.a++;
//        Test1.count++;
//        System.out.println(t2.a);
//        System.out.println(Test1.count);
//        System.out.println();
//
//    }
//
//}

class Student {
    private String name;
    public int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("yang wu tao");

        System.out.println(student);/////这里不是 student对象 的地址！！！！因为重新写了 Object类的 toString（）方法
        System.out.println(student.getName());
    }

}
