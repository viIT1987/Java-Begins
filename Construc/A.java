package Construc;

public class A {
    public static void main(String[] args) {
        B b=new B();
        b.disp();
    }
}
class B{
    int a; String str; double b;
    B(){
        a=15; str="Vipin"; b=63.4;
    }
    void disp(){
        System.out.println(a);
        System.out.println(str);
        System.out.println(b);
    }
}
