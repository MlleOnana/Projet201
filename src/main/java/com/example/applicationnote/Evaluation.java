package com.example.applicationnote;

public class Evaluation {
    private Matiere matiere;
    private Etudiant etudiant;
    private int note;

    public Evaluation(Matiere matiere, Etudiant etudiant){
        this.matiere=matiere;
        this.etudiant=etudiant;
    }

    public void setMatiere(Matiere matiere){this.matiere=matiere;}
    public void setEtudiant(Etudiant etudiant){this.etudiant=etudiant;}
    public void setNote(int note){this.note=note;}

    public Matiere getMatiere(){return matiere;}
    public Etudiant getEtudiant(){return etudiant;}
    public int getNote(){return note;}


}
