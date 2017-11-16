package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Człowiek {

    private final SimpleStringProperty imię;
    private final SimpleStringProperty nazwisko;
    private final SimpleIntegerProperty wiek;
    private final SimpleIntegerProperty wzrost;
    private final SimpleIntegerProperty pesel;


    private Człowiek(String i, String n, int wi, int wz, int p) {
        this.imię = new SimpleStringProperty(i);
        this.nazwisko = new SimpleStringProperty(n);
        this.wiek = new SimpleIntegerProperty(wi);
        this.wzrost = new SimpleIntegerProperty(wz);
        this.pesel = new SimpleIntegerProperty(p);
        }

    public String getImię() {

        return imię.get();
    }

    public void setImię(String i) {

        imię.set(i);
    }

    public String getNazwisko() {

        return nazwisko.get();
    }

    public void setNazwisko(String n) {

        nazwisko.set(n);
    }

    public int getWiek() {

        return wiek.get();
    }

    public void setWiek(int wi) {

        wiek.set(wi);
    }

    public int getWzrost() {

        return wzrost.get();
    }

    public void setWzrost(int wz) {

        wzrost.set(wz);
    }

    public int getPesel() {

        return pesel.get();
    }

    public void setPesel(int p) {

        pesel.set(p);
    }

}

