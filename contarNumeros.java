package contarNumeros;
import java.util.Scanner;

public class contarNumeros {
    public static void main(String[] args) {
          int numeros [] =new int [10];
          Scanner teclado = new Scanner(System.in);
      
          for (int i=0, i<numeros.length, i++) {
              System.out.println("Introduce el número para el índice" + i);
              numeros[i]= teclado.nextInt();
          }


      
           int cont3 = 0;
          for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3) {
                cont3++;
            }
        }
        
        if (cont3 == 1) {
            System.out.println("El número 3 fue introducido 1 vez.");
        } else if (cont3 > 1) {
            System.out.println("El número 3 fue introducido " + cont3 + " veces.");
        } else {
            System.out.println("El número 3 no fue introducido.");
        }
      
        
                                        }
             teclado.close();

                                            }
                          
