package org.dereksilvestre.controller;

public class OperacionesMatematicasController {

    public double calcularSalario(double horas, double pagoPorHora) {
        return horas * pagoPorHora;
    }
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }
}