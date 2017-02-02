/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17.pkg3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class NotasAlum {
    int [] notas = new int[4];
    String [] nombre = new String[4];
    
    public void pedirNotas(){
        for(int i = 0; i<notas.length; i++){
            try{
                nombre[i] = JOptionPane.showInputDialog("Introduce nombre del alumno nº " + (i+1));
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota del alumno llamado " + nombre[i]));
            }catch(Exception ex){
                System.out.println("Valor invalido detectado.\nDeteniendo resto del programa.");
                break;
            }
        }
    }
    
    public void mostrar(){
        for(int i =0; i<notas.length; i++){
            System.out.println(nombre[i] + ": "+ notas[i]);
        }
    }
    
    public void mostrarApro(){
        System.out.println("\nAprobados:");
        for(int i =0; i<notas.length; i++){
            if(notas[i]>=5){
                System.out.println(nombre[i] + ": " + notas[i]);
            }
        }
    }
    
    public void ordenar(){
        Arrays.sort(notas);
        for(int i = 0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
    }
    
    public void buscar(){
        String aux = JOptionPane.showInputDialog("Nombre que quieres buscar:");
        boolean encontrado = false;
        for(int i = 0; i<nombre.length; i++){
            if(aux.equals(nombre[i])){
                System.out.println("\n Está:\n" + notas[i]);
                encontrado = true;
            }
    }
        if(encontrado==false){
            System.out.println("No está");
        }
    }
    
}
