package Ejercicio1;

public class Cliente extends ClasePadre {

    private String Direccion;
    private String FechaNacimiento;

    public void crear() {
        System.out.println("Este metodo crea un nuevo cliente");
    }

    public void obtener() {
        System.out.println("Este metodo muestra la informacion del cliente actual");

    }

    public void actualizar() {
        System.out.println("Este metodo acutaliza la informacion del cliente actual");
    }

    public void eliminar() {
        System.out.println("Este metodo borra la informacion del cliente actual");
    }

}
