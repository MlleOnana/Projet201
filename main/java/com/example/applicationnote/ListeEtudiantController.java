package com.example.applicationnote;

import com.example.applicationnote.classes.Etudiant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListeEtudiantController implements Initializable {

    public ComboBox classe;
    public Button afficher;
    public TableView<Etudiant> etudiants;
    public TableColumn<Etudiant, String> nomEtudiant;
    public TableColumn<Etudiant, String> matricule;
    public Button retourB;
    public ObservableList<Etudiant> vide= FXCollections.observableArrayList();
    public ObservableList<Etudiant> etudiantss= FXCollections.observableArrayList();
    public ObservableList<String> list= FXCollections.observableArrayList();
    public Label erreurListe;
    private Connection connexion= ConnexionData.getConnection();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomEtudiant.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("nom"));
        matricule.setCellValueFactory(new PropertyValueFactory<Etudiant, String >("matricule"));
        etudiants.setItems(etudiantss);


        try{
            Statement statement=  connexion.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT classe_nom FROM classe");
            ResultSetMetaData result= resultSet.getMetaData();
            while (resultSet.next()){
                String code= resultSet.getString("classe_nom");
                list.add(code);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        classe.setItems(list);
    }

    public void retour(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageAccueil= new FXMLLoader(ListeEtudiantController.class.getResource("accueil-view.fxml"));
        Scene accueil= new Scene(pageAccueil.load(), 800, 500);
        Stage stage= (Stage) retourB.getScene().getWindow();
        stage.setScene(accueil);
        stage.setTitle("ACCUEIL");
        stage.setResizable(false);
        stage.show();
    }

    public void affichage (ActionEvent actionEvent) {
        if (classe.getSelectionModel().isEmpty()){
            erreurListe.setText("selctionnez une classe");
        }else {
            String laClasse= classe.getValue().toString();
            try {
                etudiantss.removeAll(etudiantss);
                String requete="SELECT etudiant_matricule,etudiant_nom FROM etudiant WHERE classe=? ORDER BY etudiant_nom";
                PreparedStatement statement = connexion.prepareStatement(requete);
                statement.setString(1,laClasse);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()){
                    String mat= resultSet.getString("etudiant_matricule");
                    String nom= resultSet.getString("etudiant_nom");
                    etudiantss.add(new Etudiant(mat,nom,laClasse));
                }
                System.out.println("lecture reussie");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}
