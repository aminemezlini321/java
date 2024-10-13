package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {

    public Aquatic(String family, String name, int age) {
        super(family, name, age, false); // Assume aquatic animals are not mammals
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic{" + super.toString() + '}';
    }
}
