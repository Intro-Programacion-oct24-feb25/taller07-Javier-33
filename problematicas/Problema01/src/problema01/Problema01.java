/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author javiv
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        
        int edad = 0;
       
        double estatura;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;
        double sumaEstatura = 0;
        String cadenaEdad = "";
        

        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        int promedioEdad = 0;
        double promedioEstatura = 0;
        
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");
        

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posicion del Jugador: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;
            cadenaEdad += "" + edad + "\n";
          

            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d. %s -%s-, edad: %d, estatura: "
                    + "%.2f "
                    + "\n"
                    ,
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            
            

            // entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
            
        }
        
        promedioEdad = sumaEdades / contadorIteraciones;
        promedioEstatura = sumaEstatura / contadorIteraciones;
        
        cadenaReporte = String.format("%sLista de edades: \n%s",
                 cadenaReporte,
                 cadenaEdad);
        cadenaReporte = String.format("%s"
                    + "Promedio Edades: %d\n"
                    + "Promedio Estaturas: %.2f\n",
                    cadenaReporte,
                    promedioEdad,
                    promedioEstatura);
 
        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);

    }
}