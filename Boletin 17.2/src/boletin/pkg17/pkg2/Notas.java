/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Notas {
    int [] notas = new int[30];
    
    public void pedirNotas(){
        for(int i = 0; i<notas.length; i++){
            try{
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota del alumno nº " + (i+1)));
            }catch(Exception ex){
                System.out.println("Valor invalido detectado.\nDeteniendo resto del programa.");
                break;
            }
        }
    }
    
    public void mostrar(){
        for(int i =0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
