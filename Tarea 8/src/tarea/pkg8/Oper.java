/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg8;

/**
 *
 * @author iagop
 */
public class Oper {
      public static Integer masBajo(Integer[][] array) {
        int minimo = array[0][0];
        for (int i = 0; i < array.length; i++) {
         int minimoFila = array[i][0];
          for (int j = 1; j < array[i].length; j++) {
           if (array[i][j] < minimoFila)
            minimoFila = array[i][j];
            }
            if (minimoFila < minimo)
             minimo = minimoFila;
        }
        return minimo;
    }

    public static Integer masAlto(Integer[][] array) {
        int masalto = array[0][0];
        for (int i = 0; i < array.length; i++) {
         int maximoFila = array[i][0];
         for (int j = 1; j < array[i].length; j++) {
          if (array[i][j] > maximoFila)
           maximoFila = array[i][j];
         }
         if (maximoFila > masalto)
          masalto = maximoFila;
        }
         return masalto;
    }

    public static void buscarNumero(Integer[][] array, Integer numero) {
        loop: {
            for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] != null) {
               if (array[i][j].equals(numero)) {
                System.out.println("Fila: " + i + "\nPosición: " + j);
                 break loop;
               }
              }
             }
            }
         System.out.println("-1");
        }
    }

    public static void eliminarNumero(Integer[][] array, Integer numero) {
        loop: {
            for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] != null) {
               if (array[i][j].equals(numero)) {
                   array[i][j] = null;
                   System.out.println(numero);
                    break loop;
               }
              }
             }
            }
         System.out.println("null");
        }
    }
}
