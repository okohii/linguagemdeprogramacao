import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {
        /*List<String> frutas = new ArrayList<String>();
        frutas.add("Laranja");
        frutas.add("Goiaba");
        System.out.println(frutas);*/


//        List<String> frutasImutavel = List.of("Laranja", "Goiaba", "Limão");
//        System.out.println(frutasImutavel);

        List<String> frutasMutavel = new ArrayList<String>(List.of("Laranja", "Goiaba", "Limão"));
        System.out.println(frutasMutavel);

        frutasMutavel.add("Uva");
        System.out.println(frutasMutavel);

        frutasMutavel.set(2, "Melancia");
        System.out.println(frutasMutavel);

    }
}
