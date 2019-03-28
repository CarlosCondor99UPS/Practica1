
package ec.edu.ups.clases;

import java.util.Date;

public class EstructuraPeriodico {
    private String nombre;
    private int numPortada;
    private String encabezado;
    private Date fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPortada() {
        return numPortada;
    }

    public void setNumPortada(int numPortada) {
        this.numPortada = numPortada;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
