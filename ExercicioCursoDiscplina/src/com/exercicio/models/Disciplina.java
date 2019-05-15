package com.exercicio.models;

public class Disciplina {
    private String nomeDisciplina;
    private int creditos;
    private int cargaHoraria;
    private int semestre;

    public Disciplina() { }

    public Disciplina(String nomeDisciplina,
                      int creditos,
                      int cargaHoraria,
                      int semestre) {
        this.nomeDisciplina = nomeDisciplina;
        this.creditos       = creditos;
        this.cargaHoraria   = cargaHoraria;
        this.semestre       = semestre;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }
}
