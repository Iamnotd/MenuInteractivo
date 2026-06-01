package org.dereksilvestre.view;

import java.util.Scanner;

public class MenuPrincipalView {
    private final Scanner scanner;

    public MenuPrincipalView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Despliega el Menú Principal del sistema SIPRO-LOG.
     * @return opción seleccionada por el usuario.
     */
    public int mostrarMenuPrincipal() {
        System.out.println("\n=======================================");
        System.out.println("          SISTEMA SIPRO-LOG            ");
        System.out.println("=======================================");
        System.out.println("1. Operaciones Matematicas (1-10)");
        System.out.println("2. Manipulacion de Cadenas (11-20)");
        System.out.println("3. Logica y Booleanos (21-30)");
        System.out.println("4. Salir");
        System.out.println("=======================================");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpieza crucial del buffer (salto de línea)
        return opcion;
    }

    /**
     * Muestra un mensaje simple en la consola.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
