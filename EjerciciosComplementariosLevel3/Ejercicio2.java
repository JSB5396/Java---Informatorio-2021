import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer elevado = 2;
        List<Integer> numerosAlCuadrado = palabras.stream()
                                                .map(numero -> potenciacion(numero, elevado))
                                                .collect(Collectors.toList());
        System.out.println(numerosAlCuadrado);
    }
    private static Integer potenciacion(Integer numero, Integer elevado) {
        if (elevado == 0){
            return 1;
        }else {
            return numero * potenciacion(numero, elevado-1);
        }
    }
}