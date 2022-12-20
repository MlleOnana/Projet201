package com.example.applicationnote;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class AjoutDenseignantController implements Initializable {
    static final int tel=9;
    public TextField emailEnseignant;
    public TextField telephoneEnseignant;
    ObservableList<String> departements = FXCollections.observableArrayList();
    public Button parametre;
    public Button etudiant;
    public Button utilisateur;
    public TextField nomEnseignant;
    public TextField prenomEnseignant;
    public ComboBox departement;
    public Button ajouterEnseignant;
    public Label erreurEnseignant;
    public static int code=1;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        departements.add("informatique");
        departements.add("math");
        departement.setItems(departements);
    }

    public void verifie(ActionEvent actionEvent) throws IOException {
        //String depart= departement.getValue().toString();
        if (nomEnseignant.getText().isEmpty()){
            erreurEnseignant.setText("vous ne pouvez pas enregister un enseignant sans nom");
        } else if (emailEnseignant.getText().isEmpty()) {
            erreurEnseignant.setText("nous avons besoin de l'email de l'enseignant");
        }else if (departement.getSelectionModel().getSelectedItem().toString().isEmpty()){
            erreurEnseignant.setText("veuillez choisir un departement");
        } else if(telephoneEnseignant.getText().length()!=9){
            erreurEnseignant.setText("numero de telephone invalide. il doit avoir 9 chiffres");
        }
        else {
            Professeur prof = new Professeur(String.valueOf(code),nomEnseignant.getText());
            erreurEnseignant.setText("ajout reussi");
            //ajouter dans la liste de prof

            FXMLLoader pageChoixMatiere= new FXMLLoader(AjoutDenseignantController.class.getResource("choixMatiere-view.fxml"));
            Scene choixMatiere= new Scene(pageChoixMatiere.load(), 800, 500);
            Stage stage= (Stage) ajouterEnseignant.getScene().getWindow();
            stage.setScene(choixMatiere);
            stage.setResizable(false);
            stage.setTitle("CHOIX DE MATIERE");
            stage.show();
        }
    }

    public void validation(KeyEvent keyEvent) {
       String a = keyEvent.getCharacter();
       int b;
        try{
            b = Integer.parseInt(a);
            if (b<0){
                erreurEnseignant.setText("un numero de telephone negatif n'existe pas");

            } else{
                telephoneEnseignant.autosize();
            }
        }catch (Exception e){
            erreurEnseignant.setText("entrez un numero de telephone valide");
            keyEvent.isConsumed();
        }

    }
}
