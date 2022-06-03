package controler;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.Main;


import javax.swing.*;

public class Telalogar extends cadastroController {
    public Button txtchamacadastro;
    public TextField txtemaillogar;
    public PasswordField pasword;
    public Button txtlogar;
    public TextField txtsenha;

    public void entrarranking(ActionEvent actionEvent ) {

        if (txtemaillogar.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Entre com o login");
            return;
        }if (pasword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Entre com a senha");
            return;
        }
       if (!pasword.getText().equals(txtsenha.getText())){
            JOptionPane.showMessageDialog(null,"senha  nao confere");
            return;
        }
    }
//            Main.trocaTelaPrincipal("telaprincipal");
    public void chamartelacadastrar(ActionEvent actionEvent) {

        Main.trocatela("sample");
    }
}
