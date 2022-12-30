package com.example.applicationnote;

import com.example.applicationnote.classes.Professeur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ConsultationListeUserController implements Initializable{

    public ListView liste;
    public Button retourB;
    public Button deconnection;
    public TableView<Professeur> professeur;
    public TableColumn<Professeur, String> nomP;
    public TableColumn<Professeur, Integer> telP;
    public TableColumn<Professeur, String> emailP;
    public TableColumn<Professeur, String> matiereP;
    public Button supprimer;
    public Label erreurListe;
    ObservableList<Professeur> professeurs = FXCollections.observableArrayList();
    public Button ajout;
    public static  int compteur=0;
    Connection connection= ConnexionData.getConnection();

    public void ajouter(ActionEvent actionEvent) {
        try {

            professeurs.removeAll(professeurs);
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM professeur");
            while (resultSet.next()){
                int code= resultSet.getInt("prof_code");
                String nom = resultSet.getString("prof_nom");
                int tel = resultSet.getInt("prof_telephone");
                String email= resultSet.getString("prof_email");
                String mot= resultSet.getString("prof_mot_passe");
                Professeur professeur= new Professeur(code,nom, tel,email,mot);
                professeurs.add(professeur);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomP.setCellValueFactory(new PropertyValueFactory<Professeur , String>("nom"));
        telP.setCellValueFactory(new PropertyValueFactory<Professeur, Integer>("telephone"));
        emailP.setCellValueFactory(new PropertyValueFactory<Professeur, String>("email"));
        matiereP.setCellValueFactory(new PropertyValueFactory<Professeur, String>("matieres"));

        professeur.setItems(professeurs);
    }

    public void retour(ActionEvent actionEvent) throws IOException {
        FXMLLoader pageAccueilAdmin= new FXMLLoader(ConsultationListeUserController.class.getResource("accueil-view.fxml"));
        Scene accueilAdmin = new Scene(pageAccueilAdmin.load(), 800, 500);
        Stage stage= (Stage) retourB.getScene().getWindow();
        stage.setScene(accueilAdmin);
        stage.setTitle("ACCUEIL");
        stage.setResizable(false);
        stage.show();
    }

    public void suppression(ActionEvent actionEvent) {
        int sup;
        if (professeur.getSelectionModel().isEmpty()){
            erreurListe.setText("selectionnez un utilisateur");
        } else{
            try {
                sup=professeur.getSelectionModel().getSelectedIndex();
                Professeur prof= professeurs.remove(sup);
                PreparedStatement statement = connection.prepareStatement("DELETE FROM professeur WHERE prof_code=?");
                ResultSet resultSet= statement.executeQuery();
                int code=prof.getCode();
                statement.setInt(1,code);

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("j'ai pas pu");
            }
        }


    }
}
