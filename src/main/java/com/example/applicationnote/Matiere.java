package com.example.applicationnote;

public class Matiere {
    private String code;
    private String nom;

    public Matiere(String code,String nom){
        this.code=code;
        this.nom=nom;
    }

    public void setCode(String code){this.code=code;}
    public void setNom(String nom){this.nom=nom;}

    public String getCode(){return code;}
    public String getNom(){return nom;}
}
