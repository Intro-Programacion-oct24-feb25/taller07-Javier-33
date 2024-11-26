/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author javiv
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
       double num = 1;
       double resultado = 1;
       double resta = 0;
       double suma = 0;

       while(num < 15){
           num += 2;
           resta = resultado - 1/num;
           suma += resta;
           resultado += suma;
           
          
           System.out.printf("1 -"+" 1/"+num+ " : %.2f\n",
                   resultado);


       }
        }
    }