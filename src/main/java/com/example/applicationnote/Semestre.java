package com.example.applicationnote;

import com.example.applicationnote.Matiere;

import java.util.ArrayList;

public class Semestre {
    private int code;
    private ArrayList<Matiere> matieres;

    public Semestre(int code){
        this.code=code;
    }

    public void setCode(int code){this.code=code;}
    public void setMatieres(ArrayList<Matiere> matieres){this.matieres=matieres;}

    public int getCode(){return code;}
    public ArrayList<Matiere> getMatieres(){return matieres;}
}
