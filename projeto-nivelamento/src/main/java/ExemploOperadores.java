public class ExemploOperadores {
    public static void main(String[] args) {
        //Operadores
//        + soma
//        - subtraçao
//        / div
//        * mult
//        ++ soma 1
//        -- subtrai 1
//        +=
//        -=
//        % resto
//        ** potenccia, no java usamos um método de uma classe

        Double numero01 = 42.0;
        Double numero02 = 10.0;

//        Double soma = numero01 + numero02;
        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Resto: " + (numero01 % numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado potência: %s".formatted(resultadoPotencia));
    }
}
