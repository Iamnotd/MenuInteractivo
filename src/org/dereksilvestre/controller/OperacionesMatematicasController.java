package org.dereksilvestre.controller;

public class OperacionesMatematicasController {

    public double calcularSalario(double horas, double pagoPorHora) {
        return horas * pagoPorHora;
    }
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }
    public double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}