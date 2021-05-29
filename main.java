/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miproyecto;
import javax.swing.JOptionPane;
/**
 *
 * @author silvi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Mi Primer Proyecto");
//        String nombre = "Silvia";
//        Integer edad = 27;
//        float salario = 150;
//        double temperatura = 23.343434;
//        char initial = 'S';
//        
//        System.out.println("Mi nombre es " + nombre);
//        System.out.printf("Mi nombre es %s mi edad es %d%n",nombre,edad);
//        
//        System.out.print("Bienvenido a Java\n");
//        System.out.println("Podras dar solucion a muchos problemas");
//        
//        System.out.printf("Bienvenido a Java %s%n","Podras dar solucion a muchos problemas");
        
        
//        String nombre2 = JOptionPane.showInputDialog("Inrese su nombre");        
//        String edadDeRetiro = JOptionPane.showInputDialog("Cual es su edad");
//        String salarioDeRetiro = JOptionPane.showInputDialog("Ingrese su salario de retiro");
//        
//         JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre2 + "\nSu edad de Retiro es: " + edadDeRetiro + "\nSu salario es: " + salarioDeRetiro);
//        
         
          String nombreTrabajador = JOptionPane.showInputDialog("Ingrese su nombre ");
          Integer salarioSemana1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario de Semana 1"));
          Integer salarioSemana2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario de Semana 2"));
          Integer salarioSemana3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario de Semana 3"));
          Integer salarioSemana4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario de Semana 4"));
          
          int salarioBruto = salarioSemana1 + salarioSemana2 + salarioSemana3 + salarioSemana4;
          double Deducciones = (salarioBruto - (salarioBruto*0.934));
          
          
          
          JOptionPane.showMessageDialog(null,"Estimado trabajador " 
                  + nombreTrabajador 
                  + "\n\nSu salario Bruto es de: ₡"
                  + salarioBruto  
                  + "\nDeducciones: ₡"
                  + String.format("%.2f", Deducciones)
                  + "\nSu salario con deducciones es de: ₡" 
                  + String.format("%.2f", salarioBruto*0.934)
                  + "\n\n Gracias por trabajar con nosotros!");

         
          
          
          
        
        
                
                
                
    }
    
}
