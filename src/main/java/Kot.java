import java.util.Date;

/**
 * Created by Gooti on 12.09.2017.
 */
public class Kot {

    String imie;
    Date dataUrodzenia;
    Float waga;
    String imieOpiekuna;

    public String przedstawSie() {
        return "Kot to: " + imie + dataUrodzenia + waga + imieOpiekuna;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }
}
