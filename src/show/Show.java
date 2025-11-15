package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;
import java.util.Objects;

public class Show {
    protected String title;
    protected int durationInMinutes;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.durationInMinutes = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActorsList(String titleOfShow) {
        System.out.println("---".repeat(20));
        System.out.println("Список актеров в спектакле '" + titleOfShow + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor (Actor newActor, String titleOfShow) {
            if (listOfActors.contains(newActor)) {
                System.out.println("Актёр " + newActor + " уже участвует в спектакле '" + titleOfShow + "'!");
            } else {
                listOfActors.add(newActor);
                System.out.println("Актёр " + newActor + " успешно добавлен в спектакль '" + titleOfShow + "'");
            }
    }

    public void replaceActor(Actor previousActor, Actor newActor, String titleOfShow) {
        if (listOfActors.contains(previousActor)) {
            listOfActors.set(listOfActors.indexOf(previousActor), newActor);
            System.out.println("\nАктёр " + previousActor + " заменен в спектакле " + titleOfShow + " на актёра " + newActor);
        } else {
            System.out.println("\nАктёр " + previousActor + " не участвует в спектакле " + titleOfShow + "!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return durationInMinutes == show.durationInMinutes && Objects.equals(title, show.title) && Objects.equals(director, show.director) && Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, durationInMinutes, director, listOfActors);
    }

    @Override
    public String toString() {
        return "\nShow{" +
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}
