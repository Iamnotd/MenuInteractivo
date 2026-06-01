package org.dereksilvestre.system;
/**
 *
 * @author Dere Silvestre
 */
import org.dereksilvestre.view.MenuPrincipalView;

public class Main {
    public static void main(String[] args) {
        // Instancia de la vista para manejar la interacción (UI)
        ConsoleView view = new ConsoleView();
        int opcionMenu;

        // Estructura do-while sugerida para mantener el programa en ejecución
        do {
            opcionMenu = view.mostrarMenuPrincipal();

            // Estructura switch para la selección de opciones del menú
            switch (opcionMenu) {
                case 1:
                    view.mostrarMensaje("\n[Módulo A: Operaciones Matemáticas seleccionado]");
                    // TODO: Integrar submenú de operaciones matemáticas en los siguientes commits
                    break;
                case 2:
                    view.mostrarMensaje("\n[Módulo B: Manipulación de Cadenas seleccionado]");
                    // TODO: Integrar submenú de cadenas en los siguientes commits
                    break;
                case 3:
                    view.mostrarMensaje("\n[Módulo C: Lógica y Booleanos seleccionado]");
                    // TODO: Integrar submenú de lógica en los siguientes commits
                    break;
                case 4:
                    view.mostrarMensaje("\nSaliendo del sistema SIPRO-LOG. ¡Hasta pronto!");
                    break;
                default:
                    view.mostrarMensaje("\nOpción inválida. Por favor, intente de nuevo.");
            }
        } while (opcionMenu != 4);
    }
}