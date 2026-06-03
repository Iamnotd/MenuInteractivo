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
        System.out.println("2. Tabla de Verdad AND");
        System.out.println("3. Tabla de Verdar OR");
        System.out.println("4. Operador Logico NOT");
        System.out.println("5. Numero Par y Positivo");
        System.out.println("6. Aprobo Examen con Condiciones");
        System.out.println("7. Año Bisiesto");
        System.out.println("8. Acceso Permitido");
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

    public boolean pedirBooleano(String mensaje) {
        System.out.print(mensaje + " (true/false): ");
        return scanner.nextBoolean();
    }

    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
    public double pedirDecimal(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}