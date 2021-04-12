package examen2;

import Ejercicio1.Cliente;
import Ejercicio1.Cliente;
import Ejercicio1.Producto;
import Ejercicio1.Producto;
import Ejercicio2.StringManagment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kevin
 */
public class Examen2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 1 para ejercicio 1");
        System.out.println("Escriba 2 para ejercicio 2");
        System.out.println("Escriba 3 para ejercicio 3");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1: {
                Cliente cliente = new Cliente();
                cliente.crear();
                cliente.obtener();
                cliente.actualizar();
                cliente.eliminar();

                System.out.print("\n\n");

                Producto producto = new Producto();
                producto.crear();
                producto.obtener();
                producto.actualizar();
                producto.eliminar();
                break;

            }
            case 2: {
                StringManagment stringManagment = new StringManagment(46);

                stringManagment.setTrama("Juanito Perez  0801199901234Ingenieria Química");

                stringManagment.add_regla("ClienteNombre", 0, 14, "Nombre cliente");
                stringManagment.add_regla("Identidad", 15, 27, "Identidad cliente");

                System.out.println(stringManagment.get_parte("ClienteNombre"));
                System.out.println(stringManagment.get_parte("Identidad"));
                break;
            }

            case 3: { //Hice el ejercicio 3 en el main ya que hacer un objeto a este problema de tipo logico era inecesario y mas tedioso.
                System.out.println("Ingrese el numero de la tarjeta de credito:");
                String numeroTarjeta = sc.nextLine();
                sc.nextLine();
                boolean encontrado = false;
                while (numeroTarjeta.length() > 16) {
                    System.out.print("El numero de la tarjeta es muy largo vuelva a ingresarlo:");
                    numeroTarjeta = sc.nextLine();

                }
                if (numeroTarjeta.matches("«^(?:\\\\+|-)?\\\\d+$»")) {
                    System.out.println("Tarjeta no esta enmascarada");
                } else {
                    System.out.println("Tarjeta esta enmascarada");
                }

            }
        }

    }

}
