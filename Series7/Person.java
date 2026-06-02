public class Person implements Cloneable {
    private String firstname;
    private String lastname;
    private String bio;

    public Person(String firstname, String lastname, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bio = bio;
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bio = "";
    }

    public void modifyBio(String bio) {
        this.bio = bio;
    }

    public int hashCode() {
        return firstname.hashCode() + lastname.hashCode() + bio.hashCode();
    }

    public boolean equals(Object obj) {
        // If the object we are comparing isn't an instance of Person, then we stop the
        // comparison and return false.
        if (!(obj instanceof Person))
            return false;

        Person bis = (Person) obj;
        return bis.firstname.equals(this.firstname) && bis.lastname.equals(this.lastname) && bis.bio.equals(this.bio);
    }

    public String toString() {
        return firstname + " " + lastname + " " + bio;
    }

    public Object clone() {
        Person myClone = null;

        try {
            myClone = (Person) super.clone();
        } catch (CloneNotSupportedException cnse) {
            throw new InternalError("Can't clone this object");
        }

        return (Object) myClone;
    }

}
