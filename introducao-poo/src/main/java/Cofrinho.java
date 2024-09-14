import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String proposito;
    Double saldo;
    Boolean quebrado;

    public Cofrinho() {
        this.proposito = "";
        this.saldo = 0.0;
        this.quebrado = false;
    }

    public Cofrinho(String proposito, Double saldo, Boolean quebrado) {
        this.proposito = proposito;
        this.saldo = saldo;
        this.quebrado = quebrado;
    }

    List<Cofrinho> cofrinhos = new ArrayList<Cofrinho>();
    Scanner scanner = new Scanner(System.in);

    public void exibirCofrinho() {
        System.out.println("Proposito: " + proposito);
        System.out.println("Saldo: " + saldo);
        System.out.println("Quebrado: " + quebrado);
    }

    void registrarCofrinho() {
        System.out.println("Digite o propósito do cofrinho:");
        proposito = scanner.nextLine();
        System.out.println("Digite o saldo inicial do cofrinho:");
        saldo = scanner.nextDouble();

        scanner.nextLine();

        quebrado = false;

        Cofrinho novoCofrinho = new Cofrinho(proposito, saldo, quebrado);
        cofrinhos.add(novoCofrinho);
        System.out.println("Novo cofrinho registrado!");
    }

    Boolean listarCofrinhos() {
        if (cofrinhos.isEmpty()) {
            System.out.println("Nenhum cofrinho registrado.");
            return false;
        } else {
            for (int i = 0; i < cofrinhos.size(); i++) {
                System.out.println("Cofrinho " + (i) + ":");
                cofrinhos.get(i).exibirCofrinho();
                System.out.println();
            }
        }
        return true;
    }

    Integer selecionarCofrinho() {
        System.out.println("Cofrinhos:");
        System.out.println();
            for (int i = 0; i < cofrinhos.size(); i++) {
                System.out.println("Cofrinho " + (i));
            }
        System.out.println();
        System.out.println("Selecione o cofrinho: ");
        Integer opCofrinho = scanner.nextInt();
        return opCofrinho;
    }

    void administrarCofrinho(Integer numCofrinho) {
        System.out.println("Cofrinho selecionado: %s".formatted(cofrinhos.get(numCofrinho).proposito));
        System.out.println("""
            1 - Depositar
            2 - Agitar
            3 - Quebrar
            """);
        System.out.println("Escolha uma opção:");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado:");
                        Double valor = scanner.nextDouble();
                        cofrinhos.get(numCofrinho).depositar(valor);
                        break;
                    case 2:
                        System.out.println("%.2f".formatted(cofrinhos.get(numCofrinho).agitar()));
                        break;
                    case 3:
                        System.out.println(cofrinhos.get(numCofrinho).quebrar());
                        break;
                }
    }

    void depositar(Double valor) {
        if (quebrado) {
            System.out.println("Não da para depositar num cofrinho quebrado :(");
        } else {
            saldo += valor;
            System.out.println("Depositado!");
        }
    }

    Double quebrar() {
        Double saldoSalvo = saldo;
        if (!quebrado) {
            System.out.println("POOOOW!");
            quebrado = true;
            saldo = 0.0;
            return saldoSalvo;
        }
        System.out.println("O cofre ja está quebrado :(");
        return null;
    }

    Double agitar() {
        if (!quebrado) {
            System.out.println("*Agitando cofrinho*");
            Double numAleatorio = ThreadLocalRandom.current().nextDouble(0.0, saldo);
            saldo -= numAleatorio;
            return numAleatorio;
        }
        System.out.println("Não da para agitar um cofre quebrado :(");
        return null;
    }
}
