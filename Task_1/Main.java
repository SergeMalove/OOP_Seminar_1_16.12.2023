import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        Animal dog = new Dog("Барсик");
        Animal cat = new Cat("Мурзик");
        Animal bird = new Bird("Кеша");
        Animal animal = new Animal("Какое-то_Животное", 2);

        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(bird);
        list.add(animal);

        animalSpeaks(dog);
        animalSpeaks(cat);
        animalSpeaks(bird);
        animalSpeaks(animal); // Какое-то_Животное издает звук.

    }

    public static void animalSpeaks(Animal animal) {
        animal.speak();
    }
}
