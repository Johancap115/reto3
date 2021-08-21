
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        float[][] matrizNotas;
        int Registros;
        float acumulado = 0;
        GradingSystem sgs = new GradingSystem();
        sgs.loadData();
        Registros = Integer.parseInt(sgs.getDato());
        matrizNotas = new float[Registros][4];
        for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
                sgs.loadData();
                matrizNotas[i][j] = Float.parseFloat(sgs.getDato());
                acumulado += matrizNotas[i][3];
                sgs.setAcumulado(acumulado);
            }
        }
        sgs.setmSchoolNotas(matrizNotas);
        sgs.setPromedio(acumulado / Registros);
        sgs.resolverPreguntas();
        System.out.println(String.format("%s \n%s \n%s \n%s", sgs.stat1(), sgs.stat2(), sgs.stat3(), sgs.stat4()));
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("GUIReto3.fxml"));
        Parent ventana = (Pane) loader.load();
        Scene scene = new Scene(ventana);
        stage.setScene(scene);
        stage.setTitle("Sistema Estadistico");
        stage.show();
    }

}
