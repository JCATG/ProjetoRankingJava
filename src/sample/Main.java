package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.user;

public class Main extends Application{

    private static Stage stage;
    private static Scene sample;
    private static Scene telalogar;
    private static Scene telaprincipal;
    private static Scene telaresultado;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        stage=primaryStage;
        primaryStage.setTitle("Ranking");

        Parent fxmltelalogar = FXMLLoader.load(getClass().getResource("telalogar.fxml"));
        telalogar = new Scene(fxmltelalogar,342,400);
        Parent fxmlsample = FXMLLoader.load(getClass().getResource("sample.fxml"));
        sample = new Scene(fxmlsample,342,400);
        Parent fxmltelaprincipal = FXMLLoader.load(getClass().getResource("telaprincipal.fxml"));
        telaprincipal = new Scene(fxmltelaprincipal,600,400);
        Parent fxmltelaresultado = FXMLLoader.load(getClass().getResource("telaresultado.fxml"));
        telaresultado = new Scene(fxmltelaresultado,600,400);
        primaryStage.setScene(telalogar);
        primaryStage.show();
    }

    public static void trocatela(String src){
        switch (src){
            case "sample":
                stage.setScene(sample);
                break;
            case"telalogar":

                stage.setScene(telalogar);
        }
    }
    public static void trocaTelaPrincipal(String src){
        switch (src){
            case "telaprincipal":
                stage.setScene(telaprincipal);
                break;
            case"telalogar":
                stage.setScene(telalogar);
        }
    }
    public static void exibirresultado(String src){
        switch (src){
            case"telaresultado":
                stage.setScene(telaresultado);
                break;
            case "telaprincipal":
                stage.setScene(telaprincipal);
                break;

        }
    }
    public static void voltatela(String src){
        switch (src){
            case "telalogar":
                stage.setScene(telalogar);
                break;
            case"telapincipal":
                stage.setScene(telaprincipal);
        }
    }
}
