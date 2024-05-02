/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bases;

import javax.swing.JOptionPane;

/**
 *
 * @author XT
 */
public class BASES {

    public static void main(String[] args) {
//       int numero = 39;
//        //prints:
//        System.out.println("hola " + numero);
//        JOptionPane.showMessageDialog(null, "hola mundo " + numero);
//        
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
//    Elabore un programa que calcule cuántos años tendrá el usuario en 5 años, al finalizar
//    se imprime el siguiente mensaje “Dentro de 5 años, tendrá: “ y se muestre el valor de la edad proyectada. Debe solicitar como dato de entrada la edad actual.
    
        int edad_actual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad actual: "));
            edad_actual += 5;
            JOptionPane.showMessageDialog(null, "Su edad dentro de cinco años será la sguiente: " + edad_actual);
 
    }
}
