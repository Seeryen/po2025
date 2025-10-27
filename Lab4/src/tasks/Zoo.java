package tasks;

import animals.Animal;
import animals.Dog;
import animals.Parrot;
import animals.Snake;

import java.util.Random;

public class Zoo {

    private Animal[] animals = new Animal[100];

    private Random randomGenerator = new Random();

    public Zoo() {
        fillWithRandomAnimals();
    }

    static void main() {
        Zoo zoo = new Zoo();
        zoo.fillWithRandomAnimals();


    }

    public void fillWithRandomAnimals() {
        for (int i = 0; i < animals.length; i++) {
            //0 (Pies), 1 (Papuga) lub 2 (Wąż)
            int animalType = randomGenerator.nextInt(3);

            switch (animalType) {
                case 0:
                    animals[i] = new Dog("pies " + i);
                    break;
                case 1:
                    animals[i] = new Parrot("papuga " + i);
                    break;
                case 2:
                    animals[i] = new Snake("wonsz " + i);
                    break;
            }
        }
    }

    public int calculateTotalLegs() {
        int sum = 0;

        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;
    }
}