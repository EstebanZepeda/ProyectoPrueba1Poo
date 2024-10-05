/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class preguntaRespuestaCorta extends pregunta{
    
String respuesta = ""; 

    
        //constructor
    public preguntaRespuestaCorta (String Enunciado,int Puntaje) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    

    
    

     }             
        
 @Override  
    public void ImprimirPregunta() {
        //hola
        
    System.out.println(enunciado + "(" + puntaje + " pts)"); 

    System.out.print("RESPUESTA:"); 
    
    
    }    
    
 @Override      
    public int EntregarRespuesta() {
        //hola
        
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.next();

 
        

        System.out.println("espere respuesta del revisor xd"); 
        System.out.println(""); 
        return(0);

    }    
    
    
}
