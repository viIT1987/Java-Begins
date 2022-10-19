package Class_Objects;

class Box {
    double height, width, length;

    //Parameterized Method
    void set_dim(double h, double w, double l){
        height=h;
        width=w;
        length=l;
    }
    double volume(){
        return (height * width * length);
    }
}

class Box2 {
    double length, breadth;

    //Parameterized Constructor
    public Box2(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double vol(){
        return length * breadth;
    }
}

class Box_Compute {
    public static void main(String[] args) {
        Box b=new Box();
        Box2 box2=new Box2(12,25);

        b.set_dim(10,20,30);
        double v = b.volume();
        System.out.println(v);

        System.out.println(box2.vol());
    }
}
