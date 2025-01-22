package notasAlumnos;
import java.util.Scanner;

public class notasAlumnos {
    public static void main(String[] args) {
        double notas[][] = new double[4][3]; // Matriz para almacenar las notas de los alumnos
        double promedios[] = new double[4]; // Vector para almacenar los promedios
        Scanner teclado = new Scanner(System.in);

        // Ingresar las notas de los alumnos
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Introduce las 3 notas del alumno " + (f + 1) + ":");
            for (int c = 0; c < notas[0].length; c++) {
                notas[f][c] = teclado.nextDouble();
            }
        }

        // Calcular los promedios
        for (int f = 0; f < notas.length; f++) {
            double total = 0; // Reiniciar el total para cada alumno
            for (int c = 0; c < notas[0].length; c++) {
                total += notas[f][c];
            }
            promedios[f] = total / notas[0].length;
        }

        // Mostrar las notas y los promedios
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Las notas del alumno N° " + (f + 1) + " son:");
            for (int c = 0; c < notas[0].length; c++) {
                System.out.println("- Nota " + (c + 1) + ": " + notas[f][c]);
            }
            System.out.println("El promedio fue de: " + promedios[f]);
            System.out.println("______________________________________");
        }

        teclado.close(); 
    }
}
