import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura em metros:");
        Double altura = leitor.nextDouble();

        System.out.println("""
                Usuário: %s
                Idade: %d
                Altura: %.2f
                """.formatted(nomeUsuario,idade,altura));
    }
}
