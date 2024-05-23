
package com.mycompany.trackstreetfighter;

/**
 *
 * @author Windows
 */
public class Ruta {
    int numeral;
    String Indicador;
    String hora;
    String nombre_ruta;

    Ruta(int numeral,String Indicador, String hora, String nombre_ruta) {
        this.numeral=numeral;
        this.Indicador=Indicador;
        this.hora=hora;
        this.nombre_ruta=nombre_ruta;
    }
    public String imprimirDetalles() {
        return String.format(
            "Ruta recomendada: %s\n"+

            "Pasa por:  %s  %d\n"+

            "El proximo llegara a las %s\n"+

            "-----------\n"

            , nombre_ruta, Indicador,numeral,hora);
    }
}
