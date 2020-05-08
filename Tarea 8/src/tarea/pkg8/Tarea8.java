/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg8;

import java.util.Scanner;

/**
 *
 * @author iagop
 */
public class Tarea8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[][] array1 = {{7,5,8,1},{6,9,2,3}};
        System.out.println("Numero mas bajo: " + Oper.masBajo(array1));
        System.out.println("Numero mas alto: " + Oper.masAlto(array1));
        System.out.print("Buscar numero: ");
        Integer numero = new Scanner(System.in).nextInt();
        Oper.buscarNumero(array1, numero);

        System.out.print("Eliminar numero: ");
        numero = new Scanner(System.in).nextInt();
        Oper.eliminarNumero(array1, numero);
        
        Oper.buscarNumero(array1, numero);
    }
    
}
