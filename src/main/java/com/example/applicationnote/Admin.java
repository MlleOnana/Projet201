package com.example.applicationnote;

import java.util.ArrayList;

public class Admin {
    private String nom;
    private String prenom;
    private String motDePasse;
    private ArrayList<Professeur> professeurs;

    public Admin(String nom, String motDePasse){
        this.nom=nom;
        this.motDePasse=motDePasse;
    }

    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}
    public void setProfesseurs(ArrayList<Professeur> professeurs){this.professeurs=professeurs;}

    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public String getMotDePasse(){return motDePasse;}
    public ArrayList<Professeur> getProfesseurs(){return professeurs;}

}
