package com.example.applicationnote.classes;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Niveaux {
    public int code;
    public Niveaux (int code){
        this.code=code;
    }

    public void setCode(int code){this.code=code;}

    public int getCode(){return this.code;}
}
