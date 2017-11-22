package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import javax.swing.table.TableColumn;
import javax.xml.soap.Text;

public class Controller {
    public javafx.scene.control.TableView<Człowiek> tabelka;
    @FXML public TextField tI;
    @FXML public TextField tN;
    @FXML public TextField tWi;
    @FXML public TextField tWz;
    @FXML public TextField tP;

    public Button guzik;
    public String dupka_imie;
    public Człowiek czlek;
    public String [] lista = {"Imię", "Nazwisko","Wiek", "Wzrost", "Pesel"};


    @FXML public void handleClick(ActionEvent actionEvent) {
    tabelka.getItems().add(czlek = new Człowiek(tI.getText(), tN.getText(),Integer.parseInt(tWi.getText()), tWz.getText(), tP.getText()));
    dupka_imie = czlek.getImię();


    }
    public void initialize() {
        int licznik=0;

        for (javafx.scene.control.TableColumn<Człowiek, ?> column : tabelka.getColumns())
         {


             javafx.scene.control.TableColumn<Człowiek, String> textColumn = (javafx.scene.control.TableColumn<Człowiek, String>) column;
             if (licznik <5) {
                 textColumn.setCellValueFactory(new PropertyValueFactory<>(lista[licznik]));
                 licznik++;
             }
             else
                 textColumn.setCellValueFactory(new PropertyValueFactory<>(lista[4]));

        }
        }
}
