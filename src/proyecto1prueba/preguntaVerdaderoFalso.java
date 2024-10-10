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
    
 @Override  
    public void ImprimirPregunta() {
   
    System.out.println(enunciado + " V/F (" + puntaje + " pts)"); 
    System.out.println(""); 
    
    
    }       
  
@Override      
    public int EntregarRespuesta() {
        
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.next();
        int respuestaInt;
        
        switch(respuesta) {
            case "V" -> {
            respuestaInt = 1; 
            }
            case "v" -> {
            respuestaInt = 1;  //WF     
            }
            case "F" -> {
            respuestaInt = 0;  //WF     
            }
            case "f" -> {
            respuestaInt = 0;  //WF     
            }
            default -> {
            respuestaInt = -1;  //WF   
            System.out.println("respuesta no valida, se toma como malo"); 
            return(0);
            }
            }
        
        if (respuestaInt == this.opcionCorrecta) {
            System.out.println("CORRECTO"); 
            return(this.puntaje); 
            
            }
        System.out.println("INCORRECTO"); 
        return(0);

    }      
    
    
    
}
