package vectores2;
import java.util.Scanner;

public class vectores2 {
    public static void main(String[] args) {
          int numeros [] = new int [10];
          Scanner teclado = new Scanner(System.in);
      
          for (int i = 0; i < numeros.length; i++) {
              System.out.println("Introduce el número para el índice" + i);
              numeros[i]= teclado.nextInt();
          }
      int mayor = Integer.MIN_VALUE;
          for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > mayor) {
                  mayor = numeros[i];
                }

          }

      int menor = Integer.MAX_VALUE;
          for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                  menor = numeros[i];
                }

          }

      System.out.println("El número mayor de la secuencia es:" + mayor + ".");
      System.out.println("El número menor de la secuencia es:" + menor + ".");
      
      
        
                                        }
             

                                            }
                          
