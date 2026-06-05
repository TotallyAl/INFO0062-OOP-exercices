package Series10.ex4;

import java.io.Serializable;

public class Creature implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String creatureName;
    private String ownerName;
    private int age;

    public Creature(String name, String owner, int age) {
        this.creatureName = name;
        this.ownerName = owner;
        this.age = age;
    }

    public String getName() {
        return this.creatureName;
    }

    public String getOwner() {
        return this.ownerName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Creature))
            return false;

        Creature bis = (Creature) obj;
        return bis.creatureName.equals(this.creatureName) && bis.ownerName.equals(this.ownerName)
                && bis.age == this.age;
    }

    public Object clone() throws CloneNotSupportedException {
        Creature myClone = null;
        try {
            myClone = (Creature) super.clone();
        } catch (CloneNotSupportedException cnse) {
            throw new CloneNotSupportedException("Couldn't clone Creature");
        }
        return myClone;
    }

}
