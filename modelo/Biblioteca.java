package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList libros;

    public Biblioteca()
    {
        libros = new ArrayList();
    }

    public void agregarlibro(Libro lib)
    {
        libros.add(lib);
    }

    public Libro getLibro(int i)
    {
        return (Libro) libros.get(i);
    }

    public int getNumerodeLibros()
    {
        return libros.size();
    }
}
