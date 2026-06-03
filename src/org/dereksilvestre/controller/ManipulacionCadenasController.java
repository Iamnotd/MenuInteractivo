package org.dereksilvestre.controller;

public class ManipulacionCadenasController {

    public int obtenerLongitudCadena(String texto) {
        return texto.length();
    }
    public String convertirAMayusculas(String texto) { 
        return texto.toUpperCase();
    }
    public String convertirAMinusculas(String texto) {
        return texto.toLowerCase();
    }
    public String invertirCadena(String texto) { 
        return new StringBuilder(texto).reverse().toString();
    }
    public int buscarCaracter(String texto, char caracter) {
        return texto.indexOf(caracter);
    }
}