package S1;

public class S1_test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("S1.User");
        System.out.println(c1);
    }
}
class User{
    private String name;
    private int id;

    private int age;

    public User(){

    }
    public User(String name,int id,int age){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
