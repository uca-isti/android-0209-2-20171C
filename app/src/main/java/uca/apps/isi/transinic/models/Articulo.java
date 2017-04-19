package uca.apps.isi.transinic.models;

/**
 * Created by isi3 on 4/4/2017.
 */

public class Articulo {
   private int numero;
    private String nombre;
    private String descripcion;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMulta_id() {
        return multa_id;
    }

    public void setMulta_id(int multa_id) {
        this.multa_id = multa_id;
    }

    private int multa_id;
}

