package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    public Dolphin(String name, int age) {
        super("Delphinidae", name, age);
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin{" + super.toString() + '}';
    }
}
