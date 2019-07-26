package br.edu.ifal.cadastroaluno;

public class Aluno{
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String modulo;
    private String areaDeAtuacao;
    private String senha;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String email, String cpf, String sexo, String modulo, String areaDeAtuacao, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.sexo = sexo;
        this.modulo = modulo;
        this.areaDeAtuacao = areaDeAtuacao;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}