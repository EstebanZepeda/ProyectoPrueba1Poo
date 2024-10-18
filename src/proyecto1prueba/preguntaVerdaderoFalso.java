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
public class preguntaVerdaderoFalso extends pregunta {
    
    
int opcionCorrecta = 0; //opcion correcta. 0 = falso, 1 = verdadero
char respuestaUsuario;

    
        //constructor
    public preguntaVerdaderoFalso (String Enunciado,int Puntaje,char opcionCorrecta) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    
    switch(opcionCorrecta) {
            case 'v' -> {
                this.opcionCorrecta = 1; 
            }
            case 'V' -> {
                this.opcionCorrecta = 1;     
            }
            default -> {
                this.opcionCorrecta = 0;  
            }
            }  
    

     }  
    
    public void setRespuestaUsuario(char respuesta) {
        this.respuestaUsuario = respuesta;              //setea respuesta
    }
    
 @Override  
    public void ImprimirPregunta() {
        
    System.out.println(enunciado + " V/F (" + puntaje + " pts)"); 
    System.out.println(""); 
    
    
    }       
  
@Override      
    public int EntregarRespuesta() {
        int intentos = 3;
        int respuestaInt = 0;
        while(intentos>0){
       
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.next();
        setRespuestaUsuario(respuesta.charAt(0));
        
        switch(respuesta) {

            case "V" -> {
            respuestaInt=1;
            intentos=-1;
            }
            case "v" -> {
            respuestaInt=1;
            intentos=-1;
            }
            case "F" -> {
            intentos=-1;
            }
            case "f" -> {
            intentos=-1;
            }
            default -> {
            intentos=intentos-1;
            System.out.println("respuesta no valida, intente con V como verdadero y F como falso"); 
            continue;
            }
        }
            break;
        }
        if (respuestaInt == opcionCorrecta) {
            System.out.println("CORRECTO");
            System.out.println("");
            return(puntaje); 
            
            }
        if(intentos==0){
        System.out.println("DEMASIADOS INTENTOS");
        }
        System.out.println("INCORRECTO");
        System.out.println("");
        return(0);

    }
      
    
@Override
    public String getEnunciado() {
        return enunciado; // retorna el enunciado de la pregunta
    }
    
    
    public char getRespuestaUsuario() {
        return respuestaUsuario; // retorna la respuesta del usuario
    }
  
    
    
}
