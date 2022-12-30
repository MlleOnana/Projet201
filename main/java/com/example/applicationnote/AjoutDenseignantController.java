package com.example.applicationnote;

import javafx.collections.FXCollections;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class AjoutDenseignantController{
    static final int tel=9;
    public TextField emailEnseignant;
    public TextField telephoneEnseignant;
    ObservableList<String> departements = FXCollections.observableArrayList();
    public Button parametre;
    public Button etudiant;
    public Button utilisateur;
    public TextField nomEnseignant;
    public TextField prenomEnseignant;
    public Button ajouterEnseignant;
    public Label erreurEnseignant;
    public static int code=1000;
    public Button retourB;
    Connection connection= ConnexionData.getConnection();



    public void verifie(ActionEvent actionEvent) throws IOException {
        code+=1;
        String nom= nomEnseignant.getText()+" "+prenomEnseignant.getText();
        String email= emailEnseignant.getText();
        int tel= Integer.parseInt(telephoneEnseignant.getText());
        String mot= "faculteSciences";
        if (nomEnseignant.getText().isEmpty()){
            erreurEnseignant.setText("vous ne pouvez pas enregister un enseignant sans nom");
        } else if (emailEnseignant.getText().isEmpty()) {
            erreurEnseignant.setText("nous avons besoin de l'email de l'enseignant");
        } else if (!email.contains("@") || !email.contains(".")) {
            erreurEnseignant.setText("email invalide");
        } else if (telephoneEnseignant.getText().length() != 9) {
            erreurEnseignant.setText("numero de telephone invalide. il doit avoir 9 chiffres");
        } else {
            try {
                String requete = "INSERT INTO professeur(prof_code,prof_nom,prof_telephone,prof_email,prof_mot_passe) VALUES(?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(requete);
                statement.setInt(1, code);
                statement.setString(2, nom);
                statement.setInt(3, tel);
                statement.setString(4, email);
                statement.setString(5, mot);
                statement.executeUpdate();
                statement.close();

                FXMLLoader pageChoixMatiere = new FXMLLoader(AjoutDenseignantController.class.getResource("choixMatiere-view.fxml"));
                Scene choixMatiere = new Scene(pageChoixMatiere.load(), 800, 500);
                Stage stage = (Stage) ajouterEnseignant.getScene().getWindow();
                stage.setScene(choixMatiere);
                stage.setResizable(false);
                stage.setTitle("CHOIX DE MATIERE");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                erreurEnseignant.setText("connection impossible");
            }


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

    public void retour(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageAccueil= new FXMLLoader(AjoutDenseignantController.class.getResource("accueil-view.fxml"));
        Scene accueil= new Scene(pageAccueil.load(), 800, 500);
        Stage stage= (Stage) retourB.getScene().getWindow();
        stage.setScene(accueil);
        stage.setTitle("ACCUEIL");
        stage.setResizable(false);
        stage.show();
    }

    public void consultationListUser(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageConsultationUser = new FXMLLoader(AccueilController.class.getResource("consultationListeUser-view.fxml"));
        Scene consultationUser = new Scene(pageConsultationUser.load(), 800, 500);
        Stage stage= (Stage) utilisateur.getScene().getWindow();
        stage.setScene(consultationUser);
        stage.setResizable(false);
        stage.setTitle("CONSULTATION DES UTILISATEURS");
        stage.show();
    }

    public void consultationListeEleve(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageListeEtudiant = new FXMLLoader(AccueilController.class.getResource("listeEtudiant-view.fxml"));
        Scene consultationUser = new Scene(pageListeEtudiant.load(), 800, 500);
        Stage stage= (Stage) etudiant.getScene().getWindow();
        stage.setScene(consultationUser);
        stage.setResizable(false);
        stage.setTitle("CONSULTATION DES ETUDIANTS");
        stage.show();
    }


    public void parametre(ActionEvent actionEvent) {
    }
}
