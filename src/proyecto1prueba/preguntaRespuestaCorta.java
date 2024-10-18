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
String respuestaUsuario = ""; //revisar

    
        //constructor
    public preguntaRespuestaCorta (String Enunciado, int Puntaje, String palabraClave) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    this.palabraClave = palabraClave;
    this.respuestaUsuario = respuestaUsuario; //revisar

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
        respuestaUsuario = teclado.next(); 

        //añadido, cambia a minusculas todo
        palabraClave = palabraClave.toLowerCase();
        respuestaUsuario = respuestaUsuario.toLowerCase();

        //equals porque si
        if (respuestaUsuario.equals(palabraClave)) {

            System.out.println("correcto");
            System.out.println("");
            return(puntaje);
            
        }else{
        
        //aqui en vez de eso que revise y compare la respuesta con la palabra clave
        System.out.println("incorrecto"); 
        System.out.println(""); 
        return(0);
        }
    }
    

    @Override
    public String getEnunciado() {
        return enunciado; // retorna el enunciado de la pregunta
    }
    

    public String getRespuestaUsuario() {
        return respuestaUsuario; // devuelve la respuesta del usuario
    }

    
}
