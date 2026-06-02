import java.util.Vector;

public class Group implements Cloneable {

    private Vector<Person> group;

    public Group() {
        group = new Vector<Person>();
    }

    public void add(Person person) {
        group.add(person);
    }

    public String toString() {
        String grpString = "";
        for (Person p : group) {
            grpString += p.toString() + " ";
        }
        return grpString;
    }

    public int hashCode() {
        int res = 0;
        for (Person p : this.group) {
            res += p.hashCode();
        }
        return res;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Group))
            return false;

        Group bis = (Group) obj;
        int size = bis.group.size();

        if (size != this.group.size())
            return false;

        for (int i = 0; i < size; i++) {
            if (!(bis.group.get(i).equals(this.group.get(i))))
                return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public Object clone() {
        Group groupClone = null;

        try {
            groupClone = (Group) super.clone(); // Shallow copy
            // Deep copy
            groupClone.group = (Vector<Person>) this.group.clone();

            for (int i = 0; i < this.group.size(); i++)
                groupClone.group.set(i, (Person) group.get(i).clone());

        } catch (CloneNotSupportedException cnse) {
            throw new InternalError("Object not cloneable");
        }

        return groupClone;
    }

}
