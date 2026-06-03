package org.dereksilvestre.view;

import java.util.Scanner;

public class ManipulacionCadenasView {
    private final Scanner scanner;

    public ManipulacionCadenasView() {
        this.scanner = new Scanner(System.in);
    }


    public int mostrarSubMenuCadenas() {
        System.out.println("\n--- MÓDULO B: MANIPULACIÓN DE CADENAS ---");
        System.out.println("1. Longitud de una Cadena");
        System.out.println("2. Convertir a Mayusculas");
        System.out.println("3. Convertir a Minusculas");
        System.out.println("4. Invertir una Cadena");
        System.out.println("5. Buscar un Caracter");
        System.out.println("6. Contar Vocales");
        System.out.println("7. Contar Palabras");
        System.out.println("8. Reemplzar Caracteres");
        System.out.println("9. Comprobar Cadena Vacia");
        System.out.println("10. Concatenar Cadenas");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione un ejercicio: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }


    public String pedirString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }


    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}