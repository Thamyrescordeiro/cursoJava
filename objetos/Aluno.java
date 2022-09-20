package objetos;

import java.util.Objects;

public class Aluno {
    /* são os atributos do objeto aluno*/
    private String nome;
    private String nomeEscola;
    private String idade;
    private String dataNascimento;
    private String matricula;
    private String serie;
    private String nomeMae;

    /* chamando o objeto disciplina */
    private Disciplina  disciplina = new Disciplina();
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Aluno() { /* cria os dados na memoria , padrão java */
    }

    /* METODOS SETTERS E GETTERS */
    /* SET é para adicionar ou receber dados para o atributo */
    /* GET  é para resgatar ou obter o valor do atributo */

   /* recebe dados */
    public  void setNome(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }


    /* metodo que retorna a media do aluno */
    public double getMediaNota(){
    return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4())/4;
}


    /* usando o toString */

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", idade='" + idade + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", matricula='" + matricula + '\'' +
                ", serie='" + serie + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }


    /* equals e hashcode*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMatricula());
    }

    /* metodo que retorna true para aprovado e falsse para reprovado */
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >=7){
            return true;
        }else {
            return false;
        }




    }
}


