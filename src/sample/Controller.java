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
    @FXML public TableColumn colI;
    @FXML public TableColumn colN;
    @FXML public TableColumn colWi;
    @FXML public TableColumn colWz;
    @FXML public TableColumn colP;
    @FXML public TableColumn colU;

    @FXML public void handleClick(ActionEvent actionEvent) {
    tabelka.getItems().add(czlek = new Człowiek(tI.getText(), "tomek"));
    dupka_imie = czlek.getImię();

    }
    public void initialize() {
        for (javafx.scene.control.TableColumn<Człowiek, ?> column : tabelka.getColumns())
         {
             javafx.scene.control.TableColumn<Człowiek, String> textColumn = (javafx.scene.control.TableColumn<Człowiek, String>) column;
             textColumn.setCellValueFactory(new PropertyValueFactory<>("dupka_imie"));
        }
        }
}
