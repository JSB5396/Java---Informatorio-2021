import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long cantidadDeValores = palabras.stream()
                                .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
                                .count();
        System.out.println(cantidadDeValores);
    }
}