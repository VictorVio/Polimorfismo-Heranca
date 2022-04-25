package polimorfismo;

import java.time.LocalDate;

public class Padeiro extends Pessoa {
    public Padeiro (String nome, Genero genero, String cpf, LocalDate nascimento) {
        super.setNome(nome);
        super.setSexo(genero);
        super.setCpf(cpf);
        super.setNascimento(nascimento);
    }

    @Override
    public void descreverFuncao(){
        System.out.println("Eu faço pão");
    }

    @Override
    public void falarProfissao(){
        System.out.println("Eu sou padeiro");
    }

    @Override
    public void falarPreco() {System.out.println("Cada pãozinho custa 50 centavos");}
}
