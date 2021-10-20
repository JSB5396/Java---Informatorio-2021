import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in); 
        System.out.println("¿Cuantas ciudades favoritas desea en su ranking?: ");
        int favoritas = intScan.nextInt();
        imprimirRanking(favoritas);
        intScan.close();
    }
    public static void imprimirRanking(int favoritas) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner strScan = new Scanner(System.in);
        int sizeList = 1;
        int ranking = 1;
        System.out.println("Ahora escribelas una debajo de otra: ");
        do { 
            String ciudades = strScan.nextLine();
            lista.add(ciudades);
            sizeList++;
        } while (sizeList <= favoritas);
        for (int i=0; i < lista.size(); i++) {
            System.out.println("#" + (ranking++) + " - " + lista.get(i));
        }
        strScan.close();
    }
}