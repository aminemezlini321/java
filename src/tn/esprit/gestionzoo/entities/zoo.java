package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class zoo {
    private final int nbrCages = 25; // Constant for maximum number of cages
    private String name;
    private String city;
    private List<Animal> animals; // Using List for dynamic size

    public zoo(String name, String city) {
        setName(name); // Use the setter to enforce non-empty name
        this.city = city;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull() && !animals.contains(animal)) {
            animals.add(animal);
            return true; // Animal added successfully
        }
        return false; // Cannot add animal
    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public boolean isZooFull() {
        return animals.size() >= nbrCages;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
        this.name = name;
    }
}

