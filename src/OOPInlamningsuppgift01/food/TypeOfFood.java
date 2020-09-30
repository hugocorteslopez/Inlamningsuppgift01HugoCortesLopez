package OOPInlamningsuppgift01.food;

/**
 * Created by Hugo Cortes Lopez
 * Date:    2020-09-30
 * Time:    17:31
 * Project: OOPLektion1
 */
public enum TypeOfFood {
    CAT("Cat kibble"),
    DOG("Dog kibble"),
    SNAKE("Snakepellets");

    private final String nameOfFood;

    TypeOfFood(String typeOfFood) {
        this.nameOfFood = typeOfFood;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }
}
