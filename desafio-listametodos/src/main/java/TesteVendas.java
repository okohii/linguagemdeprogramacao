import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        RelatorioMetodos relatorioMetodos = new RelatorioMetodos();
        List<Double> precos = new ArrayList<Double>(List.of(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0));

        System.out.println("Quantidades de preços da lista: %d".formatted(relatorioMetodos.buscarQuantidadeVendas(precos)));

        System.out.println("Soma das vendas: %.2f".formatted(relatorioMetodos.somarVendas(precos)));

        System.out.println("O preço existe na lista?: %b".formatted(relatorioMetodos.buscarPreco(precos, 10.00)));

        System.out.println("Maior preco da lista: %.2f".formatted(relatorioMetodos.buscarMaiorPreco(precos)));

        System.out.println("Menor preco da lista: %.2f".formatted(relatorioMetodos.buscarMenorPreco(precos)));

        System.out.println("Preços filtrados: %s".formatted(relatorioMetodos.buscarPorPrecoMinimo(precos, 50.00)));
    }
}
