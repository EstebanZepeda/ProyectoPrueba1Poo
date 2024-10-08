/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class preguntaRespuestaCorta extends pregunta{
    
String respuesta = "";
    //añadido para que reconozca palabra clave
String PalabraClave = "";    

    
        //constructor
    public preguntaRespuestaCorta (String Enunciado,int Puntaje, String PalabraClave) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    //añadido
    this.PalabraClave = PalabraClave

    
    

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

        //
        //añadido, cambia a minusculas todo
        this.PalabraClave = this.PalabraClave.toLowerCase();
        respuesta = respuesta.toLowerCase();

        if (respuesta = PalabraClave) {

            return(this.Puntaje);
            
        }
        //
        //aqui en vez de eso que revise y compare la respuesta con la palabra clave
        System.out.println("malo feo"); 
        System.out.println(""); 
        return(0);

    }    
    
    
}
