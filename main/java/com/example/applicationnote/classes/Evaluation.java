package com.example.applicationnote.classes;

public class Evaluation {
    private String matriculeEtudiant;
    private String codeMatiere;
    private double note;

    public Evaluation(String matriculeEtudiant, String codeMatiere, double note){
        this.matriculeEtudiant=matriculeEtudiant;
        this.codeMatiere=codeMatiere;
        this.note=note;
    }

    public void setMatriculeEtudiant(String matriculeEtudiant){this.matriculeEtudiant=matriculeEtudiant;}
    public void setCodeMatiere(String codeMatiere){this.codeMatiere=codeMatiere;}
    public void setNote(double note){this.note=note;}
    public String getMatriculeEtudiant(){return this.matriculeEtudiant;}
    public String getCodeMatiere(){return this.codeMatiere;}
    public double getNote(){return this.note;}
}
