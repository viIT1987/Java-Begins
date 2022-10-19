package variables;
public class VariablesPractise {
    int a,b;
    VariablesPractise(){
        a=20; b=20;
    }
    int add(){
        return a+b;
    }
    public void dance(){
        System.out.println("He can Dance:");
    }
    public static void main(String[] args) {
        VariablesPractise v=new VariablesPractise();
        v.dance();
        int a=v.add();
        System.out.println(a);
    }
}
