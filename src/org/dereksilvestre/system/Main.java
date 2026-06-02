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
                            case 3:
                                double nota1 = mathView.pedirDouble("Ingrese la primera calificacion: ");
                                double nota2 = mathView.pedirDouble("Ingrese la segunda calificacion: ");
                                double nota3 = mathView.pedirDouble("Ingrese la tercera calificacion: ");
                                double promedio = mathCtrl.calcularPromedio(nota1, nota2, nota3);
                                mathView.mostrarResultado("-> El promedio academico es: " + promedio);
                                break;
                            case 4:
                                double celsius = mathView.pedirDouble("Ingrese los grados Celsius: ");
                                double fahrenheit = mathCtrl.convertirCelsiusAFahrenheit(celsius);
                                mathView.mostrarResultado("-> Equivalente en Fahrenheit: " + fahrenheit + "°F");
                                break;
                            case 5: 
                                double radio = mathView.pedirDouble("Ingrese el radio del circulo: ");
                                double perimetro = mathCtrl.calcularPerimetroCirculo(radio);
                                mathView.mostrarResultado("-> El perimetro del circulo es: "+ perimetro);
                                break;
                            case 6:
                                double radioCilindro = mathView.pedirDouble("Ingrese el radio del cilindro: ");
                                double alturaCilindro = mathView.pedirDouble("Ingrese la altura del cilindro: ");
                                double volumen = mathCtrl.calcularVolumenCilindro(radioCilindro, alturaCilindro);
                                mathView.mostrarResultado("-> El volumen del cilinro es: " + volumen);
                            case 7: 
                                double catetoA = mathView.pedirDouble("Ingrese la longitud del cateto A: ");
                                double catetoB = mathView.pedirDouble("Ingrese la longitud del cateto B: ");
                                double hipotenusa = mathCtrl.calcularHipotenusa(catetoA, catetoB);
                                mathView.mostrarResultado("-> La longitud de la hipotenusa es: " + hipotenusa);
                                break;
                            case 8:
                                double dias = mathView.pedirDouble("Ingrese la cantidad de dias: ");
                                double minutos = mathCtrl.convertirDiasAMinutos(dias);
                                mathView.mostrarResultado("-> El equivalente en minutos totales es: " + minutos + " minutos.");
                                break;
                            case 9: 
                                double dividendo = mathView.pedirDouble("Ingrese el dividendo: ");
                                double divisor = mathView.pedirDouble("Ingrese el divisor: ");
                                double residuo = mathCtrl.calcularRestoDivision(dividendo, divisor);
                                mathView.mostrarResultado("-> El resto de la division (modulo) es: " + residuo);
                                break;
                            case 10:
                                int numeroBase = mathView.pedirInt("Ingrese un número entero: ");
                                int resultadoCubo = mathCtrl.calcularPotenciaAlCubo(numeroBase);
                                mathView.mostrarResultado("-> El número " + numeroBase + " elevado al cubo es: " + resultadoCubo);
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