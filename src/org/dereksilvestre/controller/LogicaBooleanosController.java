package org.dereksilvestre.controller;

public class LogicaBooleanosController {

    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
    public boolean evaluarAND(boolean a, boolean b) {
        return a && b;
    }
    public boolean evaluarOR(boolean a, boolean b) {
        return a || b;
    }
    public boolean evaluarNOT(boolean valor) {
        return !valor;
    }
    public boolean esParYPositivo(int numero) {
        return (numero > 0) && (numero % 2 == 0);
    }
    public boolean comprobarAprobacion(double nota, int asistencia) {
        return (nota >= 60) && (asistencia >= 80);
    }
    public boolean esAnioBisiesto(int anio) {
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
    }
    public boolean evaluarAcceso(boolean contraseniaCorrecta, boolean tieneToken) {
        return contraseniaCorrecta || tieneToken;
    }
    public boolean calcularDescuento(int edad, boolean esMiembro) {
        return (edad >= 65) || esMiembro;
    }
}