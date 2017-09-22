/**
 * Created by Gooti on 14.09.2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interfejs {


    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
        Date date = null;

        Kot kot = new Kot();
        System.out.println("Podaj imie kota");
        kot.setImie(getUserInput());
        System.out.println("Podaj imie opiekuna");
        kot.setImieOpiekuna(getUserInput());
        System.out.println("Juz prawie wsio wiem");

        String regexData = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern patternData = Pattern.compile(regexData);


        do {
            System.out.println("Podaj date urodzenia");
            String dataUrodzenia = getUserInput();
            Matcher matcher = patternData.matcher(dataUrodzenia);
            if (matcher.matches()) {
                try {
                    kot.setDataUrodzenia(sdf.parse(dataUrodzenia));
                } catch (ParseException pe) {
                }
            } else System.out.println("Cos jest nie tak z data - poprawny format to 'dd-mm-yyyy'");
        } while (kot.getDataUrodzenia() == null);


        String regexWaga = "[0-9]{1,2}\\.[0-9]{1,2}";
        Pattern patternWaga = Pattern.compile(regexWaga);
        do {
            System.out.println("Podaj wage");
            String wagaPobrana = getUserInput();
            Matcher matcher = patternWaga.matcher(wagaPobrana);
            if (matcher.matches()) {
                try {
                    Float waga = Float.parseFloat(getUserInput());
                    kot.setWaga(waga);
                } catch (NumberFormatException nu) {
                    System.out.println("zly format");
                }

            } else System.out.println("Blad w wadze");
            System.out.println(kot.getWaga());
        } while (kot.getWaga() == null);

    }

    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }

}