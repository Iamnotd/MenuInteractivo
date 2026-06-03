package org.dereksilvestre.view;

import java.util.Scanner;

public class ManipulacionCadenasView {
    private final Scanner scanner;

    public ManipulacionCadenasView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Despliega las opciones del Módulo B.
     */
    public int mostrarSubMenuCadenas() {
        System.out.println("\n--- MÓDULO B: MANIPULACIÓN DE CADENAS ---");
        System.out.println("1. Longitud de una Cadena");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione un ejercicio: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpieza de buffer vital para evitar saltos en el próximo texto
        return opcion;
    }

    /**
     * Captura un texto completo (admite espacios en blanco).
     */
    public String pedirString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    /**
     * Imprime de forma estandarizada los resultados en consola.
     */
    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}