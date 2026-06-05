package Examples.ex2;

public class Animal {

    private static int nbAnimals = 0;
    private String name;
    private String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
        nbAnimals++;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

}
