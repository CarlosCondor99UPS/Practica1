package ec.edu.ups.clases;

public class RedSocial {

    //Declaracion de variables
    private int codigo;
    private String nombre;
    private String url;
    private String publicaciones;

    //Setters and getters de los atributos
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", url=" + url + '}';
    }

}
