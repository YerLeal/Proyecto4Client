package proyecto4client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Window extends Application {

    private final int WIDTH = 1360;
    private final int HEIGHT = 720;
    private BorderPane pane;
    private Scene scene;
    private Canvas canvasPlayer1, canvasPlayer2;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Jueguito");
        init(primaryStage);
        primaryStage.resizableProperty().set(false);
        primaryStage.show();
    } // start

    private void init(Stage primaryStage) {
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        this.canvasPlayer1 = new Canvas(300, 300);
        primaryStage.setScene(scene);
    } // init

    public static void main(String[] args) {
//        String s = JOptionPane.showInputDialog("direc");
//        utilities.Constants.address = s;
        launch(args);
    } // main

} // end class
