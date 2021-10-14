import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>();   
        Collections.addAll(baraja, "2", "3", "4", "5", "6", "7", "8",
                                    "9", "10", "J", "Q", "K", "A");
        System.out.println("Baraja francesa de menor a mayor rango: " + baraja);
        
        Collections.reverse(baraja);
        System.out.println("Baraja francesa en orden inverso: " + baraja);
        Collections.shuffle(baraja);
        System.out.println("Baraja francesa mezclada: " + baraja);
    }
}