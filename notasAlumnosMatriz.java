package matrizCuadrada;
import java.util.Scanner;

public class notasAlumnosMatriz {
    public static void main(String[] args) {
          double notas [][] = new double [4][3];
          double promedios [] = new double [4];
          Scanner teclado = new Scanner(System.in);

      
          for (int f=0; f < notas.length; f++) {
            System.out.println("Introduce las 3 notas del alumno " + f);
            for (int c=0; c < notas[0].length; c++){
              notas[f][c] = teclado.nextDouble();
            }
          }
      //calculamos los promedios
        double total = 0;
      
          for (int f=0; f < notas.length; f++) {
            for (int c=0; c < notas[0].length; c++){
              total = total + notas[f][c];
            }
            promedios [f] = total / notas[0].length;
          }

      //mostramos las notas

      for (int f=0; f < notas.length; f++) {
            System.out.println("Las notas del alumno N " + (f+1) + "son: ");
            for (int c=0; c < notas[0].length; c++){
               System.out.println(notas[f][c]);
            }
        System.out.println("El promedio fue de " + promedios [f]);
        System.out.println("______________________________________ ");
          }

      
             teclado.close();

                                            }
                            }
