package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    public Penguin(String name, int age) {
        super("Spheniscidae", name, age);
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString() + '}';
    }
}
