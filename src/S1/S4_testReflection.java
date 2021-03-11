package S1;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class S4_testReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("S1.Student2");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        TableLu tableLu = (TableLu) c1.getAnnotation(TableLu.class);
        String value = tableLu.value();
        System.out.println(value);

        Field f = c1.getDeclaredField("age");
        FieldLu annotation = f.getAnnotation(FieldLu.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableLu{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldLu{
    String columnName();
    String type();
    int length();
}



@TableLu("db_student")
class Student2{

    @FieldLu(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldLu(columnName = "db_age",type = "int",length = 11)
    private int age;
    @FieldLu(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
