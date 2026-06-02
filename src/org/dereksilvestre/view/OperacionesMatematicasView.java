package org.dereksilvestre.view;

import java.util.Scanner;

public class OperacionesMatematicasView {
    private final Scanner scanner;

    public OperacionesMatematicasView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarSubMenuMatematicas() {
        System.out.println("\n--- MODULO A: OPERACIONES MATEMATICAS ---");
        System.out.println("1. Calculadora de Salario");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Promedio Academico");
        System.out.println("4. Convertidor de Temperatura");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione un ejercicio: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

 
    public double pedirDouble(String mensaje) {
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}