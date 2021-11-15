import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) { 
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Collections.addAll(numeros , 11, 7, 20, 36, 8);
        imprimirLista(numeros);
        numeros.add(0,95);
        numeros.add(64);
        imprimirLista(numeros);
    }
    private static void imprimirLista(ArrayList<Integer> lista) {
        for (Integer i : lista) {
            System.out.println(i);
        }
        System.out.println("Tamaño de la lista: " + lista.size());
    }
}