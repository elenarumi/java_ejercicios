package Aparcamiento;
import java.util.Scanner;

public class Aparcamiento {
    public static void main(String[] args) {
        String matricula = "";
        int tarifa, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double total = 0, totalDia = 0;
        Scanner teclado = new Scanner(System.in);

        while (!matricula.equalsIgnoreCase("fin")) {
            System.out.println("Introduce el número de su matricula");
            matricula = teclado.nextLine();

            if (!matricula.equalsIgnoreCase("fin")) {
                System.out.println("Elige la tarifa:");
                System.out.println("1 - por hora;");
                System.out.println("2 - media jornada, 5 horas;");
                System.out.println("3 - jornada completa.");
                tarifa = teclado.nextInt();

                if (tarifa <= 0 || tarifa > 3) {
                    System.out.println("El número no corresponde a ninguna tarifa");
                } else {
                    if (tarifa == 1) {
                        System.out.println("Introduce la cantidad de horas");
                        cantHoras = teclado.nextInt();
                        total = cantHoras * 3;
                        System.out.println("El precio total de su estacionamiento es de " + total + " EUR");
                        cont1++;
                        totalDia += total;
                    } else if (tarifa == 2) {
                        System.out.println("La tarifa de media jornada es de 5 horas. Ud dispone de un descuento de 5%");
                        total = 15 - (15 * 0.05);
                        System.out.println("El precio total de su estacionamiento es de " + total + " EUR");
                        cont2++;
                        totalDia += total;
                    } else {
                        System.out.println("La tarifa de jornada completa es equivalente a 10h y tiene un descuento de 10%");
                        total = 30 - (30 * 0.10);
                        System.out.println("El precio total de su estacionamiento es de " + total + " EUR");
                        cont3++;
                        totalDia += total;
                    }
                }
                System.out.println("¡MUCHAS GRACIAS POR SU COMPRA!");
            }
            teclado.nextLine(); // Clear buffer after reading integer
        }
        
        // Moved this part outside the loop
        System.out.println("Cantidad de servicios contratados de tarifa 1: " + cont1);
        System.out.println("Cantidad de servicios contratados de tarifa 2: " + cont2);
        System.out.println("Cantidad de servicios contratados de tarifa 3: " + cont3);
        System.out.println("El precio total es " + totalDia + " EUR");

        teclado.close();
    }
}
