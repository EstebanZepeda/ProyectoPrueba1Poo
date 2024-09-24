/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

/**
 *
 * @author Esteban
 */
public class tester {

    public static void main(String[] args) {
        
     //AQUI EL TESTER   
     
     preguntaSeleccionMul preg1 = new preguntaSeleccionMul("Cuantas unidades es capaz de subir mario con un rollout en un Misaligment?",2,2,"230","157","207","198","depende");
     preg1.ImprimirPregunta();
     
     
     preguntaVerdaderoFalso  preg2 = new preguntaVerdaderoFalso("Cuantas unidades es capaz de subir mario con un rollout en un Misaligment?",4,1); 
     preg2.ImprimirPregunta();   
     
     
     
    }
    
}
   

