package controler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Main;
import sample.listausuarios;
import sample.user;
import javax.swing.*;

public class cadastroController{

    //criando a lista para adicionar na lista

    listausuarios listaDeUsuarios = new listausuarios();

    public Button btn_cadastrar;
    public TextField txtnome;
    public TextField txtemail;
    public TextField txtsenha;
    public TextField txtsenhaconfirma;
    public Label lbtotal;

    public void cadastraruserAction(ActionEvent actionEvent) {
        //atribuiu os campos txt a estas variaveis
      String nome = txtnome.getText();
      String email = txtemail.getText();
      String senha = txtsenha.getText();
      String confirma = txtsenhaconfirma.getText();

        if (txtnome.getText()==""){
            JOptionPane.showMessageDialog(null,"Campo nome vazio");
            return;
        }
        if(txtemail.getText()==""){
            JOptionPane.showMessageDialog(null,"Campo email vazio");
            return;
        }
        if (txtsenha.getText()==""){
            JOptionPane.showMessageDialog(null,"Campo senha vazio");
            return;
        }
        if (txtsenhaconfirma.getText()==""){
            JOptionPane.showMessageDialog(null,"Campo confirma  vazio");
            return;
        }
        if (!txtsenha.getText().equals(txtsenhaconfirma.getText())){
            JOptionPane.showMessageDialog(null,"senha  nao confere");
            return;
        }
            //criando um contato ja com as quatro informações
            user usuarios = new user(nome,email,senha,confirma);
            //adicionar o usuario "usuarios na lista"
            listaDeUsuarios.cadastracontato(usuarios);
            lbtotal.setText(listaDeUsuarios.numerocontatos());
            System.out.println("user cadastrado");
            Main.trocatela("telalogar");
            txtnome.setText("");
            txtemail.setText("");
            txtsenha.setText("");
            txtsenhaconfirma.setText("");



    }
    public void LimparCadastro(ActionEvent actionEvent) {

        txtnome.setText("");
        txtemail.setText("");
        txtsenha.setText("");
        txtsenhaconfirma.setText("");
    }
    public void voltartelalogar(ActionEvent actionEvent) {
        Main.trocaTelaPrincipal("telalogar");
    }

    public void LimparRegistro(ActionEvent actionEvent) {
        txtnome.setText("");
        txtemail.setText("");
        txtsenha.setText("");
        txtsenhaconfirma.setText("");
    }
}
/*     user u = new user();
        u.email=txtemail.toString();
        u.senha=txtsenha.toString();
        u.confirma=txtsenha1.toString();

        if (txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Entre com o email");
            return;
        }
         if (txtsenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Entre com a senha");
            return;
        }
         if(txtsenha1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Confirme sua senha");
            return;
        }
        if (!txtsenha.getText().equals(txtsenha1.getText())){
            JOptionPane.showMessageDialog(null,"senha  nao confere");
            return;
        }
        if (txtsenha.getText().equals(txtsenha1.getText())){

            JOptionPane.showMessageDialog(null,"usuario cadastrado");
            Telalogar f = new Telalogar();
            Main.trocatela("telalogar");
            System.out.println(u);

        }   */
