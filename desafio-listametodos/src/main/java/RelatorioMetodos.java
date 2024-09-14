import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {
    Integer buscarQuantidadeVendas(List<Double> precos) {
        return precos.size();
    }

    Double somarVendas(List<Double> precos) {
        Double soma = 0.0;

        for (Double preco : precos) {
            soma += preco;
        }
        return soma;
    }

    Boolean buscarPreco(List<Double> precos, Double preco) {
        if (precos.contains(preco)) {
            return true;
        } else {
            return false;
        }
    }

    Double buscarMaiorPreco(List<Double> precos) {
        Double maiorPreco = precos.get(0);

        for (Double preco : precos) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    Double buscarMenorPreco(List<Double> precos) {
        Double menorPreco = precos.get(0);

        for (Double preco : precos) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    List<Double> buscarPorPrecoMinimo(List<Double> precos, Double filtro) {
        List<Double> precosFiltrados = new ArrayList<Double>();

        for (Double preco : precos) {
            if (preco >= filtro) {
                precosFiltrados.add(preco);
            }
        }
        return precosFiltrados;
    }
}
