/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercixcio.geneeee;

/**
 *
 * @author PC
 */
    public class EjercixcioGeneeee {
    import java.util.Scanner;
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in);
        
             int numero1;   
             
            System.out.print("Escribe el primer entero: ");
            numero1 = entrada.nextInt ();
                
            if (numero1 >= 100) 
            System.out.println("El numero" + numero1 + " es mayor o igual a 100 " );
                
            else if (numero1 >- 50){
            System.out.println("El numero" + numero1 + " es mayor o igual a 50 pero menor que 100");
                            
            else if (numero1 >- 0){
            System.out.println("El numero " + numero1 + " es mayor o igual a 50 pero menor que 50");
                            
               }else {
            System.out.println("El numero " + numero1 + " es menor que 0");
                                   
                            }
                } 
        // TODO code application logic here
    }
    
}
