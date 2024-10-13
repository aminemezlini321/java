package tn.esprit.gestionzoo.entities.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.zoo;

public class main {
    public static void main(String[] args) {
        // Create an animal
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Create a zoo
        zoo myZoo = new zoo("Wildlife Sanctuary", "Cityville");

        // Display zoo info
        myZoo.displayZoo();

        // Add the lion to the zoo
        if (myZoo.addAnimal(lion)) {
            System.out.println(lion.getName() + " has been added to the zoo.");
        } else {
            System.out.println("Failed to add " + lion.getName() + " to the zoo.");
        }

        // Display animals in the zoo
        System.out.println("Animals in the zoo:");
        myZoo.displayAnimals();

        // Attempt to add the same animal again
        if (myZoo.addAnimal(lion)) {
            System.out.println(lion.getName() + " has been added to the zoo again.");
        } else {
            System.out.println("Failed to add " + lion.getName() + " again (already exists).");
        }

        // Add more animals
        for (int i = 1; i <= 25; i++) {
            Animal anotherLion = new Animal("Felidae", "Lion" + i, 3, true);
            if (!myZoo.addAnimal(anotherLion)) {
                System.out.println("Zoo is full or animal already exists: " + anotherLion.getName());
            }
        }

        // Display all animals in the zoo
        System.out.println("Final list of animals in the zoo:");
        myZoo.displayAnimals();
    }
}
