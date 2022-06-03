package controler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.itensRanking;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Telaresultado extends Telaprincipal{
    @FXML
    private TableView<itensRanking> txttableview;
    @FXML
    private TableColumn<itensRanking,String>txttitulotabela;
    @FXML
    private TableColumn<itensRanking,String>txtdesctabela;
    @FXML
    private TableColumn<itensRanking,String>posetable1;
    @FXML
    private TableColumn<itensRanking,String>posetable2;
    @FXML
    private TableColumn<itensRanking,String>posetable3;
    @FXML
    private TableColumn<itensRanking,String>posetable4;
    @FXML
    private TableColumn<itensRanking,String>posetable5;


}
