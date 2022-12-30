package com.example.applicationnote;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ConnexionController {
    public Connection connection= ConnexionData.getConnection();

    public TextField nom;
    public TextField motDePasse;
    public Button connexion;

    public Hyperlink inscription;
    public Label erreurConnexion;

    public void rediriger(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageInscription = new FXMLLoader(ConnexionController.class.getResource("hello-view.fxml"));
        Scene inscriptionS = new Scene(pageInscription.load(), 800, 500);
        Stage stage= (Stage) inscription.getScene().getWindow();
        stage.setScene(inscriptionS);
        stage.setTitle("INSCRIPTION");
        stage.setResizable(false);
        stage.show();
    }

    public void connecter(ActionEvent actionEvent) {
        String nomA = nom.getText();
        String mot = motDePasse.getText();
        try {
            String requete = "SELECT * FROM admin WHERE admin_nom=? AND admin_mot_passe =? ; ";
            PreparedStatement statement= connection.prepareStatement(requete);
            statement.setString(1, nomA);
            statement.setString(2, mot);
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData result= resultSet.getMetaData();
            if (resultSet.next()){
                System.out.println("vrai");
            }

            FXMLLoader pageAccueil = new FXMLLoader(ConnexionController.class.getResource("accueil-view.fxml"));
            Scene accueil = new Scene(pageAccueil.load(), 800, 500);
            Stage stage = (Stage) connexion.getScene().getWindow();
            stage.setScene(accueil);
            stage.setTitle("ACCUEIL");
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("je n'ai pas pu");
        }
    }
}
