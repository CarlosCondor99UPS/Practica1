package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Seccion {

    //Declaracion de variables
    private String nombre;
    private List<Noticia> noticias;

    //Constructor
    public Seccion(){
        noticias = new ArrayList<>();
    }
    
    //Setters and getters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }

    
    
    public void agregarNoticia(Noticia noticia){
        this.noticias.add(noticia);
    }

}
