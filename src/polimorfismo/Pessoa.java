package polimorfismo;

import java.time.LocalDate;

public abstract class Pessoa implements Profissional {
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private Genero sexo;

    public void falarNome(){
        System.out.println("Eu me chamo " + this.nome);
    }
    public void falarCPF(){
        System.out.println("Meu CPF é " + this.cpf);
    }
    public void falarGenero(){
        System.out.println("Meu sexo é " + this.sexo.getValue());
    }
    public void falarNascimento(){
        System.out.println("Eu nasci em " + this.nascimento);
    }
//------------------------------------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Genero getSexo() {
        return sexo;
    }
//----------------------------------------------------------------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }
}
