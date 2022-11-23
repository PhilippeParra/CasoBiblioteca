package modelo;

public class Libro 
{
    //----------------------
    // Constantes
    //----------------------
    public final static String DUEÑOBIBLIOTECA = "Señor Pérez";

    //----------------------
    // Atributos
    //----------------------
    private String autor;
    private String añoEdicion;
    private String lujo;

    //----------------------
    // Metodos
    //----------------------
    public Libro(String pautor, String fecha, String lujo)
    {
        this.autor = pautor;
        this.añoEdicion = fecha;
        this.lujo = lujo;
    }    

    public String getAutores()
    {
        return autor;
    }

    public String getañoEdicion()
    {
        return añoEdicion;
    }

    public String getlujo()
    {
        return lujo;
    }
}
