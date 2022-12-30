package com.example.applicationnote;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ChoixMatiereController {

    public Button retourB;
    public Button parametre;
    public Button utilisateur;
    public Button etudiant;

    public void retour(MouseEvent mouseEvent) throws IOException {
        FXMLLoader pageAjoutEnseignant= new FXMLLoader(ChoixMatiereController.class.getResource("ajoutDenseignant-view.fxml"));
        Scene ajoutEnseignant= new Scene(pageAjoutEnseignant.load(), 800, 500);
        Stage stage= (Stage) retourB.getScene().getWindow();
        stage.setScene(ajoutEnseignant);
        stage.setResizable(false);
        stage.setTitle("AJOUT D'ENSEIGNANT");
        stage.show();

    }

    public void parametre(ActionEvent actionEvent) {

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
        Scene consultationUser = new Scene(pageListeEtudiant.load(), 800, 500);
        Stage stage= (Stage) etudiant.getScene().getWindow();
        stage.setScene(consultationUser);
        stage.setResizable(false);
        stage.setTitle("CONSULTATION DES ETUDIANTS");
        stage.show();
    }
}
