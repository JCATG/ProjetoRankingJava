package controler;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import sample.Main;
import sample.listaRanking;
import sample.itensRanking;
import javax.swing.*;

public class Telaprincipal {
    listaRanking lista1 = new listaRanking();

  public TextField txttitulo;
  public TextField descricao;
  public TextField lbposicao1;
  public TextField lbposicao2;
  public TextField lbposicao3;
  public TextField lbposicao4;
  public TextField lbposicao5;

    public void criarranking(ActionEvent actionEvent) {
        String titulo=txttitulo.getText();
        String descricaotxf = descricao.getText();
        String pose1 = lbposicao1.getText();
        String pose2 = lbposicao2.getText();
        String pose3 = lbposicao3.getText();
        String pose4 = lbposicao4.getText();
        String pose5 = lbposicao5.getText();

      itensRanking k = new itensRanking(titulo,descricaotxf,pose1,pose2,pose3,pose4,pose5);
      lista1.criaRanking(k);

        JOptionPane.showMessageDialog(null,"Ranking criado");
        System.out.println(k);

        Main.exibirresultado("telaresultado");
    }

    public void voltar(ActionEvent actionEvent) {
        Main.trocaTelaPrincipal("telalogar");

    }

    public void criarposicao(ActionEvent actionEvent) {


    }
  //limpra campo ranking
    public void limpar(ActionEvent actionEvent) {
        txttitulo.setText("");
        descricao.setText("");
        lbposicao1.setText("");
        lbposicao2.setText("");
        lbposicao3.setText("");
        lbposicao4.setText("");
        lbposicao5.setText("");
    }
}
