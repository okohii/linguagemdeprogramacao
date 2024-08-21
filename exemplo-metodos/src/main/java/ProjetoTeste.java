import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        //Criando um objeto para utilizar seus métodos

        MetodosUteis util = new MetodosUteis();
        Scanner leitor = new Scanner(System.in);

        util.exibirUsuario("Rodolfo", 28);
        util.exibirUsuario("Ruth", 26);
        util.exibirUsuario("Ellen", 18);
        util.exibirUsuario("Gustavo", 20);
        util.exibirUsuario("JP", 18);


        System.out.println("Insira seu Nome:");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Insira sua idade:");
        Integer idade = leitor.nextInt();

        util.exibirUsuario(nomeUsuario, idade);

        // 5000 linhas de código que faz muita coisa complexa
    }
}
