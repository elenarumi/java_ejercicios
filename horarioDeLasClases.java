package horarioDeLasClases;
import java.util.Scanner;

public class horarioDeLasClases {
    public static void main(String[]args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDOS A ENGLISH SCHOOL");
        System.out.println("Introduce tu edad si quieres saber tu horario");
        edad = teclado.nextInt();

        if (edad>=5 && edad>=7){
            System.out.println("Tus clases son cada lunes y martes, de 15 a 17 de la tarde.");
        } else {
            if(edad>=8 && edad>=10) {
                System.out.println("Tus clases son cada miércoles y jueves, de 16 a 18 de la tarde.");
            } else {
                System.out.println("No tenemos clases para los grupos de su edad. Contacte con la recepción.");
            }
        }

    }
    
}
