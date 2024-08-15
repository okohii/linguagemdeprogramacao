public class ExemploCondicionais {
    public static void main(String[] args) {
//        É igual no java
//        &&
//        ||
//        >
//        <
//        >=
//        <=
//        CUIDADO COM ==
        Integer idade = 19;

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        String nome01 = "Bob";
        String nome02 = "Bob";
        String nome03 = "Bobs";

        if (nome01.equals(nome02) && !nome01.equals(nome03)) {
            System.out.println("O nome é igual.");
        } else {
            System.out.println("O nome é diferente");
        }

        //Operador Ternário
        String resultadoMaioridade = idade >= 18 ? "Sim" : "Não";
        Boolean ehMaiorDeIdade = idade >= 18;

        System.out.println("É maior de idade; " + resultadoMaioridade);

    }
}
