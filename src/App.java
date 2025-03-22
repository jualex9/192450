import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String vendedorNombre = input.nextLine().trim();

        System.out.println("Cantidad de productos vendidos:");
        int cantidadDeProductos = input.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double primerProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double segundoProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double tercerProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double cuartoProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double quintoProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double sextoProducto = input.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double septimoProducto = input.nextDouble();
        
        double comisionVendedor = 0;
            

        if (primerProducto >= 100000) {
            comisionVendedor = comisionVendedor + (primerProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (primerProducto * 0.05);
        }

        if (segundoProducto >= 100000) {
            comisionVendedor = comisionVendedor + (segundoProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (segundoProducto * 0.05);
        }

        if (tercerProducto >= 100000) {
            comisionVendedor = comisionVendedor + (tercerProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (tercerProducto * 0.05);
        }

        if (cuartoProducto >= 100000) {
            comisionVendedor = comisionVendedor + (cuartoProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (cuartoProducto * 0.05);
        }

        if (quintoProducto >= 100000) {
            comisionVendedor = comisionVendedor + (quintoProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (quintoProducto * 0.05);
        }

        if (sextoProducto >= 100000) {
            comisionVendedor = comisionVendedor + (sextoProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (sextoProducto * 0.05);
        }

        if (septimoProducto >= 100000) {
            comisionVendedor = comisionVendedor + (septimoProducto * 0.10);
        } else {
            comisionVendedor = comisionVendedor + (septimoProducto * 0.05);
        }

        double ventaTotal = (primerProducto + segundoProducto + tercerProducto + cuartoProducto + quintoProducto + sextoProducto + septimoProducto);
        double gananciaVendedor = (double) (comisionVendedor + 10);

        System.out.println("Vendedor: " + vendedorNombre);
        System.out.println("Total ventas: " + ventaTotal);
        System.out.println("Comisiones: " + comisionVendedor);
        System.out.println("Salario total: " + gananciaVendedor);
    }
}
