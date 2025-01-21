package contadorSencillo;
import java.util.Scanner;

public class contadorSencillo {
    public static void main(String[] args) {
          int numero;
          Scanner teclado = new Scanner(System.in);

          System.out.println("¿Hasta qué número quieres que cuente?");
          numero = teclado.nextInt();

          for (int i=0; i<numero; i++) {
          System.out.println(i+1);
                                        }
             teclado.close();

                                            }
                            }
