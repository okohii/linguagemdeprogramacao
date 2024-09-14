import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer opcao = 0;

        Integer primeiroNumero = 0;
        Integer segundoNumero = 0;
        Integer resultado = 0;

        System.out.println("Digite um número para começar!");
        while (opcao != 4) {
            System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair
                """);
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Primeiro Número:");
                    primeiroNumero = leitor.nextInt();
                    System.out.println("Segundo Número:");
                    segundoNumero = leitor.nextInt();

                    resultado = primeiroNumero + segundoNumero;
                    System.out.println("Resultado = " + resultado);
                    break;
                case 2:
                    System.out.println("Primeiro Número:");
                    primeiroNumero = leitor.nextInt();
                    System.out.println("Segundo Número:");
                    segundoNumero = leitor.nextInt();

                    resultado = primeiroNumero - segundoNumero;
                    System.out.println("Resultado = " + resultado);
                    break;
                case 3:
                    System.out.println("Primeiro Número:");
                    primeiroNumero = leitor.nextInt();
                    System.out.println("Segundo Número:");
                    segundoNumero = leitor.nextInt();

                    resultado = primeiroNumero * segundoNumero;
                    System.out.println("Resultado = " + resultado);
                    break;
                case 4:
                    System.out.println("Finalizando");
                    break;
            }
        }
    }
}
