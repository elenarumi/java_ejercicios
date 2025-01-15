import java.util.Scanner;

public class EjemploCompras {
    public static void main(String[] args) {
        int cantidadProductos;
        double precioTotal, diferencia, descuento, totalConDesc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de productos");
        cantidadProductos = teclado.nextInt();

        if (cantidadProductos < 5) {
            if (cantidadProductos < 0) {
                System.out.println("No se admiten números negativos");
            } else {
                System.out.println("No se admiten compras minoristas");
            }
        } else {
            System.out.println("Introduce el precio total de la compra");
            precioTotal = teclado.nextDouble();

            if (cantidadProductos >= 5 && cantidadProductos <= 15) {
                System.out.println("El precio del envío = 10 EUR");
                precioTotal += 10;
            } else {
                System.out.println("El envío es gratis");
            }

            if (precioTotal < 100) {
                diferencia = 100 - precioTotal;
                System.out.println("El precio total es menor que 100 euros. Para tener derecho al descuento faltan " + diferencia + " EUR");
            } else {
                if (precioTotal >= 100 && precioTotal <= 300) {
                    descuento = precioTotal * 0.05;
                    totalConDesc = precioTotal - descuento;
                    System.out.println("Por su compra tiene un descuento. El precio final con descuento es " + totalConDesc + " EUR");
                } else {
                    descuento = precioTotal * 0.10;
                    totalConDesc = precioTotal - descuento;
                    System.out.println("Por su compra tiene un descuento. El precio final con descuento es " + totalConDesc + " EUR");
                }
            }
        }
    }
}
