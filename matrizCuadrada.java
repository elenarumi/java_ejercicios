package matrizCuadrada
import java.util.Scanner;

public class cmatrizCuadrada {
    public static void main(String[] args) {
          int matriz [][] = new int [3][3];
          Scanner teclado = new Scanner(System.in);

      
          for (int f=0; f<matriz.lenght; f++) {
            for (int c=0; c<matriz[0].lenght; c++){
              System.out.println("Introduce valor para la fila" + f + "columna" + c);
              matriz[f][c] = teclado.nextInt();
            }
          }
      //recorrido y muestra de los valores
          for (int f=0; f<matriz.lenght; f++) {
            for (int c=0; c<matriz[0].lenght; c++){
              System.out.println("Fila:" + f + ";" + "Columna:" + c + ";" + "Valor" + matriz[f][c]);
              matriz[f][c] = teclado.nextInt();
            }
          }
         
             teclado.close();

                                            }
                            }
