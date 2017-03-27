/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloteste;

import java.util.Scanner;

/**
 *
 * @author josafa
 */
public class TrianguloTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ladoA = leitor.nextInt();
        int ladoB = leitor.nextInt();
        int ladoC = leitor.nextInt();
        String tipo = tipoTriangulo(ladoA, ladoB, ladoC);
        System.out.println(tipo);

    }

    public static String tipoTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles";
        }
        return "Escaleno";
    }

}
