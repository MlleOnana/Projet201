package com.example.applicationnote;

import java.util.ArrayList;
import java.util.Date;

public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private Date dateNaissance;
    private String lieuNaissance;
    private String sexe;
    private int numero;


    public Etudiant(String matricule, String nom){
        this.matricule=matricule;
        this.nom=nom;
    }

    public void setMatricule(String matricule){this.matricule=matricule;}
    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setAge(int age){this.age=age;}
    public void setDateNaissance(Date dateNaissance){this.dateNaissance=dateNaissance;}
    public void setLieuNaissance(String lieuNaissance){this.lieuNaissance=lieuNaissance;}
    public void setSexe(String sexe){this.sexe=sexe;}
    public void setNumero(int numero){this.numero=numero;}

    public String getMatricule(){return matricule;}
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}
    public Date getDateNaissance(){return dateNaissance;}
    public String getLieuNaissance(){return lieuNaissance;}
    public String getSexe(){return sexe;}
    public int getNumero(){return numero;}


}
