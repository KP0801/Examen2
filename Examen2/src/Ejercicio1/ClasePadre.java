package Ejercicio1;

/**
 *
 * @author Kevin
 */
abstract class ClasePadre {

    private String Id;
    private String Nombre;
    private String UsarBaseDatos;
    private String ContraseniaBaseDatos;
    private String NombreBaseDatos;
    private String UrlBaseDatos;

    public abstract void crear();

    public abstract void obtener();

    public abstract void actualizar();

    public abstract void eliminar();

    //No agrege setters y getters por que los metodos ya hacen el mismo trabajo 
}
