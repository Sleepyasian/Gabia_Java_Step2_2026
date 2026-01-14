public class AnimalMain_02 {

    public static void main(String[] args) {
        Animal pet[] = { new Dog(), new Cat() };

        for(Animal animal : pet){
            System.out.println(animal.kind );
            animal.breathe();
            animal.sound();
        }
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }

}
