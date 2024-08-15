public class ExemploRevisao {
    public static void main(String[] args) {
        //Tipos que mais usaremos

        //Tipos Wrapper = São classes que possuem métodos que ajudam :)
        //Valor inicial do Wrapper = null
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;

        //Somente println
        System.out.println("batata\nFrita");
        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome,altura,idade));

        //println usando interpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome,idade,altura,"Caramelo"));

        //Declara e inicializa
        String nomePet;
        nomePet = "Teste";


        //Não usaremos...
        //Tipos primitivos, não são classes, sem métodos :(
        //Sempre tem valor inicial
        boolean bloqueado02 = false;
        int numero = 42;


    }
}
