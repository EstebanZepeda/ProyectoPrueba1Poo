/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

/**
 *
 * @author PC
 */
public class preguntaVerdaderoFalso extends pregunta {
    
    
int opcionCorrecta = 0; //opcion correcta. 0 = falso, 1 = verdadero

    
        //constructor
    public preguntaVerdaderoFalso (String Enunciado,int Puntaje,int opcionCorrecta) {
    super.enunciado = Enunciado;
    super.puntaje = Puntaje;
    this.opcionCorrecta = opcionCorrecta;

    
    

     }             
    
 @Override  
    public void ImprimirPregunta() {
        //hola
        
    System.out.println(enunciado + " V/F (" + puntaje + " pts)"); 
    System.out.println(""); 
    
    
    }       
    
}
