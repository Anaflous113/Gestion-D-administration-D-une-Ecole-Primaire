package application;

import java.io.IOException;
import java.time.LocalDate;

import classProjet.Enseignant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddEnsController {
	
	    @FXML
	    private TextField NomTextField;

	    @FXML
	    private TextField PrenomTextField;

	    @FXML
	    private TextField EmailTextField;

	    @FXML
	    private TextField DateDeNaiTextField;
	    
	    @FXML
	    private ChoiceBox<String> choiceBox;


	    @FXML
	    private ImageView Close;
	    
	    @FXML
	    private Button btn1;
	    
	    @FXML 
	    private Stage stage;
	    private Scene scene;
	    private Parent root;
	    @FXML
	    void initialize() {

	        choiceBox.getItems().add("Francais");
	        choiceBox.getItems().add("Arabe");
	        choiceBox.getItems().add("Mathematique");
	        choiceBox.getItems().add("Sport");
	        choiceBox.getItems().add("Indications islamiques");
	        
	    }

	    @FXML
	    void Close(MouseEvent mouseEvent) {
	    	Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
	        stage.close();

	    }

	    @FXML
	    void Minus(MouseEvent mouseEvent) {
	    	Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
	        stage.setIconified(true);

	    }
	    @FXML
	    void AddAction(ActionEvent event) throws IOException {
	        Enseignant ens = new Enseignant(NomTextField.getText(), PrenomTextField.getText(), EmailTextField.getText(), choiceBox.getValue(), LocalDate.parse(DateDeNaiTextField.getText()),0,0);
	       // DBClass.usersCollection.insertOne(ens);
	       switchToAdminEns(event);
	    }

	    
	    @FXML
	    public void switchToAdminEns(ActionEvent event) throws IOException {
	        root = FXMLLoader.load(getClass().getResource("/application/AdminEns.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	       }

	}

