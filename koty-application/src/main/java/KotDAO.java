import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comarch on 2017-09-24.
 */
public class KotDAO {

    List<Kot> koty = new ArrayList<Kot>();

    public void dodajKota(Kot kot) {
        this.koty.add(kot);
        System.out.println("Dziękuję, dodałem kota do kolekcji!");
    }

    public List<Kot> getKoty() {
        return koty;
    }

}
