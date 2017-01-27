/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17.pkg1;

/**
 *
 * @author Diego
 */
public class RandomNumArray {
    int [] numero = new int [6];
    
    public void cargarArray(){
        for(int i = 0; i<numero.length;i++){
            int aux = (int)(Math.random()*100);
            
            while(aux>50){
                aux = (int)(Math.random()*100);
            }
            numero[i]= aux;
        }
    }
    
    public void visualizar(){
        for(int i = 5; i>=0;i--){
            System.out.println(numero[i]);
        }
    }
    
}
