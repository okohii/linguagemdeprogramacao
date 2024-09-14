import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {

//        Principais métodos da lista no java
//                add - adiciona elemento
//                size - retorna o tamanho
//                get - busca elemento por indice
//                set - altera o elemento
//                remove - remove o elmento
//                isEmpty - retorna true or false
//                clear - limpa a lista

        List listaEstranha = new ArrayList();

        MetodosComLista metodos =  new MetodosComLista();

        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(42);

        List<String> nomes = new ArrayList<>();

        nomes.add("Bob da Silva");
        nomes.add("José Alberto");
        nomes.add("Maria Felchada");

        metodos.exibeLista(nomes);
    }
}
