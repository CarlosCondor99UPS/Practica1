package ec.edu.ups.clases;

import java.util.Date;

public class Multimedia {

    //Declaracion de variables
    private String nombre;
    private String formato;
    private double tamanoBytes;
    private Byte[] archivo;
    private Date creacion;
    private Date modificacion;

    //Setters and getters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanoBytes() {
        return tamanoBytes;
    }

    public void setTamanoBytes(double tamanoBytes) {
        this.tamanoBytes = tamanoBytes;
    }

    public Byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(Byte[] archivo) {
        this.archivo = archivo;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getModificacion() {
        return modificacion;
    }

    public void setModificacion(Date modificacion) {
        this.modificacion = modificacion;
    }

}
