import java.util.List;

public class MetodosComLista {
    void exibeLista(List lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("%d° nome da lista: %s".formatted(i, lista.get(i)));
        }
    }
}
