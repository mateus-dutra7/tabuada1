/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.de.hj;
import java.util.Scanner;
/**
 *
 * @author 326125906
 */
public class AtividadeDeHj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Recebe o número n do usuário
        System.out.print("Digite um número para ver sua tabuada: ");
        int n = scanner.nextInt();
        
        System.out.println("\n=== TABUADA DO " + n + " ===");
        System.out.println("---------------------");
        
        // Imprime a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        System.out.println("---------------------");
        scanner.close();
    }
}
