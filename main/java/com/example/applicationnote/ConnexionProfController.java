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

public class ConnexionProfController {
    public TextField codeProf;
    public TextField motProf;
    public TextField confirmation;

    public Label erreurConnexion;

    public Button inscription;
    public Hyperlink connexion;

    public void connexion(ActionEvent actionEvent) throws IOException {
        //verification du code dans la base de données
        //reatribution obligatoire du mot de passe par l'enseignant lors de sa connexion
        String mot = motProf.getText();
        String verif= confirmation.getText();
        if (mot.length()<8  ){
            erreurConnexion.setText("mot de passe trop court");
        }else if (mot.length()>16){
            erreurConnexion.setText("mot de passe trop long");
        }else if(!mot.equals(verif)){
            erreurConnexion.setText("veuillez confirmer votre mot de passe");
        }else {
            FXMLLoader pageConnexionProf = new FXMLLoader(ConnexionProfController.class.getResource("connexionprof-view.fxml"));
            Scene connexionProf= new Scene(pageConnexionProf.load(), 800, 500);
            Stage stage= (Stage) inscription.getScene().getWindow();
            stage.setScene(connexionProf);
            stage.setTitle("ACCEUIL");
            stage.setResizable(false);
            stage.show();
        }
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
