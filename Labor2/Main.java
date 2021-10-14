package Labor2;

import Labor2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Basketball b1 = new Basketball();//55
        Basketball b2 =new Basketball();
        Fussball f1 = new Fussball();//6
        Fussball f2 = new Fussball();
        Hindernslauf h1= new Hindernslauf();//30
        Hindernslauf h2 = new Hindernslauf();
        Hochsprung hp1= new Hochsprung();//20
        Hochsprung hp2 = new Hochsprung();
        List<Sport>sport_list_1 =new ArrayList<Sport>();
        sport_list_1.add(b1);
        sport_list_1.add(b2);
        sport_list_1.add(h2);
        sport_list_1.add(hp1);

        Benutzer _b1 = new Benutzer("Tudor","Nicolaescu",sport_list_1);

                assert(_b1.kalkuliereDurchschnittszeit() == 160);
            assert (_b1.kalkuliereZeit(new Basketball()) == 110);
            assert(_b1.kalkuliereDurchschnittszeit() == 40);
    }
}
