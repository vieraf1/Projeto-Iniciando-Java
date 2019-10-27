package model;

public class Aluno {
    private Integer idAluno;
    private String nome;
    private String sobrenome;
    private String curso;
    private String periodo;
    private String ra;

    public Aluno(Integer idAluno, String nome, String sobrenome, String curso, String periodo, String ra) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.periodo = periodo;
        this.ra = ra;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
