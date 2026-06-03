package org.dereksilvestre.view;

import java.util.Scanner;

public class LogicaBooleanosView {
    private final Scanner scanner;

    public LogicaBooleanosView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarSubMenuLogica() {
        System.out.println("\n--- MÓDULO C: LÓGICA Y BOOLEANOS ---");
        System.out.println("1. Es Mayor de Edad");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione un ejercicio: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}