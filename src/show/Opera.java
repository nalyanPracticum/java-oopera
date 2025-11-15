package show;

import person.Director;
import person.Person;

import java.util.Objects;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Opera opera = (Opera) o;
        return choirSize == opera.choirSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choirSize);
    }

    @Override
    public String toString() {
        return "\nOpera{" +
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                ", musicAuthor=" + musicAuthor +
                ", choirSize=" + choirSize +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}
