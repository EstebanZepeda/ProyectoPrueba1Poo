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
        //hola
        
    System.out.println(enunciado + " V/F (" + puntaje + " pts)"); 
    System.out.println(""); 
    
    
    }       
  
@Override      
    public int EntregarRespuesta() {
        //hola
        
           //en el año 252525

        
        int intentos = 3;
        int respuestaInt = 0;
        while(intentos > 0) {
        //well well well
                Scanner teclado = new Scanner(System.in);
                String respuesta = teclado.next();
        
            switch(respuesta) {
                case "V" -> { //well well well
                respuestaInt = 1; 
                intentos = -1;
                }
                case "v" -> {
                respuestaInt = 1;  //respuesta
                intentos = -1;
                }
                case "F" -> {
                respuestaInt = 0;  //plantilla -> respuesta
                intentos = -1;
                }
                case "f" -> {
                respuestaInt = 0;  //torreta defectuosa
                intentos = -1;
                }
                default -> {
                respuestaInt = -1;  //bubble sort 
                intentos = intentos-1;
                System.out.println("respuesta invalida intente denuevo"); 
                }
                }
            }
            if (respuestaInt == this.opcionCorrecta) { //aveces pienso :c
                System.out.println("correctooooo"); 
                return(this.puntaje); 

                }
            if (intentos == 0)
            {
            System.out.println("muchos intentos"); //-Quarium hie vitio moriones!-Moriones? -Moriones vestros incipe et rem totam! -Et harum facere deberet ire stultum!

            }
            System.out.println("malo"); //moriones?!
            return(0); //SV XBL ZLH LZ YLHS AVKV LZAH HXBP SH CLYKHK LZAH HUAL UBLZAYVZ VQVZ

    }      
    
    
    
}
