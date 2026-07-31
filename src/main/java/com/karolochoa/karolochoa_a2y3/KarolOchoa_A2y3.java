/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.karolochoa.karolochoa_a2y3;

import javax.swing.JFrame; 

public class KarolOchoa_A2y3 {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              MenuPrincipal pantalla = new MenuPrincipal();
              
            pantalla.setLocationRelativeTo(null);
            
            pantalla.setVisible(true);
            }
        });
    }
    
}
