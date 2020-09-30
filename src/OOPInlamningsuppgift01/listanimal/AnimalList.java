package OOPInlamningsuppgift01.listanimal;
import OOPInlamningsuppgift01.animal.Animal;
import OOPInlamningsuppgift01.animal.Cat;
import OOPInlamningsuppgift01.animal.Dog;
import OOPInlamningsuppgift01.animal.Snake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hugo Cortes Lopez
 * Date:    2020-09-28
 * Time:    17:09
 * Project: OOPLektion1
 */
public class AnimalList {

    // Encapsulation
    private static List<Animal> animals = new ArrayList<>();

    public static void init() {
        animals.add(new Dog("Sixten", 5));
        animals.add(new Dog("Dogge", 10));
        animals.add(new Cat("Venus", 5));
        animals.add(new Cat("Ove", 3));
        animals.add(new Snake("Hypno", 1));
    }

    public static Animal getByName(String name){
        for (var animal : animals) {
            if (animal.getName().equalsIgnoreCase(name))
                return animal;
        }
        return null;
    }
}