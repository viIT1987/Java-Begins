package Advance_Java;
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);

    }
}
class M
{
    int i;
    public M(int i)
    {
        this.i=++i;
        //System.out.println(i);
    }
}
class N extends M
{
    public N(int i)
    {
        super(i);
        System.out.println(i);
    }
}


