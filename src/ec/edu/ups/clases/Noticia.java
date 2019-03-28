
package ec.edu.ups.clases;

import java.util.Date;


public class Noticia {
    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private Multimedia multimedia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
    
    
}
