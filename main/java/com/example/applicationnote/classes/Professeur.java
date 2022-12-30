package com.example.applicationnote.classes;

public class Professeur {
    private int code;
    private String nom;
    private int telephone;
    private String email;
    private String motDePasse;
    private String matieres;

    public Professeur (int code, String nom, int telephone, String email, String motDePasse){
        this.code=code;
        this.nom=nom;
        this.telephone=telephone;
        this.email=email;
        this.motDePasse=motDePasse;
    }

    public void setCode(int code){this.code=code;}
    public void setNom(String nom){this.nom=nom;}
    public void setTelephone(int telephone){this.telephone=telephone;}
    public void setEmail(String email){this.email=email;}
    public void setMotDePasse(String motDePasse){this.motDePasse=motDePasse;}
    public void setMatieres(String matieres){this.matieres=matieres;}


    public int getCode(){return this.code;}
    public String getNom(){return this.nom;}
    public int getTelephone(){return this.telephone;}
    public String getEmail(){return this.email;}
    public String getMotDePasse(){return this.motDePasse;}
    public String getMatieres(){return this.matieres;}

}
