package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Człowiek {

    private final SimpleStringProperty imię;
    private final SimpleStringProperty nazwisko;
    private final SimpleIntegerProperty wiek;
    private final SimpleStringProperty wzrost;
    private final SimpleStringProperty pesel;


    public Człowiek(String i, String n, Integer wi, String wz, String p) {
        this.imię = new SimpleStringProperty(i);
        this.nazwisko = new SimpleStringProperty(n);
        this.wiek = new SimpleIntegerProperty(wi);
        this.wzrost = new SimpleStringProperty(wz);
        this.pesel = new SimpleStringProperty(p);
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

    public Integer getWiek() {

        return wiek.get();
    }

   /* public void setWiek(int wi) {

        wiek.set(wi);
    }*/

    public String getWzrost() {

        return wzrost.get();
    }

    /*public void setWzrost(int wz) {

        wzrost.set(wz);
    }
*/
    public String getPesel() {

        return pesel.get();
    }

    /*public void setPesel(int p) {

        pesel.set(p);
    }*/

}

