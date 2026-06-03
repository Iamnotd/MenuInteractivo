package org.dereksilvestre.system;

import org.dereksilvestre.controller.LogicaBooleanosController;
import org.dereksilvestre.controller.ManipulacionCadenasController;
import org.dereksilvestre.controller.OperacionesMatematicasController;
import org.dereksilvestre.view.LogicaBooleanosView;
import org.dereksilvestre.view.ManipulacionCadenasView;
import org.dereksilvestre.view.MenuPrincipalView;
import org.dereksilvestre.view.OperacionesMatematicasView;

public class Main {
    public static void main(String[] args) {
        
        MenuPrincipalView menuPrincipalView = new MenuPrincipalView(); 
        OperacionesMatematicasView mathView = new OperacionesMatematicasView();
        OperacionesMatematicasController mathCtrl = new OperacionesMatematicasController();
        ManipulacionCadenasView cadenasView = new ManipulacionCadenasView();
        ManipulacionCadenasController cadenasCtrl = new ManipulacionCadenasController();
        LogicaBooleanosView logicaView = new LogicaBooleanosView();
        LogicaBooleanosController logicaCtrl = new LogicaBooleanosController();
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
                    int ejercicioCadenas;
                    do {
                        ejercicioCadenas = cadenasView.mostrarSubMenuCadenas();
                        switch (ejercicioCadenas) {
                            case 1:
                                String textoInput = cadenasView.pedirString("Ingrese un texto o palabra: ");
                                int longitud = cadenasCtrl.obtenerLongitudCadena(textoInput);
                                cadenasView.mostrarResultado("-> La longitud del texto es: " + longitud + " caracteres.");
                                break;
                            case 2:
                                String textoOriginal = cadenasView.pedirString("Ingrese el texto en minusculas: ");
                                String textoMayusculas = cadenasCtrl.convertirAMayusculas(textoOriginal);
                                cadenasView.mostrarResultado("-> Resultado en Mayusculas: " + textoMayusculas);
                                break;
                            case 3: 
                                String textoMayus = cadenasView.pedirString("Ingrese el texto en MAYUSCULAS: ");
                                String textoMinusculas = cadenasCtrl.convertirAMinusculas(textoMayus);
                                cadenasView.mostrarResultado("-> Resultado en Minusculas: " + textoMinusculas);
                                break;
                            case 4:
                                String textoNormal = cadenasView.pedirString("Ingrese el texto a invertir: ");
                                String textoInvertido = cadenasCtrl.invertirCadena(textoNormal);
                                break;
                            case 5:
                                String textoBase = cadenasView.pedirString("Ingrese el texto base: ");
                                String caracterInput = cadenasView.pedirString("Ingrese el unico caracter a buscar: ");
                                if (!caracterInput.isEmpty()) {
                                    char letra = caracterInput.charAt(0); 
                                    int posicion = cadenasCtrl.buscarCaracter(textoBase, letra);
                                    if (posicion != -1) {
                                        cadenasView.mostrarResultado("-> El caracter '" + letra + "' se encuentra en el indice: " + posicion);
                                    } else {
                                        cadenasView.mostrarResultado("-> El caracter '" + letra + "' no fue encontrado en el texto.");
                                    }
                                } else {
                                    cadenasView.mostrarResultado("No ingresó ningun caracter para buscar.");
                                }
                                break;
                            case 6: 
                                String textoVocales = cadenasView.pedirString("Ingrese una palabra o frase: ");
                                int totalVocales = cadenasCtrl.contarVocales(textoVocales);
                                cadenasView.mostrarResultado("-> El texto contiene un total de: " + totalVocales + " vocales.");
                                break;
                            case 7:
                                String fraseInput = cadenasView.pedirString("Ingrese una frase completa: ");
                                int cantidadPalabras = cadenasCtrl.contarPalabras(fraseInput);
                                cadenasView.mostrarResultado("-> El total de palabras en la frase es: " + cantidadPalabras);
                                break;
                            case 8: 
                                String textoBase18 = cadenasView.pedirString("Ingrese el texto original: ");
                                String charAntiguoInput = cadenasView.pedirString("Ingrese el caracter a reemplazar: ");
                                String charNuevoInput = cadenasView.pedirString("Ingrese el nuevo caracter sustituto: ");
                                if (!charAntiguoInput.isEmpty() && !charNuevoInput.isEmpty()) {
                                    char antiguo = charAntiguoInput.charAt(0);
                                    char nuevo = charNuevoInput.charAt(0);
                                    
                                    String textoModificado = cadenasCtrl.reemplazarCaracter(textoBase18, antiguo, nuevo);
                                    
                                    cadenasView.mostrarResultado("-> Texto modificado: " + textoModificado);
                                } else {
                                    cadenasView.mostrarResultado("Error: Debe ingresar ambos caracteres para operar.");
                                }
                                break;
                            case 9: 
                                String textoEvaluar = cadenasView.pedirString("Ingrese el texto a evaluar: ");
                                
                                boolean estaVacia = cadenasCtrl.comprobarCadenaVacia(textoEvaluar);
                                
                                if (estaVacia) {
                                    cadenasView.mostrarResultado("-> La cadena está VACIA.");
                                } else {
                                    cadenasView.mostrarResultado("-> La cadena NO está vacia. Contiene texto.");
                                }
                                break;
                            case 10:
                                String primeraCadena = cadenasView.pedirString("Ingrese la primera cadena: ");
                                String segundaCadena = cadenasView.pedirString("Ingrese la segunda cadena: ");
                                
                                String resultadoUnion = cadenasCtrl.concatenarCadenas(primeraCadena, segundaCadena);
                                
                                cadenasView.mostrarResultado("-> Texto concatenado: " + resultadoUnion);
                                break;
                            case 0:
                                break;
                            default:
                                cadenasView.mostrarResultado("Opción no valida en este submodulo.");
                        }
                    } while (ejercicioCadenas != 0);
                    break;
                case 3:
                    int ejercicioLogica;
                    do {
                        ejercicioLogica = logicaView.mostrarSubMenuLogica();
                        switch (ejercicioLogica) {
                            case 1:
                                int edad = logicaView.pedirEntero("Ingrese la edad a evaluar: ");
                                boolean resultadoEdad = logicaCtrl.esMayorDeEdad(edad);
                                
                                if (resultadoEdad) {
                                    logicaView.mostrarResultado("-> La persona ES mayor de edad.");
                                } else {
                                    logicaView.mostrarResultado("-> La persona NO es mayor de edad.");
                                }
                                break;
                            case 2:
                                boolean valor1 = logicaView.pedirBooleano("Ingrese el primer valor");
                                boolean valor2 = logicaView.pedirBooleano("Ingrese el segundo valor");
                                
                                boolean resultadoAND = logicaCtrl.evaluarAND(valor1, valor2);
                                
                                logicaView.mostrarResultado("-> Resultado de (" + valor1 + " && " + valor2 + "): " + resultadoAND);
                                break;
                            case 3:
                                boolean v1 = logicaView.pedirBooleano("Ingrese el primer valor");
                                boolean v2 = logicaView.pedirBooleano("Ingrese el segundo valor");
                                
                                boolean resultadoOR = logicaCtrl.evaluarOR(v1, v2);
                                
                                logicaView.mostrarResultado("-> Resultado de (" + v1 + " || " + v2 + "): " + resultadoOR);
                                break;
                            case 4:
                                boolean valorOriginal = logicaView.pedirBooleano("Ingrese el valor a invertir");
                                
                                boolean resultadoNOT = logicaCtrl.evaluarNOT(valorOriginal);
                                
                                logicaView.mostrarResultado("-> Resultado de !" + valorOriginal + " es: " + resultadoNOT);
                                break;
                            case 5:
                                int numEvaluar = logicaView.pedirEntero("Ingrese un número entero: ");
                                
                                boolean parPositivo = logicaCtrl.esParYPositivo(numEvaluar);
                                
                                if (parPositivo) {
                                    logicaView.mostrarResultado("-> El número " + numEvaluar + " Cumple: ES par y positivo.");
                                } else {
                                    logicaView.mostrarResultado("-> El número " + numEvaluar + " NO cumple con ambas condiciones (o es negativo, o es impar).");
                                }
                                break;
                            case 6:
                                double notaAlumno = logicaView.pedirDecimal("Ingrese la nota del alumno (0-100): ");
                                int asistenciaAlumno = logicaView.pedirEntero("Ingrese el porcentaje de asistencia (0-100): ");
                                
                                boolean aproboCurso = logicaCtrl.comprobarAprobacion(notaAlumno, asistenciaAlumno);
                                
                                if (aproboCurso) {
                                    logicaView.mostrarResultado("-> ¡Felicidades! El alumno ha APROBADO la materia.");
                                } else {
                                    logicaView.mostrarResultado("-> El alumno ha REPROBADO (Falta de nota o de asistencia).");
                                }
                                break;
                            case 7:
                                int anioEvaluar = logicaView.pedirEntero("Ingrese un año (ej. 2024): ");
                                
                                boolean bisiesto = logicaCtrl.esAnioBisiesto(anioEvaluar);
                                
                                if (bisiesto) {
                                    logicaView.mostrarResultado("-> El año " + anioEvaluar + " ES bisiesto (tiene 366 días).");
                                } else {
                                    logicaView.mostrarResultado("-> El año " + anioEvaluar + " NO es bisiesto (tiene 365 días).");
                                }
                                break;
                            case 8:
                                boolean claveOk = logicaView.pedirBooleano("¿La contraseña ingresada es correcta?");
                                boolean tokenOk = logicaView.pedirBooleano("¿El usuario posee un token físico válido?");
                                
                                boolean accesoPermitido = logicaCtrl.evaluarAcceso(claveOk, tokenOk);
                                
                                if (accesoPermitido) {
                                    logicaView.mostrarResultado("-> [ACCESO CONCEDIDO] Bienvenido al sistema.");
                                } else {
                                    logicaView.mostrarResultado("-> [ACCESO DENEGADO] Credenciales inválidas.");
                                }
                                break;
                            case 9: 
                                int edadCliente = logicaView.pedirEntero("Ingrese la edad del cliente: ");
                                boolean esSocio = logicaView.pedirBooleano("¿El cliente posee membresía VIP?");
                                
                                // 2. Evaluamos la lógica comercial mediante el controlador
                                boolean aplicaDescuento = logicaCtrl.calcularDescuento(edadCliente, esSocio);
                                
                                // 3. Mostramos la salida correspondiente
                                if (aplicaDescuento) {
                                    logicaView.mostrarResultado("-> [DESCUENTO APLICADO] El cliente recibe el beneficio especial.");
                                } else {
                                    logicaView.mostrarResultado("-> [PRECIO REGULAR] El cliente no cumple los requisitos para el descuento.");
                                }
                                break;
                            case 0:
                                break;
                            default:
                                logicaView.mostrarResultado("Opción no válida en este submódulo.");
                        }
                    } while (ejercicioLogica != 0);
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