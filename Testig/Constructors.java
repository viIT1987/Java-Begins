package Testig;

public class Constructors {
    int car_cost;
    String car_model;
    String car_color;

    public Constructors(int car_cost, String car_model, String car_color) {
        this.car_cost = car_cost;
        this.car_model = car_model;
        this.car_color = car_color;
    }

    void details(){
        System.out.println("Your Car Details are as follows;");
        System.out.println("Price: "+car_cost);
        System.out.println("Model: "+car_color);
        System.out.println("Color: "+car_model);
    }
}
