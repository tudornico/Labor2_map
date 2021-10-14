package Labor2;

import java.util.Iterator;
import java.util.List;

public class Benutzer implements Sport {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }


    @Override
    public double kalkuliereZeit() {
        double result = 0;
        for (int i = 0; i < this.sport.size(); i++) {
            result += this.sport.get(i).kalkuliereZeit();
        }
        return result;
    }

    public double kalkuliereZeit(Sport variable) {
        double result = 0;
        for (int i = 0; i < this.sport.size(); i++) {
            if (this.sport.get(i) == variable) {
                result += this.sport.get(i).kalkuliereZeit();
            }
        }
        return result;
    }
    public double kalkuliereDurchschnittszeit(){
        double result=0,counter=0;
        for(int i=0;i<this.sport.size();i++){
            result+=this.sport.get(i).kalkuliereZeit();
            counter++;
        }
        return result/counter;
}

}
