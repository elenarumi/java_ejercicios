package subscription;
import java.util.Scanner;

public class subscription {
    public static void main(String[] args) {

        boolean subscription = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while (subscription) {
            System.out.println("Estás suscrito(a) al canal");
            System.out.println("¿Quieres anular la suscripción? (si/no)");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("si")) {
                subscription = false;
                System.out.println("Has anulado la suscripción.");
            } else {
                System.out.println("El precio por mantener tu suscripción es 5 euros al mes.");
            }

            System.out.println("___________________________________________");
        }

        System.out.println("Gracias por usar el servicio.");
        teclado.close();
    }
}
