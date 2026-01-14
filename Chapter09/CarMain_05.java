public class CarMain_05 {

    public static void main(String[] args) {

        Car carr = new ManualCar();
        Car ca = new AICar();

        carr.run();
        ca.run();

        runcar(new ManualCar());
        runcar(new AICar());
    }
    public static void runcar(Car car){
        car.run();
    }

}
