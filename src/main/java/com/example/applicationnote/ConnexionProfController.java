package com.example.applicationnote;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnexionProfController {
    public TextField codeProf;
    public TextField nomProf;
    public TextField MotProf;
    public TextField confirmation;


    public Button inscription;
    public Hyperlink connexion;

    public void connexion(ActionEvent actionEvent) {
        //verification si le code a ete attribué en base de données


    }

    public void rediriger(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageInscriptionProf= new FXMLLoader(ConnexionProfController.class.getResource("inscriptionProf-view.fxml"));
        Scene inscriptionProf= new Scene(pageInscriptionProf.load(), 800, 500);
        Stage stage= (Stage) connexion.getScene().getWindow();
        stage.setScene(inscriptionProf);
        stage.setResizable(false);
        stage.setTitle("CONNEXION");
        stage.show();
    }
}
