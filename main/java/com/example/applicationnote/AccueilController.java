package com.example.applicationnote;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AccueilController {

    public Button ajoutEnseignant;
    public Button consulterReleve;
    public Button procesVerbaux;
    public Button utilisateur;
    public Button etudiant;
    public Button retour;

    public void ajoutEnseignant(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageAjoutEnseignant= new FXMLLoader(AccueilController.class.getResource("ajoutDenseignant-view.fxml"));
        Scene ajoutDenseignant = new Scene(pageAjoutEnseignant.load(), 800, 500);
        Stage stage= (Stage) ajoutEnseignant.getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(ajoutDenseignant);
        stage.setTitle("AJOUT D'ENSEIGNANT");
        stage.show();
    }

    public void consultationreleve(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageConsultation= new FXMLLoader(AccueilController.class.getResource("consultationReleve-view.fxml"));
        Scene ajoutDenseignant = new Scene(pageConsultation.load(), 800, 500);
        Stage stage= (Stage) consulterReleve.getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(ajoutDenseignant);
        stage.setTitle("CONSULTATION DES RELEVES DE NOTES");
        stage.show();
    }

    public void procesVerbaux(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageProces= new FXMLLoader(AccueilController.class.getResource("procesVerbaux-view.fxml"));
        Scene ajoutDenseignant = new Scene(pageProces.load(), 800, 500);
        Stage stage= (Stage) procesVerbaux.getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(ajoutDenseignant);
        stage.setTitle("PROCES VERBAUX");
        stage.show();
    }

    public void consultationListeUser(ActionEvent actionEvent) throws IOException {
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
        Scene consultationUser= new Scene(pageListeEtudiant.load(), 800, 500);
        Stage stage= (Stage) etudiant.getScene().getWindow();
        stage.setScene(consultationUser);
        stage.setResizable(false);
        stage.setTitle("CONSULTATION DES ETUDIANTS");
        stage.show();
    }

}
