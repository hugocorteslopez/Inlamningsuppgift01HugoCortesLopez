package OOPInlamningsuppgift01.animal;

import OOPInlamningsuppgift01.food.IFoodConsumer;

/**
 * Created by Hugo Cortes Lopez
 * Date:    2020-09-27
 * Time:    18:08
 * Project: OOPLektion1
 */
public abstract class Animal implements IFoodConsumer {

    // Encapsulation
    protected String name;
    protected int weight;

    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
