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
    
    
public class preguntaSeleccionMul extends pregunta {
    

    int opcionCorrecta = 0; //opcion correcta. de 0 al 4
    String opcionA = "";
    String opcionB = "";
    String opcionC = "";
    String opcionD = "";
    String opcionE = "";
    
        //constructor
    public preguntaSeleccionMul (String Enunciado,int Puntaje,char opcionCorrecta,String OpcionA,String OpcionB,String OpcionC,String OpcionD,String OpcionE) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    
    
     switch(opcionCorrecta) {
            case 'a' -> {
             this.opcionCorrecta = 0; 
            }
            case 'b' -> {
             this.opcionCorrecta = 1;     
            }
            case 'c' -> {
             this.opcionCorrecta = 2;      
            }
            case 'd' -> {
             this.opcionCorrecta = 3;      
            }
            case 'e' -> {
             this.opcionCorrecta = 4;      
            }
            default -> {
            this.opcionCorrecta = 0; //0=a, 1=b, 2=c, 3=d, 4=e     
            }
            }
    
    
    
    
    this.opcionA = OpcionA;
    this.opcionB = OpcionB;
    this.opcionC = OpcionC;
    this.opcionD = OpcionD;
    this.opcionE = OpcionE;
    
    

     }            
    
    
@Override  
    public void ImprimirPregunta() {
        //hola
        
    System.out.println(enunciado + "(" + puntaje + " pts)"); 
    System.out.println("A)"+opcionA); 
    System.out.println("B)"+opcionB); 
    System.out.println("C)"+opcionC); 
    System.out.println("D)"+opcionD); 
    System.out.println("E)"+opcionE);
    System.out.println(""); 
    
    
    }    

    
@Override      
    public int EntregarRespuesta() {
        //hola
        
        int intentos = 3;
        int respuestaInt = 0;
        while(intentos > 0) {
        //well well well
         

            Scanner teclado = new Scanner(System.in);



            String respuesta = teclado.next();


            switch(respuesta) {
                    case "A" -> {
                    respuestaInt = 0; 
                    intentos = -1;
                    }
                    case "B" -> {
                    respuestaInt = 1;  //WF     
                    intentos = -1;
                    }
                    case "C" -> {
                    respuestaInt = 2;  //WF     
                    }
                    case "D" -> {
                    respuestaInt = 3;  //WF 
                    intentos = -1;
                    }
                    case "E" -> {
                    respuestaInt = 4;  //WF   
                    intentos = -1;
                    }
                    case "a" -> {
                    respuestaInt = 0;
                    intentos = -1;
                    }
                    case "b" -> {
                    respuestaInt = 1;  //WF  
                    intentos = -1;
                    }
                    case "c" -> {
                    respuestaInt = 2;  //WF    
                    intentos = -1;
                    }
                    case "d" -> {
                    respuestaInt = 3;  //WF   
                    intentos = -1;
                    }
                    case "e" -> {
                    respuestaInt = 4;  //WF   
                    intentos = -1;
                    }
                    default -> {
                    respuestaInt = 5;  //WF     
                    intentos = intentos-1;
                    System.out.println("respuesta invalida intente denuevo");
                    }
                }

        }
        
        if (respuestaInt == this.opcionCorrecta) {
            System.out.println("correctooooo"); 
            return(this.puntaje); 
            
            }
        if (intentos == 0)
            {
            System.out.println("muchos intentos"); 

            
            }
        System.out.println("malo"); 
        return(0);

    }  

    
    
}
