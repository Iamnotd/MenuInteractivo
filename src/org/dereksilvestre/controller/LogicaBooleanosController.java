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
}