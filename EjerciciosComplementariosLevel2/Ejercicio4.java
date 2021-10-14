import java.util.*;
public class Ejercicio4 { 
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();
        Collections.addAll(estudiantes, "Pedro", "Juan", "Ana", "Lisa", "Marcos", "Sofia", "Luis",
                                         "Maria", "Jose", "Florencia", "Agustin", "Liliana");

        List<String> cursoA = estudiantes.subList(0, 4);
        List<String> cursoB = estudiantes.subList(4, 8);
        List<String> cursoC = estudiantes.subList(8, 12);
        System.out.println("Alumnos del curso A: " + cursoA + "\n" + 
                            "Alumnos del curso B: " + cursoB + "\n" +
                             "Alumnos del curso C: " + cursoC);
    }
}