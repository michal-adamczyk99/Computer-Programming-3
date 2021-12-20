public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2017, "coupe");
        Bus bus = new Bus("Solaris", "Urbino", 2019, 95);
        Truck truck = new Truck("Scania", "R450", 2015, 20);
        
        car.displayDetails();
        bus.displayDetails();
        truck.displayDetails();
    }
}