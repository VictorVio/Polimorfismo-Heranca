package polimorfismo;

import java.time.LocalDate;

public class Policial extends Pessoa {
    public Policial (String nome, Genero genero, String cpf, LocalDate nascimento) {
        super.setNome(nome);
        super.setSexo(genero);
        super.setCpf(cpf);
        super.setNascimento(nascimento);
    }

    @Override
    public void descreverFuncao(){
        System.out.println("Eu mato pessoas");
    }

    @Override
    public void falarProfissao() {
        System.out.println("Eu sou policial");
    }

    @Override
    public void falarPreco() {System.out.println("Meu produto é minha vida contra o crime, recebo R$40,00/hora");}
}
