package Advance_Practice;

public class Overloading_Demo {
    void text(){
        System.out.println("Noparameters:");
    }

    void text(int a, int b){
        System.out.println(a+" "+b);
    }
    void text(double a){
        System.out.println("Double Value: "+a);
    }
}
class Overload {
    public static void main(String[] args) {
        Overloading_Demo ov=new Overloading_Demo();
        ov.text();
        ov.text(5,6);
        ov.text(5);
    }
}
