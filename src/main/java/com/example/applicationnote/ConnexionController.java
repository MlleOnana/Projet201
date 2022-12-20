package com.example.applicationnote;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnexionController {
    public Button connexionConnexion;
    public TextField nomConnexion;
    public PasswordField motDePasseConnexion;
    public Label erreurConnexion;
    public Hyperlink lienInscription;

    public void connexion(ActionEvent actionEvent) {
    }

    public void rediriger(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageInscription= new FXMLLoader(ConnexionController.class.getResource("hello-view.fxml"));
        Scene inscription= new Scene(pageInscription.load(),800, 500);
        Stage stage = (Stage) lienInscription.getScene().getWindow();
        stage.setScene(inscription);
        stage.setResizable(false);
        stage.setTitle("inscription");
        stage.show();
    }
}
