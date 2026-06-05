package Series10.ex4;

import java.io.Serializable;
import java.util.Vector;

public class Character implements Cloneable, Serializable {

    private final static long serialVersionUID = 1L;

    private String name;
    private int HP_MAX;
    private int HP_CURRENT;
    private Vector<Item> inventory;
    private Creature pet;

    public Character(String name, int HP_MAX, int HP_CURRENT, Vector<Item> inventory, Creature pet) {
        this.name = name;
        this.HP_MAX = HP_MAX;
        this.HP_CURRENT = HP_CURRENT;
        this.inventory = inventory;
        this.pet = pet;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Character))
            return false;

        Character bis = (Character) obj;

        return bis.name.equals(this.name) && bis.HP_MAX == this.HP_MAX
                && bis.HP_CURRENT == this.HP_CURRENT && bis.inventory.equals(this.inventory)
                && bis.pet.equals(this.pet);
    }

    public Object clone() throws CloneNotSupportedException {
        Character myClone = null;
        try {
            myClone = (Character) super.clone();

            // For deep cloning, we need to take care of Creature and Vector<Item>, both
            // are mutable objects.

            myClone.inventory = new Vector<Item>();
            for (int i = 0; i < this.inventory.size(); i++) {
                myClone.inventory.add((Item) this.inventory.get(i).clone());
            }

            myClone.pet = (Creature) this.pet.clone();

        } catch (CloneNotSupportedException cnse) {
            throw new CloneNotSupportedException("Unable to clone a Character");
        }
        return myClone;
    }

}
