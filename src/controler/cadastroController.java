package controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Main;
import sample.user;

import javax.swing.*;



public class cadastroController {



    public Button txtcadastrar;
    public TextField Jtxtnome;
    public TextField txtemail;
    public TextField txtsenha;

    public void cadastraruserAction(ActionEvent actionEvent) {

        String nome = Jtxtnome.getText();
        String email = txtemail.getText();
        String senha = txtsenha.getText();

        user userA = new user(nome,email,senha);





        Main.voltatela("telalogar");

    }

    public void cancelacadastro(ActionEvent actionEvent) {

    }
}
