package show;

import person.Director;
import person.Person;

import java.util.Objects;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) return false;
        Ballet ballet = (Ballet) o;
        return Objects.equals(choreographer, ballet.choreographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(choreographer);
    }

    @Override
    public String toString() {
        return "\nBallet{" +
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                ", choreographer=" + choreographer +
                ", musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}
