import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Сергей", "Сергеев", Gender.MALE, 180);
        Actor actor3 = new Actor("Анна", "Петрова", Gender.FEMALE, 180);

        Director director1 = new Director("Павел", "Павлов", Gender.MALE, 8);
        Director director2 = new Director("Елена", "Краева", Gender.FEMALE, 5);

        Person musicAuthor = new Person("Эдуард", "Большой", Gender.MALE);
        Person choreographer = new Person("Елизавета", "Гибкая", Gender.FEMALE);

        String librettoTextOfNewOpera = """
                Действие происходит в Мемфисе и Фивах во времена владычества фараонов.
                В опере повествуется о несчастной любви предводителя египетских войск Радамеса и рабыни Аиды —
                дочери эфиопского царя, с войсками которого сражаются египтяне.""";
        String librettoTextOfNewBallet = """
                Принц Зигфрид празднует совершеннолетие в кругу друзей. Его мать напоминает ему, что скоро придётся
                выбирать невесту. После ухода гостей Зигфрид берёт арбалет и отправляется на охоту. На озере среди
                стаи лебедей он видит прекрасного лебедя с печальными глазами. Вдруг лебеди превращаются в девушек,
                среди них королева лебедей Одетта. Принц очарован, он клянётся ей в вечной любви.""";

        String titleNewOpera = "Опера Аида";
        String titleNewBallet = "Балет 'Лебединое озеро'";
        String titleNewShow = "Горе от ума";

        Opera newOpera = new Opera(titleNewOpera, 180, director1, musicAuthor, librettoTextOfNewOpera, 12);
        Ballet newBallet = new Ballet(titleNewOpera, 140, director2, musicAuthor, librettoTextOfNewBallet, choreographer);
        Show newShow = new Show(titleNewShow, 90, director1);

        newOpera.addNewActor(actor1, titleNewOpera);
        newOpera.addNewActor(actor2, titleNewOpera);
        newBallet.addNewActor(actor2, titleNewBallet);
        newBallet.addNewActor(actor3, titleNewBallet);
        newShow.addNewActor(actor1, titleNewShow);
        newShow.addNewActor(actor3, titleNewShow);

        // печать списков актеров
        newOpera.printActorsList(titleNewOpera);
        newBallet.printActorsList(titleNewBallet);
        newShow.printActorsList(titleNewShow);

        // замена одного актёра другим
        newShow.replaceActor(actor1, actor2, titleNewShow);
        newShow.printActorsList(titleNewShow);

        // попытка заменить неучаствующего актёра
        newShow.replaceActor(actor1, actor3, titleNewShow);
        newShow.printActorsList(titleNewShow);

        // печать либретто
        newOpera.printLibrettoText(titleNewOpera);
        newBallet.printLibrettoText(titleNewBallet);
    }
}
