package controler;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Main;
import sample.user;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Telalogar {
    public Button txtchamacadastro;
    public TextField txtemaillogar;
    public TextField txtsenhalogar;
    public Button txtlogar;
    //controler da tela de login



    public void entrarranking(ActionEvent actionEvent) {

     Main.trocaTelaPrincipal("telaprincipal");
    }

    public void chamartelacadastrar(ActionEvent actionEvent) {

        Main.trocatela("sample");
    }
}
