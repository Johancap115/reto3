import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        FXMLLoader loader = new FXMLLoader(App.class.getResource("GUIReto3.fxml"));
        Parent ventana = (Pane) loader.load();
        Scene scene = new Scene(ventana);
        stage.setScene(scene);
        stage.setTitle("Test1");
        stage.show();
    }
}
