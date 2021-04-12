package Ejercicio2;

import java.util.List;
import java.util.ArrayList;
import Ejercicio2.Rule;

/**
 *
 * @author Kevin
 */
public class StringManagment {

    private String trama;
    private int longitud;
    private List<Rule> Rules = new ArrayList<Rule>();

    public StringManagment(int longitud) {
        this.longitud = longitud;
    }

    public void setTrama(String trama) {
        if (this.longitud != trama.length()) {
            System.out.println("Mensaje de error");
            System.out.println("Longitud de la trama no es valida");
        } else {
            this.trama = trama;
        }
    }

    public void add_regla(String nombre, int posInicio, int posFinal, String descripcion) {
        boolean reglaValida = true;

        if (this.Rules.size() > 1) {

            for (Rule regla : this.Rules) {
                if ((posInicio >= regla.getPosicionInicio() || posInicio <= regla.getPosicionFinal())
                        || (posFinal >= regla.getPosicionInicio() || posFinal <= regla.getPosicionFinal())) {

                    reglaValida = false;

                }
            }

        }

        if (reglaValida) {
            this.Rules.add(new Rule(nombre, posInicio, posFinal, descripcion));
        } else {
            System.out.println("Regla invalida");
        }

    }

    public String get_parte(String nombreRule) {
        String resultado;
        Rule reglaEncontrada = null;

        for (Rule regla : this.Rules) {
            if (regla.getNombre().equals(nombreRule)) {
                reglaEncontrada = regla;
                break;
            }
        }

        if (reglaEncontrada == null) {
            resultado = "El nombre ingresado de la regla no existe.";
        } else {
            resultado = this.trama.substring(reglaEncontrada.getPosicionInicio(), reglaEncontrada.getPosicionFinal());
        }

        return resultado;
    }
}
