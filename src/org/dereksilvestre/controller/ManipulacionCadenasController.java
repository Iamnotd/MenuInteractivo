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
    public int contarVocales(String texto) {
        int contador = 0;
        String textoMinus = texto.toLowerCase();
        
        for (int i = 0; i < textoMinus.length(); i++) {
            char letra = textoMinus.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public int contarPalabras(String texto) {
        String textoLimpio = texto.trim();
        if (textoLimpio.isEmpty()) {
            return 0;
        }
        String[] palabras = textoLimpio.split("\\s+");
        return palabras.length;
    }
    public String reemplazarCaracter(String texto, char antiguo, char nuevo) {
        return texto.replace(antiguo, nuevo);
    }
    public boolean comprobarCadenaVacia(String texto) {
        return texto.trim().isEmpty();
    }
}