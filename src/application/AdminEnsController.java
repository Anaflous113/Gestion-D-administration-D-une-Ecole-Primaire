package application;

import java.io.IOException;

import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.time.Month;

import classProjet.Enseignant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

public class AdminEnsController {
	
	
	
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
	    private Button btn7;
	    
	    @FXML
	    private Button btn8;
	    
	    @FXML
	    private Button btn9;

	    @FXML
	    private ImageView Close;
	    @FXML private Stage stage;
	    private Scene scene;
	    private Parent root;
	    
	    public void logOut(MouseEvent  event) throws IOException {
		     root = FXMLLoader.load(getClass().getResource("Choix.fxml"));
		     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		     scene = new Scene(root);
		     stage.setScene(scene);
		     stage.show();
		    }
	    public void switchToElev(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("AdminElev.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }
	    
	    public void switchToAcceuil(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("Profiladm.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }
	    
	   
	    public void switchToAjouter(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("/application/AddEns.fxml"));
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
	    private TableView<Enseignant> tableView;

		@FXML
	    private TableColumn<Enseignant, Integer> EnseignantIdColumn;
	    @FXML
	    private TableColumn<Enseignant, String> NomColumn;
	    @FXML
	    private TableColumn<Enseignant, String> PrenomColumn;
	    @FXML
	    private TableColumn<Enseignant, LocalDate> DateDeNaissanceColumn;
	    @FXML
	    private TableColumn<Enseignant, String> EmailColumn;
	    @FXML
	    private TableColumn<Enseignant, String> MatiereColumn;
		@FXML
	    private TableColumn<Enseignant, Integer> NombreAbsColumn;
	    
		public void initialize() {
	    	//set up the columns in the table
	    	EnseignantIdColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,Integer>("enseignantId"));
	    	NomColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,String>("nom"));
	    	PrenomColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,String>("prenom"));
	    	DateDeNaissanceColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,LocalDate>("dateDeNaissance"));
	    	EmailColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,String>("email"));
	    	MatiereColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,String>("matiere"));
	    	NombreAbsColumn.setCellValueFactory(new PropertyValueFactory<Enseignant,Integer>("NbrAbs"));
	    	
	    	//load some data
	    	tableView.setItems(getEnseignant());
	    }
	    
	    public ObservableList<Enseignant> getEnseignant(){
			
	    	ObservableList<Enseignant> ensei = FXCollections.observableArrayList();
	    	ensei.add(new Enseignant("hajar","ouajjani","hajarouajjani@gmail.com","math",LocalDate.of(1997, Month.FEBRUARY, 16),1,0));
	    	ensei.add(new Enseignant("nada","essalhy","nadaessalhy@gmail.com","english",LocalDate.of(1997, Month.AUGUST, 14),4,0));
	    	return ensei;
	    	
	    	
	    }
	    
	    
	    
	    public void switchToaddEns(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("AddEns.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }   
	  
}
