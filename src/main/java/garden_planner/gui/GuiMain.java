package garden_planner.gui;

import garden_planner.model.GardenPlanner;
import garden_planner.model.RectBed;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * NOTE: Do NOT run this class in IntelliJ.  Run 'RunGui' instead.
 */
public class GuiMain extends Application {

    private GardenPlanner planner;

    public GuiMain() {
        GardenPlanner planner = new GardenPlanner();
        planner.createBasicDesign();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("garden_gui.fxml"));
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: #007700;");

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setLayoutX(200);
        rectangle.setLayoutY(100);

        Rectangle rectangleLeft = new Rectangle();
        rectangleLeft.setHeight(100);
        rectangleLeft.setWidth(50);
        rectangleLeft.setLayoutY(100);
        rectangleLeft.setLayoutX(100);

        Rectangle rectangleRight = new Rectangle();
        rectangleRight.setHeight(100);
        rectangleRight.setWidth(50);
        rectangleRight.setLayoutY(100);
        rectangleRight.setLayoutX(350);

        pane.getChildren().addAll(rectangleLeft, rectangle, rectangleRight);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void defaultLayout() {
        for (RectBed bed : planner.getBeds()) {

        }


    }

}
