package show;

import person.Director;
import person.Person;

import java.util.Objects;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(String titleOfShow) {
        System.out.println("*".repeat(10));
        System.out.println("Либретто спектакля " + titleOfShow + ":");
        System.out.println(librettoText);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthor, that.musicAuthor) && Objects.equals(librettoText, that.librettoText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicAuthor, librettoText);
    }

    @Override
    public String toString() {
        return "\nMusicalShow{" +
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                ", musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}
