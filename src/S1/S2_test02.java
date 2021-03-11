package S1;

public class S2_test02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}
class A{
    static {
        System.out.println("A static run..");
        m = 300;
    }
    static int m = 100;
    public A(){
        System.out.println("A public run..");
    }
}
