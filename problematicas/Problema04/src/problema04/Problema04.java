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
       double num2 = 1;
     
       String cadena = "";
       
       double resta = 0;
       double suma = 0;
       

       while(num < 15){
           num += 2;
           if(num == 1 || num == 3 || num == 7 || num == 11 || num == 15){
               cadena = "" +  "1/"+num+" +";
               resta = num2 - (1/num);
               num2 += resta;
              
               
               
           }else{
               
               if(num <= 1 || num == 5 || num == 9 || num == 13)
                  
                    cadena = "" + "1/"+num+" -";
                  
                   suma = num2 + (1/num);
                    num2 += suma;
               
                
                
                
               
           }
           
           
           
              System.out.printf(" %s", cadena); 
          
          /*
           num += 2;
           resta = num2 - (1/num);
           num2 += resta;
           suma = num2;
           */
          
          

           
           
          
      
       
           
           


       }
       
       
        }
    }