package com.example.applicationnote.classes;

public class Classe {
    private String nom;
    private String codeFiliere;
    private int codeNiveau;

    public Classe (String nom, String codeFiliere, int codeNiveau){
        this.nom=nom;
        this.codeFiliere=codeFiliere;
        this.codeNiveau=codeNiveau;
    }

    public void setNom(String nom){this.nom=nom;}
    public void setCodeFiliere(String codeFiliere){this.codeFiliere=codeFiliere;}
    public void setCodeNiveau(int codeNiveau){this.codeNiveau=codeNiveau;}

    public String getNom(){return this.nom;}
    public String getCodeFiliere(){return this.codeFiliere;}
    public int getCodeNiveau(){return this.codeNiveau;}


}
