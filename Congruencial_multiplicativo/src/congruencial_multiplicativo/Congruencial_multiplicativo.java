/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencial_multiplicativo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aron
 */
public class Congruencial_multiplicativo {

    public static void main(String[] args) {

       
        int semilla, cmultiplicativa, caditiva, modulo;

        int i, numero;

        double numero2;


        semilla = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la semilla", "Semilla", JOptionPane.INFORMATION_MESSAGE));
        
        cmultiplicativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la Constante Multiplicativa", "Constante Multiplicativa", JOptionPane.INFORMATION_MESSAGE));
      

        modulo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del MODULO", "MODULO", JOptionPane.INFORMATION_MESSAGE));

      

        for (i = 1; i <= 20; i++) {

            numero = (cmultiplicativa * semilla) % modulo;

            numero2 = (double) numero / (double) (modulo - 1);

            System.out.printf("%d. %d (%.4f)\n", i, numero, numero2);

            semilla = numero;

        }

        }

    }
    


