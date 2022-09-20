package executavel;

import objetos.Aluno;

import javax.swing.*;

public class primeiraClasse {
    public static void main(String[] args){

        /* new aluno() é uma instância (criação do objeto)*/
        /* o aluno1 é uma referência para o objeto aluno */

        String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
        String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno?");

        String disciplina1 = JOptionPane.showInputDialog("Digite a primeira disciplina");
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");

        String disciplina2 = JOptionPane.showInputDialog("Digite a segunda disciplina");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota");

        String disciplina3 = JOptionPane.showInputDialog("Digite a terceira disciplina");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota");

        String disciplina4= JOptionPane.showInputDialog("Digite a quarta disciplina");
        String nota4 = JOptionPane.showInputDialog("Digite a quarta nota");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);

        /* notas */
        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota1(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

        /* disciplinas */
        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);




      /* to string */   System.out.println(aluno1);
        System.out.println("Média das notas = " + aluno1.getMediaNota());
      /* System.out.println("Resultado = " + aluno1.getAlunoAprovado());*/
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));



        Aluno aluno2 = new Aluno();


        /* Equals e hashcode ( diferenciar e comparar objetos ) */

     /*  Aluno aluno1 = new Aluno();
       aluno1.setNome("thamyres");
       aluno1.setMatricula("148");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("thamyres");
        aluno2.setMatricula("1248");

        if (aluno1.equals(aluno2)){
            System.out.println("Alunos iguais");
        }else {
            System.out.println("Alunos diferentes");
        }*/


        }

}
