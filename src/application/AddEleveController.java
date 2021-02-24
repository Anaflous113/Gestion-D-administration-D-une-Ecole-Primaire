package application;

import java.io.IOException;
import java.time.LocalDate;

import classProjet.Eleve;
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

public class AddEleveController {

    @FXML
    private ImageView Close;

    @FXML
    private TextField NomTextField;

    @FXML
    private TextField PrenomTextField;

    @FXML
    private TextField DateDeNaissanceTextField;

    @FXML
    private TextField EmailTextField;
    
    @FXML
    private ChoiceBox<String> ChoiceBox;
    
    @FXML 
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button btn1;
    
    @FXML
    void initialize() {

        ChoiceBox.getItems().add("        Cp1       ");
        ChoiceBox.getItems().add("        Cp2       ");       
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
        //Eleve eleve = new Eleve(0,0,NomTextField.getText(), PrenomTextField.getText(), EmailTextField.getText(), LocalDate.parse(DateDeNaissanceTextField.getText()),0,0,0);
       // DBClass.usersCollection.insertOne(eleve);
       switchToAdminEns(event);
    }

    
    @FXML
    public void switchToAdminEns(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/application/AdminElev.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       }

}
