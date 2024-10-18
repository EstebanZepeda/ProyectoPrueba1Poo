/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

/**
 *
 * @author Esteban
 */
public abstract class pregunta {
    
    String enunciado; //enunciado de la pregunta
    String respuestaUsuario;
    boolean correcto; //0 = incorrecto, 1 = correcto
    int puntaje; // cuanto vale la pregunta, se multiplica por el correcto    
    
    

//metodo    
    public void ImprimirPregunta() {
        

    }

//metodo    
    
     public int EntregarRespuesta() {
        
        return(0);

    }  

     
     //metodo de entrega puntaje
     public int EntregarPuntaje() {
        
        return(puntaje);

    }
     
    public String getEnunciado() {
        return enunciado;
    }
    
   
}