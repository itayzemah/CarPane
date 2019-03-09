import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class CarPane extends Application implements CarPaneFinals {
	private Stage carStage;
	private Scene carScene;
	private ArrayList<TextField> textFields;
	private ArrayList<HBox>	hboxes;
	private ArrayList<Label> labels;
//	private TextField carIDTF;
//	private HBox carIDBox;
//	private Label carIDL;
//	private TextField dateTF;
//	private HBox dateBox;
//	private Label dateL;
//	private TextField chassisTF;
//	private HBox chassisbox;
//	private Label cahssisL;
//	private TextField yearTF;
//	private HBox yearBox;
//	private Label yearL;
//	private TextField monthTF;
//	private HBox monthBox;
//	private Label monthL;
//	private TextField dayTF;
//	private HBox dayBox;
//	private Label dayL;
	@Override
	public void start(Stage primaryStage) throws Exception {
		carStage = new Stage();
		BorderPane layout = new BorderPane();
		carScene = new Scene(layout);
		carStage.setTitle("רכב");
//		createLists();
		GridPane center = new GridPane();
		enterFieldsToCenter(center);
		
		
		layout.setCenter(center);
		carStage.setScene(carScene);
		sizeOfStage();
		carStage.show();
		
	}

	private void sizeOfStage() {
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		carStage.setX(primaryScreenBounds.getMinX());
		carStage.setY(primaryScreenBounds.getMinY());
		carStage.setWidth(primaryScreenBounds.getWidth());
		carStage.setHeight(primaryScreenBounds.getHeight());
	}

	private void enterFieldsToCenter(GridPane center) {
		controlTFsize();
	center.add(combine(carIDTF,carIDL), 10, 0);
	center.add(combine(chassisTF,cahssisL), 9, 0);
	center.add(combine(dayTF,dayL),2,0);
	center.add(combine(monthTF,monthL),3,0);
	center.add(combine(yearTF,yearL),4,0);	
	
}

	private void controlTFsize() {
		yearTF.setMaxWidth(50);
		monthTF.setMaxWidth(30);
		dayTF.setMaxWidth(30);
	}

	private HBox combine(TextField textField, Label label1) {
		HBox hb = new HBox();
		hb.getChildren().addAll(textField,label1);
		hb.setSpacing(5);
		return hb;
	}

	private void createLists() {
		textFields.addAll(Arrays.asList(tFields));
		hboxes.addAll(Arrays.asList(boxes));
	
}

	public static void main(String[] args) {
		launch(args);
	}

}
