package com.example.applicationnote.classes;

public class Matiere {
    private String code;
    private String libelle;
    private int codeSemestre;
    private int codeProf;
    private String codeClasse;

    public Matiere(String code, String libelle, int codeSemestre, int codeProf, String codeClasse){
        this.code=code;
        this.libelle=libelle;
        this.codeSemestre=codeSemestre;
        this.codeProf=codeProf;
        this.codeClasse=codeClasse;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setLibelle(String libelle){this.libelle=libelle;}
    public void setCodeSemestre(int codeSemestre){this.codeSemestre=codeSemestre;}
    public void setCodeProf(int codeProf){this.codeProf=codeProf;}
    public void setCodeClasse (String codeClasse){this.codeClasse=codeClasse;}

    public String getCode(){return this.code;}
    public String getLibelle(){return this.libelle;}
    public int getCodeSemestre(){return this.codeSemestre;}
    public int getCodeProf(){return this.codeProf;}
    public String getCodeClasse(){return  codeClasse;}

}
