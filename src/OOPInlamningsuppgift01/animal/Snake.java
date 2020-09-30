package OOPInlamningsuppgift01.animal;

import OOPInlamningsuppgift01.food.TypeOfFood;

/**
 * Created by Hugo Cortes Lopez
 * Date:    2020-09-27
 * Time:    18:08
 * Project: OOPLektion1
 */
public class Snake extends Animal{
    public Snake(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int calcFood() {
        return 20;
    }

    @Override
    public TypeOfFood getTypeOfFood() {
        return TypeOfFood.SNAKE;
    }
}