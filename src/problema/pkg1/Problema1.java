/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;
import java.util.Scanner;// para pedir datos por teclado
/**
 *
 * @author Alejandro
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;// La variables enteras que manejamos
        System.out.println("Inserta el año que deseas evaluar");// imprime letrero
        a = solicitarDato();// metodo para pedir el Año
        calcularDato(a);//metodo para decir si es biciesto
        
        // TODO code application logic here
    }
    public static int solicitarDato(){//metodo de solicitar dato
        int a;//variable a manejar
        Scanner entradaEscaner = new Scanner (System.in);// masra la entrada del escanner
        a = entradaEscaner.nextInt();//marca la pausa para pedir por teclado
        return a;//regresa a main
    }
    public static void calcularDato(int a){//Metodo para decir si el año es viciesto
       
        if ((a % 100)== 0 ) {// evaluacion de a para decir si es viciesto
            System.out.println("tu año no es visiesto");
            
        }else if ((a% 400)==0 ){
            System.out.println("tu año es visiesto");
            
        }else if ((a% 4 ) == 0){
            System.out.println("tu año es visiesto");
        }else if ((a% 1)==0){
            System.out.println("Tu año no es visiesto");
        }
  
    }
}
