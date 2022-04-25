package polimorfismo;
import java.time.LocalDate;
import java.util.Scanner;

public class Service {

    public void processamento() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Boolean continuar = true;
        while (continuar) {

            System.out.println("Digite o seu nome");
            String nome = scan.next();
            System.out.println("Digite o seu CPF");
            String cpf = scan.next();
            System.out.println("Digite o sua data de nascimento");
            LocalDate nascimento = LocalDate.parse(scan.next());
            System.out.println("Digite sua profissão");
            String profissao = scan.next();
            System.out.println("Digite o seu sexo");
            String genero = scan.next();

            if (profissao.equalsIgnoreCase("Policial")) {
                Pessoa pessoa = new Policial(nome, Genero.buscarEnum(genero), cpf, nascimento);
                apresentacao(pessoa);
            } else if (profissao.equalsIgnoreCase("Médico") || profissao.equalsIgnoreCase("Medico")) {
                Pessoa pessoa = new Medico(nome, Genero.buscarEnum(genero), cpf, nascimento);
                apresentacao(pessoa);
            } else if (profissao.equalsIgnoreCase("Padeiro")) {
                Pessoa pessoa = new Padeiro(nome, Genero.buscarEnum(genero), cpf, nascimento);
                apresentacao(pessoa);
            } else {
                System.out.println("Profissão não identificada, digite novamente \n Médico, Padeiro ou Policial");
                continuar = true;
            }
            System.out.println("Continuar?");
            continuar = scan.next().equals("sim");
        }
    }

    private void apresentacao(Pessoa pessoa){
        System.out.println("-------------------------------------");
        pessoa.falarNome();
        pessoa.falarCPF();
        pessoa.falarNascimento();
        pessoa.falarGenero();
        pessoa.falarProfissao();
        pessoa.descreverFuncao();
        pessoa.falarPreco();
        System.out.println("-------------------------------------");

    }
}
