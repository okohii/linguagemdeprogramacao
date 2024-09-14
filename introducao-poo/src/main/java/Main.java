import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cofrinho gerenciarCofrinho = new Cofrinho();

        Scanner leitor = new Scanner(System.in);
        Scanner leitorCofrinho = new Scanner(System.in);

        Boolean parar = false;
        Boolean confirmacao = false;

        while (!parar) {
            System.out.println("""
                Escolha uma função:
                1 - Registrar cofrinho
                2 - Listar Cofrinhos
                3 - Administrar cofrinhos
                4 - Sair
                """);
            switch (leitor.nextInt()) {
                case 1:
                    gerenciarCofrinho.registrarCofrinho();
                    break;
                case 2:
                    confirmacao = gerenciarCofrinho.listarCofrinhos();
                    break;
                case 3:
                    if (confirmacao) {
                    Integer opCofrinho = gerenciarCofrinho.selecionarCofrinho();
                    gerenciarCofrinho.administrarCofrinho(opCofrinho);
                    } else {
                        System.out.println("Nenhum cofrinho registrado");
                    }
                    break;
                case 4:
                    parar = true;
                    break;
            }
        }
    }
}
