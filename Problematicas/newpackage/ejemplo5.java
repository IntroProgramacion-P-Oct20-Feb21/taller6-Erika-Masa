/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombreEstudiante;
        double promedioCiclo;
        String cadenaFinal="";
        String notaFinal;
        while(contador <= 4){
            System.out.println("Ingrese su nombre");
            nombreEstudiante= entrada.nextLine();
            System.out.println("Ingrese su promedio del ciclo");
            promedioCiclo=entrada.nextDouble();
            if(promedioCiclo >= 7){
                notaFinal = "Aprobado";
                cadenaFinal = String.format("%s%s\t %.2f\t%s\n",
                        cadenaFinal,nombreEstudiante, promedioCiclo, notaFinal);
            }else{
                notaFinal ="Reprobado";
                cadenaFinal = String.format("%s%s\t%.2f\t%s\n",
                        cadenaFinal,nombreEstudiante, promedioCiclo, notaFinal);
            }
            contador=contador+1;
            entrada.nextLine();
        }
        System.out.printf(cadenaFinal);
    }

    }
    

