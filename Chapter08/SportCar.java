public class SportCar extends Car {

    @Override
    public void speedUp() {
        speed += 10;
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        SportCar ac = new SportCar();
        ac.speedUp();
        ac.stop();
    }

}
