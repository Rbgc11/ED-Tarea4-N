/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4ed_rubéngarcíacaparrós;

import java.util.Scanner;
  public static void main(String[] args) {
//las variables operador1 y operador2 servirán para guardar el resultado de la tirada de dos monedas
        int operador1, operador2;
        int contadorCaras = 0, contadorCruces = 0, numTiradas;
//las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
        int cont1 = 0, cont2 = 0;
        int maximoCarasDoblesConsecutivas = 0, maximoCrucesDoblesConsecutivas = 0;
        boolean esCruzDoble = false, esCaraDoble = false;
        String lanzamiento1;
        String lanzamiento2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce el número de veces que se van a lanzar las monedas (max 50): ");
            numTiradas = teclado.nextInt();
        } while (numTiradas < 1 || numTiradas > 50);
/**
 *
 * @author ruben
 */
public class Extraer {

    public static void main(String[] args) {
        //las variables operador1 y operador2 servirán para guardar el resultado de la tirada de dos monedas
        int operador1;
        int operador2;
        int contadorCaras = 0;
        int contadorCruces = 0;
        int numTiradas;
        //las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
        int cont1 = 0;
        int cont2 = 0;
        int maximoCarasDoblesConsecutivas = 0;
        int maximoCrucesDoblesConsecutivas = 0;
        boolean esCruzDoble = false;
        boolean esCaraDoble = false;
        String lanzamiento1;
        String lanzamiento2;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce el n\u00famero de veces que se van a lanzar las monedas (max 50): ");
            numTiradas = teclado.nextInt();
        } while (numTiradas < 1 || numTiradas > 50);
        for (int i = 0; i < numTiradas; i++) {
            operador1 = (int) (Math.random() * 2);
            operador2 = (int) (Math.random() * 2);
            if (operador1 == 0) {
                contadorCaras++;
                lanzamiento1 = "cara";
            } else {
                contadorCruces++;
                lanzamiento1 = "cruz";
            }
            if (operador2 == 0) {
                contadorCaras++;
                lanzamiento2 = "cara";
            } else {
                contadorCruces++;
                lanzamiento2 = "cruz";
            }
            System.out.println("Moneda 1: " + lanzamiento1 + ", Moneda 2: " + lanzamiento2);
            if (operador1 == operador2) {
                if (operador1 == 0) {
                    esCaraDoble = true;
                    esCruzDoble = false;
                } else {
                    esCaraDoble = false;
                    esCruzDoble = true;
                }
            } else {
                esCaraDoble = false;
                esCruzDoble = false;
            }
            if (esCaraDoble) {
                cont1++;
                if (cont1 > maximoCarasDoblesConsecutivas) {
                    maximoCarasDoblesConsecutivas = cont1;
                }
            } else {
                cont1 = 0;
            }
            if (esCruzDoble) {
                cont2++;
                if (cont2 > maximoCrucesDoblesConsecutivas) {
                    maximoCrucesDoblesConsecutivas = cont2;
                }
            } else {
                cont2 = 0;
            }
        }
        TiradaMonedaCX.Imprime(contadorCaras, contadorCruces, maximoCarasDoblesConsecutivas, maximoCrucesDoblesConsecutivas);
    }
    
}


/**
 * @author ruben
 * En esta clase están los métodos main, el primer método main indica el nombre de las variables, los lanzamientos y el número de tiradas
 * que no debe de superar 50. El segundo método main indica lo que debe de suceder al lanzar la moneda y los posibles cambios que tiene según 
 * el resultado
 */