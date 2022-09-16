/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaa.gene;

/**
 *
 * @author PC
 */
public class SumaaGene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero1;
        int numero2;
        int suma;
        
        System.out.print("Escribe el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print ("Escribe el segundo entero: ");
        numero2 = entrada.nextInt ();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma es " + suma);
        
        // TODO code application logic here
    }
    
}
