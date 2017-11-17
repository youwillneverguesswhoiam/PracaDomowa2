package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.table.TableColumn;

public class Controller {
    public javafx.scene.control.TableView<Człowiek> tabelka;
    @FXML public TextField tI;
    @FXML public TextField tN;
    @FXML public TextField tWi;
    @FXML public TextField tWz;
    @FXML public TextField tP;

    public Button guzik;


    @FXML public TableColumn colI;
    @FXML public TableColumn colN;
    @FXML public TableColumn colWi;
    @FXML public TableColumn colWz;
    @FXML public TableColumn colP;
    @FXML public TableColumn colU;

    @FXML public void handleClick(ActionEvent actionEvent) {
    tabelka.getItems().add(new Człowiek("tomek", "tomek"));




    }

}
