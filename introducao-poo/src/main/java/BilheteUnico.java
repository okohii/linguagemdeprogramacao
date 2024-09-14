public class BilheteUnico {
    //Atributos = Caracteristicas do objeto
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsada;
    Boolean estudante;

    //Métodos = Comportamentos

    void carregar(Double valorRecarga) {
        if (valorRecarga >= 10) {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada!");
        } else {
            System.out.println("O valor mínimo da recarga é 10R$");
        }
    }

    Boolean usar() {
        if (estudante && saldo >= 2.50) {
            saldo -= 2.50;
            qtdVezesUsada++;
            return true;
        } else if (!estudante && saldo >= 5.00) {
            saldo -= 5.00;
            qtdVezesUsada++;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}