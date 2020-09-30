package OOPInlamningsuppgift01;

import OOPInlamningsuppgift01.listanimal.AnimalList;

import javax.swing.*;

/**
 * Created by Hugo Cortes Lopez
 * Date:    2020-09-28
 * Time:    17:24
 * Project: OOPLektion1
 */
public class AnimalFoodCalculator {
    public static void run() {
        // Initiate list data
        AnimalList.init();
        while (true) {

            var userInput = JOptionPane.showInputDialog(null, "Enter the name of the animal.",
                    "Animal Food Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (userInput == null)
                System.exit(0);

            var animal = AnimalList.getByName(userInput);

            if (animal == null) {
                JOptionPane.showMessageDialog(null, "No animal with that was found, please try again.",
                        "Not Found", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            //Polymorphism
            JOptionPane.showMessageDialog(null, "Name: " + animal.getName() + "\n"
                    + "Food amount: " + animal.calcFood() +"g" + "\n"
            + "Food type: " + animal.getTypeOfFood().getNameOfFood());
        }
    }
}
