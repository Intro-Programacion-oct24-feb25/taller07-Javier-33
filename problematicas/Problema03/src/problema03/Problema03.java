/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author javiv
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        int diferencia = 1;
        while(numero < 37){
            numero = numero + diferencia;
            diferencia += 2;
            System.out.println(numero);
    }
    }
}