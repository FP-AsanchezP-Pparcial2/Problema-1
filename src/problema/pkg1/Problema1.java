/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;
import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        System.out.println("Inserta el año que deseas evaluar");
        a = solicitarDato();
        calcularDato(a);
        
        // TODO code application logic here
    }
    public static int solicitarDato(){
        int a;
        Scanner entradaEscaner = new Scanner (System.in);
        a = entradaEscaner.nextInt();
        return a;
    }
    public static void calcularDato(int a){
       
        if ((a % 100)== 0 ) {
            System.out.println("tu año no es visiesto");
            
        }else if ((a% 400)==0 ){
            System.out.println("tu año es visiesto");
            
        }else if ((a% 4 ) == 0){
            System.out.println("tu año es visiesto");
        }else if ((a% 1)==0){
            System.out.println("Tu año no es visiesto");
        }
  
    }

    
    
           
  
