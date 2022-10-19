package Class_Objects;

import ParamConstructor.Param;

public class FindingVolume {
    public static void main(String[] args) {
        ClassObjectPractice s=new ClassObjectPractice(15,10,10);

        double S=s.vol();
        System.out.println(S);
    }
}
