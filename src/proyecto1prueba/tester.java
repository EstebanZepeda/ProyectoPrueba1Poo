/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

/**
 *
 * @author Esteban
 */
public class tester {

    public static void main(String[] args) {
        
     //AQUI EL TESTER   
     
     //HACER QUE LEA DE ARCHIVO
     /*
    M (M = multiple, V = verdadero, R=respuesta corta)
    Cuantas unidades es capaz de subir mario con un rollout en un Misaligment? (enunciado)
    2 (puntaje)
    c (respuesta correcta)
    230 (enunciado A)
    157 (enunciado B)
    207 (enunciado C)
    198 (enunciado D)
    depende (enunciado E)
    //salto linea// 
     
    V (M = multiple, V = verdadero, R=respuesta corta)
    Cuantas unidades es capaz de subir mario con un rollout en un Misaligment? (enunciado)
    2 (puntaje)
    V (respuesta correcta) 
    //salto linea//  
     
     
    R (M = multiple, V = verdadero, R=respuesta corta)
    Cuantas unidades es capaz de subir mario con un rollout en un Misaligment? (enunciado)
    2 (puntaje)
    //salto linea//  
     */
     
     //leer (hacerlo clase propia???)
     
     
     
     
 
     
     
        prueba prueba1 = new prueba(0,0,0); //obtenido, total, porRevisar
     
        //try sidoso siempre sale
        prueba1.LeerArchivo();
     
        prueba1.responderPrueba();    
        prueba1.guardarResultados("resultados.txt");
        
     //seleccion multiplie
     //preguntaSeleccionMul preg1 = new preguntaSeleccionMul("Cuantas unidades es capaz de subir mario con un rollout en un Misaligment?",2,'c',"230","157","207","198","depende");
     //preguntaSeleccionMul preg2 = new preguntaSeleccionMul("cuantos capitulos tiene one piece?",3,'b',"nose","100000","zzz","15","mas que los de two piece");
     
     //verdadero falso
     //preguntaVerdaderoFalso  preg3 = new preguntaVerdaderoFalso("Dipper fue a taco bell?",4,'V');
     
     //respuesta corta
     //preguntaRespuestaCorta  preg4 = new preguntaRespuestaCorta("que tragaban los tres tristes triges?",8);       
        
        
        
     //prueba1.añadirPreguntaSeleccion(preg1);
     //prueba1.añadirPreguntaSeleccion(preg2);
     
     //prueba1.añadirPreguntaVerdaderoFalso(preg3);
     
     //prueba1.añadirPreguntaRespuestaCorta(preg4);
     
     
     
     
     /*
     preguntaSeleccionMul preg1 = new preguntaSeleccionMul("Cuantas unidades es capaz de subir mario con un rollout en un Misaligment?",2,2,"230","157","207","198","depende");
     preg1.ImprimirPregunta();
     preg1.EntregarRespuesta();
     
     
     preguntaVerdaderoFalso  preg2 = new preguntaVerdaderoFalso("Dipper fue a taco bell?",4,1); 
     preg2.ImprimirPregunta();   
     preg2.EntregarRespuesta();
     
     preguntaRespuestaCorta  preg3 = new preguntaRespuestaCorta("que tragaban los tres tristes triges?",8); 
     preg3.ImprimirPregunta();   
     preg3.EntregarRespuesta();
     
     preguntaVerdaderoFalso  preg4 = new preguntaVerdaderoFalso("curly es el gato de fefnanfloo?",2,0); 
     preg4.ImprimirPregunta();   
     preg4.EntregarRespuesta();  
     */
     
    }
    
}
   

