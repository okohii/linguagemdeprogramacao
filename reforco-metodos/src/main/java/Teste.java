public class Teste {
    public static void main(String[] args) {
        MetodosDivertidos metodosDivertidos = new MetodosDivertidos();

        //Avaliando Sorte
//        Integer tentativas = metodosDivertidos.avaliandoSorte(4);
//
//        System.out.println("Tentativas = " + tentativas);
//
//        if (tentativas <= 3) {
//            System.out.println("Você é MUITO sortudo");
//        } else if (tentativas <= 10) {
//            System.out.println("Você é sortudo");
//        } else {
//            System.out.println("É melhor você parar de apostar e ir trabalhar");
//        }
//
//        System.out.println("A soma dos números é: " + metodosDivertidos.exibeSomaSorteio());
//
//        metodosDivertidos.exibeImpares();

        Integer posicao = metodosDivertidos.posicaoSorteio(1);

        if (posicao == -1) {
            System.out.println("Número não sorteado.");
        } else {
            System.out.println("Posição de sorteio: " + posicao);
        }
    }
}
