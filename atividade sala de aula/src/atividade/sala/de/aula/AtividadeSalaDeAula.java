/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.sala.de.aula;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 326125906
 */
public class AtividadeSalaDeAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        double numero = scanner.nextDouble();
        
        if (numero >= 0) {
           double raizQuadrada = Math.sqrt(numero);
           double quadrado = Math.pow(numero,2);
           
            System.out.printf("Raiz quadrada de %.2f = %.2f\n", numero, raizQuadrada);
            System.out.printf("Quadrado de %.2f = %.2f\n", numero, quadrado);
        }  else {
            System.out.println("O número é inválido (negativo)");
        }
        
        scanner.close();
    }
}