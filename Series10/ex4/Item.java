package Series10.ex4;

import java.io.Serializable;

public class Item implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String itemName;
    private int amount;

    public Item(String itemName, int amount) {
        this.itemName = itemName;
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Item))
            return false;

        Item bis = (Item) obj;
        return bis.itemName.equals(this.itemName) && bis.amount == this.amount;
    }

    public Object clone() throws CloneNotSupportedException {
        Object myClone = null;
        try {
            myClone = (Item) super.clone();
        } catch (CloneNotSupportedException cnse) {
            throw new CloneNotSupportedException("Item couldn't be cloned");
        }
        return myClone;
    }

}
