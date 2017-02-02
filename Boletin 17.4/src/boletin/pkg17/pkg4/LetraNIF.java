/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17.pkg4;
import static IntroducirDatos.Datos.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class LetraNIF {
    char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private int dni;
    
    public void setDNI(){
        dni=pedirInt("Introduce el número de DNI para carcular la letra.");
    }
    
    public int letra(){
        return dni%23;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Para el dni: " + dni + ". \nLe corresponde la letra: " + letra[letra()] + ".");
    }
}
