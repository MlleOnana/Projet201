package com.example.applicationnote.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Etudiant {
    private String matricule;
    private String nom;
    private String classe;
    private float mgp;

    public Etudiant(String matricule, String nom, String classe){
        this.nom=nom;
        this.matricule=matricule;
        this.classe=classe;
    }

    public void setNom(String nom){this.nom=nom;}
    public void setMatricule(String matricule){this.matricule=matricule;}
    public void setClasse(String classe){this.classe=classe;}
    public void setMgp(float mgp){this.mgp=mgp;}

    public String getNom(){return this.nom;}
    public String getMatricule(){return this.matricule;}
    public String getClasse(){return this.classe;}
    public float getMgp(){return this.mgp;}
}
