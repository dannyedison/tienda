package com.example.tiendaropa;

import android.graphics.drawable.Drawable;

public class ListElement {
    private String nombre;
    private String precio;
    private int imagen;

    public ListElement(String nombre, String precio, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public CharSequence getPrecio() {
        return precio;
    }

    public int getImagen() {
        return imagen;
    }



}



