package com.example.applicationnote;

import com.example.applicationnote.classes.Classe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AccueilProfController{
    public Button procesverbal;
    public Button gestionEtudiants;
    public Button listeEtudiant;
    public Button deconnexion;
    public Button listeReleve;

    public void procesVerbaux(ActionEvent actionEvent) throws IOException {
        FXMLLoader pagePV= new FXMLLoader(AccueilProfController.class.getResource("procesVerbauxProf-view.fxml"));
        Scene proces= new Scene(pagePV.load(), 800,500);
        Stage stage = (Stage) procesverbal.getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(proces);
        stage.setTitle("PROCES VERBAUX");
        stage.show();
    }

    public void consultationreleve(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageConsultationReleve= new FXMLLoader(AccueilProfController.class.getResource("consultationReleveProf-view.fxml"));
        Scene consultationReleve = new Scene(pageConsultationReleve.load(), 800, 500);
        Stage stage= (Stage) listeReleve.getScene().getWindow();
        stage.setScene(consultationReleve);
        stage.setResizable(false);
        stage.setTitle("LISTE DES RELEVES DE NOTES");
        stage.show();
    }

    public void gestionEtudiants(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageListeUser= new FXMLLoader(AccueilProfController.class.getResource("gestionEtudiant-view.fxml"));
        Scene listeuser= new Scene(pageListeUser.load(), 800, 500);
        Stage stage= (Stage) listeEtudiant.getScene().getWindow();
        stage.setScene(listeuser);
        stage.setTitle("LISTE DES ETUDIANTS");
        stage.setResizable(false);
        stage.show();
    }

    public void consulterEtudiant(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageListeEtu= new FXMLLoader(AccueilProfController.class.getResource("listeEtudiantProf-view.fxml"));
        Scene listeEtu = new Scene(pageListeEtu.load(), 800, 500);
        Stage stage = (Stage) listeEtudiant.getScene().getWindow();
        stage.setScene(listeEtu);
        stage.setTitle("LISTE DES ETUDIANTS");
        stage.setResizable(false);
        stage.show();
    }

    public void deconnecter(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageDeconnexion= new FXMLLoader(AccueilProfController.class.getResource("deconnexionProf-view.fxml"));
        Scene deconnection = new Scene(pageDeconnexion.load(), 800, 500);
        Stage stage= (Stage) deconnexion.getScene().getWindow();
        stage.setScene(deconnection);
        stage.setResizable(false);
        stage.setTitle("DECONNECTION");
        stage.show();
    }
}
