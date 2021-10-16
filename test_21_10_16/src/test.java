/**
 * Name: Yang Wutao
 */


///////////introduce "this" key word /////////
class Person {

    private String name;
    private int age;

    public Person() {
        this("haha",10);
        System.out.println("Person <init>");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person <String, int>");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class test {

    public static void main(String[] args) {
        Person person = new Person();

    }

}
