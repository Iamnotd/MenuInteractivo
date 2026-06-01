package org.dereksilvestre.system;

import org.dereksilvestre.controller.OperacionesMatematicasController;
import org.dereksilvestre.view.MenuPrincipalView;
import org.dereksilvestre.view.OperacionesMatematicasView;

public class Main {
    public static void main(String[] args) {
        
        MenuPrincipalView menuPrincipalView = new MenuPrincipalView(); 
        OperacionesMatematicasView mathView = new OperacionesMatematicasView();
        OperacionesMatematicasController mathCtrl = new OperacionesMatematicasController();
        int opcionMenu;

        do {
            opcionMenu = menuPrincipalView.mostrarMenuPrincipal();

            switch (opcionMenu) {
                case 1:
                    int ejercicioMath;
                    do {
                        ejercicioMath = mathView.mostrarSubMenuMatematicas();
                        switch (ejercicioMath) {
                            case 1:
                                double horas = mathView.pedirDouble("Ingrese las horas trabajadas: ");
                                double pago = mathView.pedirDouble("Ingrese el pago por hora: ");
                                double salarioTotal = mathCtrl.calcularSalario(horas, pago);
                                mathView.mostrarResultado("-> El salario total es: Q" + salarioTotal);
                                break;
                            case 2:
                                double base = mathView.pedirDouble("Ingrese la bsae del triangulo: ");
                                double altura = mathView.pedirDouble("Ingrese la altura del triangulo: ");
                                double area = mathCtrl.calcularAreaTriangulo(base, altura);
                                mathView.mostrarResultado("-> El Area del triaungulo es: " + area);
                                break;
                            case 0:
                                break;
                            default:
                                mathView.mostrarResultado("Opción no válida en este submódulo.");
                        }
                    } while (ejercicioMath != 0);
                    break;
                case 2:
                    // Módulo B
                    break;
                case 3:
                    // Módulo C
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcionMenu != 4);
    }
}