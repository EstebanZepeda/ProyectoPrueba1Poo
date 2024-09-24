/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

/**
 *
 * @author PC
 */
public class preguntaRespuestaCorta extends pregunta{
    
String respuesta = ""; //opcion correcta. 0 = falso, 1 = verdadero

    
        //constructor
    public preguntaRespuestaCorta (String Enunciado,int Puntaje,String respuesta) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    this.respuesta = respuesta;

    
    

     }             
        
    
    
}
