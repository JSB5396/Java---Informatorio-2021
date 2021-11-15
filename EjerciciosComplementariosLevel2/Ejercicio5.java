import java.io.*;
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();
        System.out.println("Cargue las horas trabajadas(una debajo de otra) por dia en la semana(de lun a vie): ");
        cargarEnLista(horasTrabajadas);
        System.out.println("Cargue los valores por hora(uno debajo de otro) trabajada en la semana(de lun a vie): ");
        cargarEnLista(valorPorHora);
        for (int i=0; i < horasTrabajadas.size() && i < valorPorHora.size(); i++) {
            totales.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        Integer totalFinal = totales.stream()
                                    .mapToInt(Integer::intValue)
                                    .sum();                      
        System.out.println(totales + "\n" + "Total Final: $ " + totalFinal);
    }
    private static ArrayList<Integer> cargarEnLista(ArrayList<Integer> lista) {
        Console consola = System.console();
        Integer datos;
        for (Integer i=1; i <= 5; i++) {
            datos = Integer.parseInt(consola.readLine());
            lista.add(datos);
        }
        return lista;
    }
}  