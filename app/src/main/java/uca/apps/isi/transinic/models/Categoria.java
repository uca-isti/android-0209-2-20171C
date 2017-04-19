package uca.apps.isi.transinic.models;

import io.realm.RealmObject;

/**
 * Created by isi3 on 4/4/2017.
 */

public class Categoria extends RealmObject{
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;


}
