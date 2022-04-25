package polimorfismo;

import java.time.LocalDate;

public class Medico extends Pessoa {
    public Medico (String nome, Genero genero, String cpf, LocalDate nascimento){
        super.setNome(nome);
        super.setSexo(genero);
        super.setCpf(cpf);
        super.setNascimento(nascimento);
    }

    @Override
    public void descreverFuncao(){
        System.out.println("Eu salvo pessoas");
    }

    @Override
    public void falarProfissao(){System.out.println("Eu sou medico");}

    @Override
    public void falarPreco() {System.out.println("Cada cirurgia me rende em média R$10.000,00 ");}
}
