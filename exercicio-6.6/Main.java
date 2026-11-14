import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // 1. Remover números menores que zero
        List<Integer> numeros = Arrays.asList(-5, 10, -2, 8, 3, -1);

        List<Integer> positivos = numeros.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());

        System.out.println("Números positivos: " + positivos);


        // 2. Exibir palavras que começam com P
        List<String> palavras = Arrays.asList(
                "Programação", "Java", "Python", "Computador", "Projeto"
        );

        List<String> palavrasP = palavras.stream()
                .filter(p -> p.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println("Palavras com P: " + palavrasP);


        // 3. Exibir palavras únicas de um parágrafo

        String texto = "Java é uma linguagem de programação e Java é muito utilizada";

        Set<String> palavrasUnicas = Arrays.stream(texto.split("\\s+"))
                .collect(Collectors.toCollection(
                        java.util.LinkedHashSet::new
                ));

        System.out.println("Palavras únicas: " + palavrasUnicas);

    }
}
