import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte(Integer numeroEscolhido) {
        Integer tentativas = 1;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);

        while (numeroSorteado != numeroEscolhido) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
            tentativas++;
        }

        return tentativas;
    }

    Integer exibeSomaSorteio() {
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        Integer numeroSorteado2 = ThreadLocalRandom.current().nextInt(0,11);
        return numeroSorteado + numeroSorteado2;
    }

    void exibeImpares() {
        for (int i = 0; i <= 90; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    Integer posicaoSorteio(Integer numero) {
        Integer posicao = -1;
        Integer sorteado = 0;
        if (numero < 1 || numero > 100) {
            System.out.println("Número Não Permitido. Insira um número entre 1 e 100");
        } else {
            for (int i = 1; i <= 200; i++) {
                sorteado = ThreadLocalRandom.current().nextInt(1, 101);
                if (numero.equals(sorteado)) {
                    posicao = i;
                }
            }
        }
            return posicao;
    }
}
