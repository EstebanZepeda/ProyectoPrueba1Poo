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
    
    //añadido para que reconozca palabra clave
String palabraClave = "";
String respuestaUser = "";

    
        //constructor
    public preguntaRespuestaCorta (String Enunciado, int Puntaje, String palabraClave) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    this.palabraClave = palabraClave;
    this.respuestaUser = respuestaUser;

     }             
        
 @Override  
    public void ImprimirPregunta() {
        //hola
        
    System.out.println(enunciado + "(" + puntaje + " pts)"); 
    System.out.print("RESPUESTA:"); 
    
    
    }    
    
 @Override      
    public int EntregarRespuesta() {
        
        Scanner teclado = new Scanner(System.in);
        String respuestaUser = teclado.next(); 

        //añadido, cambia a minusculas todo
        this.palabraClave = this.palabraClave.toLowerCase();
        respuestaUser = respuestaUser.toLowerCase();

        //equals porque si
        if (respuestaUser.equals(palabraClave)) {

            System.out.println("correcto"); 
            return(this.puntaje);
            
        }
        
        //aqui en vez de eso que revise y compare la respuesta con la palabra clave
        System.out.println("malo feo"); 
        System.out.println(""); 
        return(0);

    }    
    
    
}
