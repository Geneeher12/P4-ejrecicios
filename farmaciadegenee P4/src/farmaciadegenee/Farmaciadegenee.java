/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciadegenee;

/**
 *
 * @author PC
 */
public class Farmaciadegenee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor, descuento, recargo, total
        String tipo_pago;
        Scanner entrada = new Scanner (System.in;
        System.out.print("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble ();
        System.out.print("Ingrese tipo de pago: ");
        tipo_pago=entrada.next();
        descuento=0.05*valor;
        recargo=0.03*valor;
        if (tipo_pago.equalsIgnoreCase("contador")){
            System.out.println("El descuento es: " + descuento);
            total= valor - descuento;
            System.out.println("El total es: " + total);
             }
            else if (tigo_pago.equalsIgnoreCase("tarjeta")){
                System.out.println("El recargo es: " + recargo);
                total=valor+ recargo;
                System.out.println("El total es: " + total);
                  }
            else { 
                System.out.println("Metodo de pago invalido");
                    }
        }
        // TODO code application logic here
    }
    
}
