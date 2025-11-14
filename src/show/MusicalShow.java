package show;

import person.Director;
import person.Person;

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
}
