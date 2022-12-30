package com.example.applicationnote;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ListeEtudiantProfController {
    public Button retourB;

    public void retour(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageAccueil= new FXMLLoader(ProcesVerbauxProfController.class.getResource("accueilProf-view.fxml"));
        Scene accueil = new Scene(pageAccueil.load(), 800, 500);
        Stage stage= (Stage) retourB.getScene().getWindow();
        stage.setScene(accueil);
        stage.setTitle("ACUEIL");
        stage.setResizable(false);
        stage.show();
    }
}
