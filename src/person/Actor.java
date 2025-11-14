package person;

import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                Objects.equals(gender, otherActor.gender) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
