/**
 * Created by Gooti on 14.09.2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interfejs {


    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        Date date = null;

        Kot kot = new Kot();
        System.out.println("Podaj imie kota");
        kot.setImie(getUserInput());
        System.out.println("Podaj imie opiekuna");
        kot.setImieOpiekuna(getUserInput());
        System.out.println("Juz prawie wsio wiem");
        do {
            System.out.println("Podaj date urodzenia");
            try {
                kot.setDataUrodzenia(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Cos jest nie tak z data");
            }
        } while (kot.getDataUrodzenia() == null);

        do {
            kot.setDataUrodzenia(date);
            System.out.println("Podaj wage");

            try {
                Float waga = Float.parseFloat(getUserInput());
                kot.setWaga(waga);
            } catch (NumberFormatException nu) {
                System.out.println("Blad w numerze");
            }
        } while (kot.getWaga() == null);
    }

    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }

}
