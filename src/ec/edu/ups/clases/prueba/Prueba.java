package ec.edu.ups.clases.prueba;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.util.Date;

public class Prueba {

    public static void main(String[] args) {
        
        //Instancia de un objeto de clase Red Social
        RedSocial facebook = new RedSocial();
        //Seteo de datos
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");

        //Obtencion de datos con get y salida de datos
        int codigoFace = facebook.getCodigo();
        System.out.println("Codigo: " + codigoFace);
        String nombreFace = facebook.getNombre();
        System.out.println("Nombre: " + nombreFace);
        String urlFace = facebook.getUrl();
        System.out.println("URL: " + urlFace);
        System.out.println(facebook.toString());
        
        
        Multimedia video=new Multimedia();
        video.setFormato(".mov");
        video.setNombre("Pelicula");
        video.setTamanoBytes(35.5);
        video.setCreacion(new Date());
        video.setModificacion(new Date());
        Byte[] bytes={5,6,7};
        video.setArchivo(bytes);
        
        String formatoVideo=video.getFormato();
        System.out.println("Formato: "+formatoVideo);
        String nombreVideo=video.getNombre();
        System.out.println("Nombre: "+nombreVideo);
        bytes=video.getArchivo();
        System.out.println("Bytes: "+bytes);
        Date fechaCreacionVideo=video.getCreacion();
        System.out.println("Fecha de creacion: "+fechaCreacionVideo);
        Date fechaModifiVideo=video.getModificacion();
        System.out.println("Fecha de modificacion: "+fechaModifiVideo);
        double tamanoBytesVideo=video.getTamanoBytes();
        System.out.println("Tamano: "+tamanoBytesVideo);
        System.out.println("");
        
        Noticia noticia1=new Noticia();
        noticia1.setAutor("Carlos Condor");
        noticia1.setContenido("El D.Cuenca gana 3-0 al Real Madrid");
        noticia1.setFechaCreacion(new Date());
        noticia1.setMultimedia(video);
        noticia1.setTitulo("El D.Cuenca primero en tablas");
        
        Noticia noticia2=new Noticia();
        noticia2.setAutor("don Boxco");
        noticia2.setContenido("EL D.Cuenca golea al barcelona");
        noticia2.setFechaCreacion(new Date());
        noticia2.setMultimedia(video);
        noticia2.setTitulo("El D.Cuenca gana al barcelona");
        
        
        
        
        String tituloNoticia1=noticia1.getTitulo();
        System.out.println("Titulo: "+tituloNoticia1);
        String autorNoticia1=noticia1.getAutor();
        System.out.println("Autor: "+autorNoticia1);
        Date fechaNoticia1=noticia1.getFechaCreacion();
        System.out.println("Fecha: "+fechaNoticia1);
        String contenidoNoticia1=noticia1.getContenido();
        System.out.println("Contenido: "+contenidoNoticia1);
        Multimedia videoNoticia1=noticia1.getMultimedia();
        System.out.println("Multimedia: "+videoNoticia1);
        System.out.println("");
        
        Seccion deportes=new Seccion();
        deportes.setNombre("Deportes");
        deportes.agregarNoticia(noticia1);
        deportes.agregarNoticia(noticia2);
        
        
        String nombreSeccion=deportes.getNombre();
        System.out.println("Nombre: "+nombreSeccion);
        System.out.println("");
        
        EstructuraPeriodico estructura1=new EstructuraPeriodico();
        estructura1.setEncabezado("El deportivo Cuenca GANA");
        estructura1.setFecha(new Date());
        estructura1.setNombre("El PERIODICO");
        estructura1.setNumPortada(1);
        
        String encabezadoEstructura=estructura1.getEncabezado();
        System.out.println("Encabezado: "+encabezadoEstructura);
        Date fechaEstructura=estructura1.getFecha();
        System.out.println("Fecha: "+fechaEstructura);
        String nombreEstructura=estructura1.getNombre();
        System.out.println("Nombre: "+nombreEstructura);
        int numPortadaEstructura=estructura1.getNumPortada();
        System.out.println("Numero Portada: "+numPortadaEstructura);
        System.out.println("");
   
    }
}
