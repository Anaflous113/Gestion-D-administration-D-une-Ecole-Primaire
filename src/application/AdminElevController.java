package application;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

import classProjet.Eleve;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AdminElevController {
	  @FXML
	    private Button btn1;

	    @FXML
	    private Button btn2;

	    @FXML
	    private Button btn3;

	    @FXML
	    private Button btn4;

	    @FXML
	    private Button btn5;

	    @FXML
	    private Button btn6;

	    @FXML
	    private ImageView Close;
	    @FXML private Stage stage;
	    private Scene scene;
	    private Parent root;
	    
	    
	    public void switchToEns(ActionEvent event) throws IOException {
	     root = FXMLLoader.load(getClass().getResource("AdminEns.fxml"));
	     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	     scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();
	    }
	    public void switchToClas(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("AdminClas.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }
	    public void switchToEmp(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("AdminEmp.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }
	    public void switchToMssg(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("AdminMssg.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }
	    @FXML
	    public void Close(MouseEvent mouseEvent) {
	        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
	        stage.close();
	    }
	    @FXML
	    public void Minus(MouseEvent mouseEvent) {
	        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
	        stage.setIconified(true);
	    }
	    
	    
	    @FXML
	    private TableView<Eleve> tableView;

	    @FXML
	    private TableColumn<Eleve, Integer> IdEColumn;

	    @FXML
	    private TableColumn<Eleve, String> NomColumn;

	    @FXML
	    private TableColumn<Eleve, String> PrenomColumn;

	    @FXML
	    private TableColumn<Eleve, LocalDate> DateDeNaissanceColumn;

	    @FXML
	    private TableColumn<Eleve, String> EmailColumn;

	    @FXML
	    private TableColumn<Eleve, Integer> NombreAbsColumn;

	    @FXML
	    private TableColumn<Eleve, Double> NoteS1Column;

	    @FXML
	    private TableColumn<Eleve, Double> NoteS2Column;

	    @FXML
	    private TableColumn<Eleve, Double> NoteTotaleColumn;
	    
	    public void initialize() {
	    	//set up the columns in the table
	    	IdEColumn.setCellValueFactory(new PropertyValueFactory<Eleve,Integer>("idE"));
	    	NomColumn.setCellValueFactory(new PropertyValueFactory<Eleve,String>("nom"));
	    	PrenomColumn.setCellValueFactory(new PropertyValueFactory<Eleve,String>("prenom"));
	    	DateDeNaissanceColumn.setCellValueFactory(new PropertyValueFactory<Eleve,LocalDate>("dateDeNaissance"));
	    	EmailColumn.setCellValueFactory(new PropertyValueFactory<Eleve,String>("email"));
	    	NombreAbsColumn.setCellValueFactory(new PropertyValueFactory<Eleve,Integer>("nombreAbs"));
	    	NoteS1Column.setCellValueFactory(new PropertyValueFactory<Eleve,Double>("noteS1"));
	    	NoteS2Column.setCellValueFactory(new PropertyValueFactory<Eleve,Double>("noteS2"));
	    	NoteTotaleColumn.setCellValueFactory(new PropertyValueFactory<Eleve,Double>("noteTotale"));
	    	//load some data
	    	tableView.setItems(getEleve());
	    }
	    
	    public ObservableList<Eleve> getEleve(){
			
	    	ObservableList<Eleve> eleve = FXCollections.observableArrayList();
	    	eleve.add(new Eleve(12,0,"hajar","ouajjani","hajarouajjani@gmail.com",LocalDate.of(1997, Month.FEBRUARY, 16),16,15.5,16));
	    	eleve.add(new Eleve(13,2,"nada","essalhy","nadaessalhy@gmail.com",LocalDate.of(1997, Month.AUGUST, 14),17,18,17.5));
	    	return eleve;
	    	
	    	
	    }
}
