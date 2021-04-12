package Ejercicio2;

public class Rule {

    private String Nombre;
    private int posicionInicio;
    private int posicionFinal;
    private String Descripcion;

    public Rule(String nombre, int posicionInicio, int posicionFinal, String descripcion) {
        this.Nombre = nombre;
        this.posicionInicio = posicionInicio;
        this.posicionFinal = posicionFinal;
        this.Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPosicionInicio() {
        return posicionInicio;
    }

    public void setPosicionInicio(int posicionInicio) {
        this.posicionInicio = posicionInicio;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
