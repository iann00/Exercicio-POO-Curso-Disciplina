package com.exercicio.models;

public class Curso {
    public static final int MATUTINO   = 0;
    public static final int VESPERTINO = 1;
    public static final int NOTURNO    = 2;

    private String nomeCurso;
    private int turno;
    private int cargaHoraria;
    private Disciplina[] disciplinas;

    public Curso() { }

    public Curso(String nomeCurso,
                 int turno,
                 int cargaHoraria,
                 Disciplina[] disciplinas) {

        this.nomeCurso = nomeCurso;
        this.turno     = turno;
        this.cargaHoraria = cargaHoraria;
        this.disciplinas = disciplinas;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return turno;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
}
