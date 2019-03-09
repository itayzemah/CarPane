import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public interface CarPaneFinals {
	TextField carIDTF = new TextField();
	HBox carIDBox = new HBox();
	Label carIDL = new Label("מספר רישוי");
	TextField dateTF = new TextField();
	HBox dateBox = new HBox();
	Label dateL = new Label("תאריך");
	TextField chassisTF = new TextField();
	HBox chassisbox = new HBox();
	Label cahssisL = new Label("שלדה");
	TextField yearTF = new TextField();
	HBox yearBox = new HBox();
	Label yearL = new Label("עליה לכביש:  שנה");
	TextField monthTF= new TextField();
	HBox monthBox = new HBox();
	Label monthL = new Label("חודש");
	TextField dayTF = new TextField();
	HBox dayBox = new HBox();
	Label dayL = new Label("יום");
	ObservableList<String> status = FXCollections.observableArrayList("נתניה", "הרצליה", "outlet");
	ComboBox<String> statusCB = new ComboBox<>(status);
	Label statusL = new Label("סטטוס");
	ArrayList<TextField> textFields = new ArrayList<>();
	ArrayList<HBox>	hboxes = new ArrayList<>();
	ArrayList<Label> labels = new ArrayList<>();
	TextField[] tFields = new TextField[] {carIDTF,dateTF, chassisTF,yearTF,monthTF,dayTF};
	HBox[] boxes = new HBox[] {carIDBox,dateBox,chassisbox,yearBox,monthBox,dayBox};
	final double _4_5_CHARS_TF = 50;
	final double _2CHARS_TF = 30;
	
}
