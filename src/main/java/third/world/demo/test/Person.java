package third.world.demo.test;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-16 15:15
 **/
public class Person {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return ((Person)obj).getAge().equals(((Person)obj).age);
//    }


    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setAge(12);
        p2.setAge(12);
//        p1.finalize();
        System.out.println(p1.equals(p2));
    }
}
