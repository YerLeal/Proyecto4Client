package proyecto4client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Window extends Application {

    private final int WIDTH = 1360;
    private final int HEIGHT = 720;
    private BorderPane pane;
    private Scene scene;
    private HBox hBox;
    private Canvas canvasPlayer1, canvasPlayer2;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Jueguito");
        init(primaryStage);
        primaryStage.resizableProperty().set(false);
        primaryStage.show();
    } // start

    private void init(Stage primaryStage) {
        this.hBox = new HBox();
        this.pane = new BorderPane();
        this.canvasPlayer1 = new Canvas(550, 500);
        this.canvasPlayer2 = new Canvas(550, 500);
        GraphicsContext gc = canvasPlayer1.getGraphicsContext2D();
        draw(gc);
        GraphicsContext gc1 = canvasPlayer2.getGraphicsContext2D();
        draw(gc1);
        this.hBox.getChildren().add(canvasPlayer1);
        this.hBox.getChildren().add(canvasPlayer2);
        this.pane.setCenter(hBox);
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
    } // init
    
    public void draw(GraphicsContext gc){
        gc.fillRect(549, 0, 10, 500);
        gc.fillRect(0 , 449, 550, 500);
    }

    public static void main(String[] args) {
//        String s = JOptionPane.showInputDialog("direc");
//        utilities.Constants.address = s;
        launch(args);
    } // main

} // end class
