package com.example.applicationnote;

public class Professeur {
    private String code;
    private String nom;
    private int numero;
    private String email;
    private String motDePasse;

    public Professeur(String code, String nom){
        this.code=code;
        this.nom=nom;
    }
    public void setCode(String code){this.code=code;}
    public void setNom(String nom){this.nom=nom;}
    public void setNumero(int numero){this.numero=numero;}
    public void setEmail(String email){this.email=email;}
    public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}

    public String getCode(){return code;}
    public String getNom(){return nom;}
    public int getNumero(){return numero;}
    public String getEmail(){return email;}
    public String getMotDePasse(){return motDePasse;}
}
