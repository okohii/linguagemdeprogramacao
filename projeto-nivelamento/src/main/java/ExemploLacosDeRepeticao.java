import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
//        For que exibe números de 0 a 10
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        Integer cont = 0;
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt( 0,6);
        System.out.println("Sorteado = " + inteiroAleatorio);
        while (inteiroAleatorio != 3) {
            inteiroAleatorio = ThreadLocalRandom.current().nextInt( 0,6);
            System.out.println("Sorteado = " + inteiroAleatorio);

        }
    }
}
