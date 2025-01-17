import java.util.Scanner;

public class Aparcamiento {
    public static void main(String[] args) {
        String matricula = "";
        int tarifa,cantHoras, cont1=0, cont2=0, cont3=0;
        double total, totalDia;
        Scanner teclado = new Scanner(System.in);

      while(!placa.equalsIgnoreCase(another string:"fin")){

        System.out.println("Introduce el número de su matricula");
        matricula = teclado.nextLine();

        System.out.println("Elige la tarifa:");
        System.out.println("1 - por hora;");
        System.out.println("2 - media jornada, 5 horas;");
        System.out.println("3 - jornada completa.");

        if (tarifa<=0 || tarifa>3) {
          System.out.println("El número no corresponde a ninguna tarifa");
        } else {
            if (tarifa ==1 ) {
                System.out.println("Introduce la cantidad de horas");
                cantHoras = teclado.nextInt();
                total = cantHoras*3;
                System.out.println("El precio total de su estacionamiento es de" + total "EUR");
                cont1 = cont1 +1;
            } else {
                if (tarifa ==2 ) {
                System.out.println("No se admiten compras minoristas");
           
