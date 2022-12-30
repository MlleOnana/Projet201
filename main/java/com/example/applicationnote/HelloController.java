package com.example.applicationnote;

import com.example.applicationnote.classes.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class HelloController {
    //public ObservableList<String> poste= FXCollections.observableArrayList("professeur","responsable");
    public PasswordField motDePasseLogin;
    Connection connection= ConnexionData.getConnection();
    public TextField nomLogin;
    public Button connexionLogin;
    public Label erreurConnexion;
    public TextField prenomLogin1;
    public PasswordField confirmationMotLogin;
    public Hyperlink lienConnexion;
    public static int compteur=0;

    public void ajout(){

    }

    public void connexion(ActionEvent actionEvent) throws IOException {

        compteur+=1;
        String nom=nomLogin.getText();
        String mot=motDePasseLogin.getText();
        String confirmation= confirmationMotLogin.getText();
        if(nom.isEmpty()){
            erreurConnexion.setText("vous ne pouvez pas vous conecter avec un nom vide");
        }else if(mot.length() < 8){
             erreurConnexion.setText("votre mot de passe est trop court. entre 8 et 16 caractères");
        }else if(mot.length()>16){
            erreurConnexion.setText("votre mot de passe est trop long. entre 8 et 16 caractères");
        }else if (confirmation.isEmpty()){
            erreurConnexion.setText("veuillez confirmer votre mot de passe");
        }else if(!confirmation.equals(mot)){
            erreurConnexion.setText("veuillez reconfirmer votre mot de passe. Il n'est pas le meme");
        }else {
            erreurConnexion.setText("");
            if (prenomLogin1.getText().isEmpty()){
                String prenom="";
            }
            nom+=prenomLogin1.getText();
            Admin admin= new Admin(compteur,nom,mot);
            //acces a la base de donnees
            try {
                String requete= "INSERT INTO admin(admin_code,admin_nom,admin_mot_passe) VALUES (?,?,?)";
                PreparedStatement statement= connection.prepareStatement(requete);
                statement.setInt(1, admin.getCode());
                statement.setString(2, admin.getNom());
                statement.setString(3, admin.getMotDePasse());
                statement.executeUpdate();
                statement.close();

                FXMLLoader pageAccueil = new FXMLLoader(HelloController.class.getResource("accueil-view.fxml"));
                Scene accueilResponsable=new Scene(pageAccueil.load(),800, 500 );
                Stage stage = (Stage) connexionLogin.getScene().getWindow();
                stage.setResizable(false);
                stage.setScene(accueilResponsable);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
                erreurConnexion.setText("erreur de connexion");
            }

        }

    }


    public void rediriger(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageConnexion= new FXMLLoader(HelloController.class.getResource("connexion-view.fxml"));
        Scene connexion= new Scene(pageConnexion.load(),800, 500);
        Stage stage = (Stage) lienConnexion.getScene().getWindow();
        stage.setTitle("connexion");
        stage.setResizable(false);
        stage.setScene(connexion);
        stage.show();
    }
}