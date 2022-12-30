package com.example.applicationnote.classes;

import java.util.ArrayList;

public class Admin {
    private int code;
    private String nom;
    private String motDePasse;
     public Admin(int code, String nom, String motDePasse){
         this.code=code;
         this.nom=nom;
         this.motDePasse=motDePasse;
     }

     public void setCode(int code){this.code=code;}
     public void setNom(String nom){this.nom=nom;}
    public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}

    public int getCode(){return this.code;}
    public String getNom(){return this.nom;}
    public String getMotDePasse(){return this.motDePasse;}

}
