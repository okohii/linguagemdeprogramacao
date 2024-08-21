public class MetodosUteis {
    //Método
    // Retorno: esse é void, sem retorno
    // nome:
    // argumentos:
    // corpo;

    void exibirUsuario(String nomeUsuario, Integer idade) {
        System.out.println("""
                *---------------*---------------*
                Usuário logado: %s
                Idade: %d
                *---------------*---------------*
                """.formatted(nomeUsuario, idade));
    }

    Double somar(Double num01, Double num02) {
        return num01+num02;
    }
}
