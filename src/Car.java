public class Car {
    String color;
    String brand;
    public Car(){
    }

    public Car (String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    public String ride(String brand){
        return brand + " rides";
    }
    public String slowDown(String brand){
        return brand + " slows down";
    }

    public static void main(String[] args)
    {
        Car car1 = new Car("Red", "Audi");
        Car car2 = new Car();
        car2.color="White";
        car2.brand = "Toyota";
        Car car3 = new Car("Black", "Subaru");

        System.out.println(car1.color + " " + car1.brand);
        System.out.println(car2.color + " " + car2.brand);
        System.out.println(car3.color + " " + car3.brand);

    }
}
