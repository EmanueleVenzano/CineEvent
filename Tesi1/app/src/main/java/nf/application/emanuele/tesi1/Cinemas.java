package nf.application.emanuele.tesi1;

import android.location.Location;

import java.util.ArrayList;

public class Cinemas {
    public ArrayList<Cinema> cinemas;

    public Cinemas(){
        cinemas = new ArrayList<>();
        Proiezione P1 = new Proiezione();
        P1.orario = "12:20";
        P1.sala=1;
        Film f1 = new Film();
        f1.Titolo = "Black panther";
        f1.durata = 110;
        f1.trama = "Non succede un cazzo";
        f1.immagine = "https://www.google.it/imgres?imgurl=http://t3.gstatic.com/images?q%3Dtbn:ANd9GcROpxQN-9hBpY-n0z0wE3Iq239LbbBczb2hmU6D6nGo6v-pM4iP&imgrefurl=http://t3.gstatic.com/images?q%3Dtbn:ANd9GcROpxQN-9hBpY-n0z0wE3Iq239LbbBczb2hmU6D6nGo6v-pM4iP&h=596&w=420&tbnid=7yWWCczEyrd-XM:&q=blackpanther&tbnh=186&tbnw=131&usg=AFrqEzdM8k41vViMxB7pk2FIYnA9w9niDA&vet=12ahUKEwjg0rHcqdbcAhVM6KQKHcwLD0gQ_B0wFXoECAYQCQ..i&docid=u4URfO89vjD69M&itg=1&sa=X&ved=2ahUKEwjg0rHcqdbcAhVM6KQKHcwLD0gQ_B0wFXoECAYQCQ";
        f1.proiezione.add(P1);
        Cinema c1 = new Cinema();
        c1.name = "Fiumara";
        c1.films.add(f1);
        cinemas.add(c1);
    }
}
