package com.example.applicationnote;

public class Classe {
    private int code;
    private Filiere filiere;
    private Niveaux niveaux;

    private Classe(int code, Filiere filiere, Niveaux niveaux){
        this.code=code;
        this.filiere=filiere;
        this.niveaux=niveaux;
    }

    public void setCode(int code){this.code=code;}
    public void setFiliere(Filiere filiere){this.filiere=filiere;}
    public void setNiveaux(Niveaux niveaux){this.niveaux=niveaux;}

    public int getCode(){return code;}
    public Filiere getFiliere(){return filiere;}
    public Niveaux getNiveaux(){return niveaux;}
}
