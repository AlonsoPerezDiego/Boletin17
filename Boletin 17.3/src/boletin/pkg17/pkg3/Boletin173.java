/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Boletin173 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotasAlum lista = new NotasAlum();
        int selec;
        do{
            selec = Integer.parseInt(JOptionPane.showInputDialog("1: Introducir alumnos y notas. \n2: Mostrar aprobados. \n3: Ordenar por notas. \n4: Para buscar la nota de un alumno. \n5: Para cerrar."));
            
            switch(selec){
                
                case 1: lista.pedirNotas();
                        lista.mostrar();
                        break;
                        
                case 2: lista.mostrarApro();
                        break;
                        
                case 3: lista.ordenar();
                        break;
                        
                case 4: lista.buscar();
                        break;
                       
                case 5: break;
            }
        }while(selec<5);
    }
    
}
