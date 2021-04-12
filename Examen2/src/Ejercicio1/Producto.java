package Ejercicio1;

/**
 *
 * @author Kevin
 */
public class Producto extends ClasePadre {

    private int Cantidad;
    private String FechaCreacion;
    private String FechaVencimiento;

    public void crear() {
        System.out.println("Este metodo crea un nuevo producto");
    }

    public void obtener() {
        System.out.println("Este metodo muestra la informacion del producto actual");

    }

    public void actualizar() {
        System.out.println("Este metodo acutaliza la informacion del producto actual");
    }

    public void eliminar() {
        System.out.println("Este metodo borra la informacion del producto actual");
    }
}
