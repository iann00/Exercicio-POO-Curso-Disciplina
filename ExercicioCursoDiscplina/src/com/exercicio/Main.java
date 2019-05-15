package com.exercicio;

import com.exercicio.models.Curso;
import com.exercicio.models.Disciplina;

import java.util.Scanner;

public class Main {
    private static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso();
              curso.setNomeCurso("Programação Orientada à Objetos");
              curso.setCargaHoraria(200);
              curso.setTurno(Curso.MATUTINO);

        Disciplina[] disciplinas;
	    while (isRunning) {
	        System.out.println("*-------------------------------------------------------*");
	        System.out.println("*        Bem-vindo ao Cadastro de Disciplina            *");
	        System.out.println("*                                                       *");
            System.out.println("* SIGA AS INSTRUÇÕES ABAIXO                             *");
            for (int i = 0; i < 3; i++) {
                System.out.println("*                                                       *");
            }

            int vecTamanho = 0;
            do {
                System.out.println("* Informe a quantidade de disciplinas:                  *");
                System.out.println("* - Diferente de zero -                                 *");
                vecTamanho = scanner.nextInt();
            }while (vecTamanho == 0 || vecTamanho < 1);
            /*
              Isso não é muito elegante, mas inicializamos o vetor com um tamanho definido
              pelo usuário dentro do loop
             */
            disciplinas = new Disciplina[vecTamanho];

            for (int i = 0; i < disciplinas.length; i ++) {
                Disciplina disciplina = new Disciplina();

                if (i != 0) {
                    if (i < 2) {
                        System.out.println("* "+i+" disciplina salva até agora!                       *");
                    }
                    else {
                        System.out.println("* "+i+" disciplinas salvas até agora!                       *");
                    }
                }

                System.out.println("* Digite o nome da disciplina:                          *");
                disciplina.setNomeDisciplina(scanner.next());

                scanner.nextLine(); // Conserta o bug do scanner pulando linha

                System.out.println("* Digite a quantidade de créditos:                      *");
                disciplina.setCreditos(scanner.nextInt());

                System.out.println("* Digite a carga horária:                               *");
                disciplina.setCargaHoraria(scanner.nextInt());

                System.out.println("* Digite o semestre:                                    *");
                disciplina.setSemestre(scanner.nextInt());

                disciplinas[i] = disciplina;
            }

            curso.setDisciplinas(disciplinas);

            for (int i = 0; i < 5; i++) {
                System.out.println(" ");
            }

            System.out.println("*-------------------------------------------------------*");
            System.out.println("* Informações do Curso                                  *");
            System.out.println("*                                                       *");
            String turnoStr;

            switch (curso.getTurno()) {
                case Curso.MATUTINO   : turnoStr = "Matutino"   ; break;
                case Curso.VESPERTINO : turnoStr = "Vespertino" ; break;
                case Curso.NOTURNO    : turnoStr = "Noturno"    ; break;
                default: turnoStr = "Desconhecido";
            }
            System.out.println("* Nome do Curso  : "+curso.getNomeCurso()+"             *");
            System.out.println("* Turno          : "+turnoStr+"                         *");
            System.out.println("* Carga Horária  : "+curso.getCargaHoraria()+"h         *");
            System.out.println("*                                                       *");
            System.out.println("* N°  Disciplina      Carga Horária       Créditos      *");
            System.out.println("* ----------------------------------------------------- *");


            for (int i = 0; i < disciplinas.length; i++) {
                String nomeDisciplina = disciplinas[i].getNomeDisciplina();
                int cargaHoraria      = disciplinas[i].getCargaHoraria();
                int creditos          = disciplinas[i].getCreditos();

                // Espaçamentos necessários
                System.out.println(String.format("* %d   %s                %dh                    %d              *",
                        i,
                        nomeDisciplina,
                        cargaHoraria,
                        creditos));
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("*                                                       *");
            }

            String op;
            do {
                System.out.println("Você deseja repetir o processo? (y/N)");
                op = scanner.next();
            }while (op.equals("N") || op.equals("y"));


            isRunning = op.equals("Y");

            // Aqui é o ponto onde o usuário vai repetir o processo
            // então fazemos esse for para "limpar" a tela
            if (isRunning) {
                for (int i = 0; i < 30; i++) {
                    System.out.println(" ");
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }

        System.out.println("Valeu por usar o programa!");
    }
}
