package com.example.applicationnote;

import java.util.ArrayList;

public class Filiere {
    private int code;
    private String nom;

    public Filiere(int code, String nom){
        this.code=code;
        this.nom=nom;
    }

    public void setCode(int code) {this.code = code;}
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCode(){return code;}
    public String getNom(){return nom;}

}
