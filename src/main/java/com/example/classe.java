package com.example;

import java.util.*;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class classe {
    int numero;
    String sezione;
    String aula;
    @JacksonXmlElementWrapper(localName = "alunni")
    @JacksonXmlProperty(localName = "alunno")
    ArrayList<alunno> alunni;

    public classe() {

    }

    public classe(int numero, String sezione, String aula, ArrayList<alunno> alunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = alunni;
    }

    public int getNumero() {
        return numero;
    }

    public String getSezione() {
        return sezione;
    }

    public String getAula() {
        return aula;
    }

    public ArrayList<alunno> getAlunni() {
        return alunni;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }


    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setAlunni(ArrayList<alunno> alunni) {
        this.alunni = alunni;
    }

    public void addAlunno(alunno a) {
        this.alunni.add(a);
    }
}
