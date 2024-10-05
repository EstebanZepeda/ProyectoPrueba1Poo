/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Esteban
 */
public class prueba {
    
    int puntajeObtenido = 0;
    int puntajeTotal = 0;
    int puntajePorRevisar = 0;
    //preguntaSeleccionMul preg1 = new preguntaSeleccionMul("",0,0,"","","","","");
    
    //tipos de preguntas
    
    preguntaSeleccionMul[] SelecccionArray = new preguntaSeleccionMul[20];
    int SelecccionNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    preguntaVerdaderoFalso[] VerdaderoFalsoArray = new preguntaVerdaderoFalso[20];
    int VerdaderoFalsoNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    preguntaRespuestaCorta[] CortaArray = new preguntaRespuestaCorta[20];
    int CortaNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    
    
    //constructor
    public prueba () {

    puntajeObtenido = 0;
    puntajeTotal = 0; 
    puntajePorRevisar = 0;
    

     }   
    
    
    
    
    
    
    
    
    //metodo abc
    public void añadirPreguntaSeleccion(preguntaSeleccionMul preguntaNuevo) {
    
    SelecccionArray[this.SelecccionNum] = preguntaNuevo;
    this.SelecccionNum = this.SelecccionNum + 1;
        
    }
    
    //metodo w f
    public void añadirPreguntaVerdaderoFalso(preguntaVerdaderoFalso preguntaNuevo) {
    
    VerdaderoFalsoArray[this.VerdaderoFalsoNum] = preguntaNuevo;
    this.VerdaderoFalsoNum = this.VerdaderoFalsoNum + 1;
        
    }
    
    //metodo r:
    public void añadirPreguntaRespuestaCorta(preguntaRespuestaCorta preguntaNuevo) {
    
    CortaArray[this.CortaNum] = preguntaNuevo;
    this.CortaNum = this.CortaNum + 1;
        
    }
    
    
    public void LeerArchivo() throws FileNotFoundException{
    //la picha del theows es para que tire excepcion si el arcvhico se lo comieron los gatos
    
    
    JFileChooser FileChooser = new JFileChooser();
        
         int Response = FileChooser.showOpenDialog(null); //select a file to open}
         if (Response==JFileChooser.APPROVE_OPTION) { //si se abrio bien
             
             
             File Archivo = new File(FileChooser.getSelectedFile().getAbsolutePath());
             Scanner scan = new Scanner(Archivo);
             
             int NumPregMul = 0;
             int NumPregVer = 0;
             int NumPregRes = 0;
                while(scan.hasNextLine()){
                    
                //primero verifica cual es el tipo de pregunta que viene
                String opcionPregunta = scan.nextLine();

                
                    switch(opcionPregunta) {
                        case "M" -> {
                         System.out.println("MULTIPLE");
                         
                         
                         String enunciado = scan.nextLine();
                         String puntajeStr = scan.nextLine();
                         int puntaje = Integer.parseInt(puntajeStr);
                         
                         String letraCorrectaStr = scan.nextLine(); //parse de string a int
                         char letraCorrecta = letraCorrectaStr.charAt(0); //la letra del 0
                         
                         
                         String EnunA = scan.nextLine();
                         String EnunB = scan.nextLine();
                         String EnunC = scan.nextLine();
                         String EnunD = scan.nextLine();
                         String EnunE = scan.nextLine();        
                         SelecccionArray[NumPregMul] = new preguntaSeleccionMul(enunciado,puntaje,letraCorrecta,EnunA,EnunB,EnunC,EnunD,EnunE);
                         System.out.println(NumPregMul);
                         NumPregMul = NumPregMul+1;
                         
                        }
                        case "V" -> {
                         System.out.println("VERDADERO FALSO");
                         
                         String enunciado = scan.nextLine();
                         String puntajeStr = scan.nextLine();
                         int puntaje = Integer.parseInt(puntajeStr);
                         
                         String letraCorrectaStr = scan.nextLine(); //parse de string a int
                         char letraCorrecta = letraCorrectaStr.charAt(0); //la letra del 0
                         VerdaderoFalsoArray[NumPregVer] = new preguntaVerdaderoFalso(enunciado,puntaje,letraCorrecta);
                         System.out.println(NumPregVer);
                         NumPregVer = NumPregVer+1;
                         
                         
                        }
                        case "R" -> {
                         System.out.println("RESPUESTA CORTA");
                         
                         String enunciado = scan.nextLine();
                         String puntajeStr = scan.nextLine();
                         int puntaje = Integer.parseInt(puntajeStr);
                         
                         CortaArray[NumPregRes] = new preguntaRespuestaCorta(enunciado,puntaje);
                         System.out.println(NumPregRes);
                         NumPregRes = NumPregRes+1;
                         
                        }
                        default -> {
                        System.out.println("arvhico fallido autodestruccion");
                        }
                        }  
                
                 this.SelecccionNum = NumPregMul;
                 this.CortaNum = NumPregRes;
                 this.VerdaderoFalsoNum = NumPregVer;
                
                }
             }

    
    }
    
    
    
    
    
    //metodo
    public void responderPrueba() {
        //hola
        
     //multiple   
     int i = 0; 
     while (i < this.SelecccionNum)  {
     this.SelecccionArray[i].ImprimirPregunta();
     this.puntajeObtenido=this.puntajeObtenido + SelecccionArray[i].EntregarRespuesta();
     this.puntajeTotal = this.puntajeTotal + SelecccionArray[i].EntregarPuntaje();
     i = i +1;

     }
     
     i = 0; 
     while (i < this.VerdaderoFalsoNum)  {
     this.VerdaderoFalsoArray[i].ImprimirPregunta();
     this.puntajeObtenido=this.puntajeObtenido + VerdaderoFalsoArray[i].EntregarRespuesta();
     this.puntajeTotal = this.puntajeTotal + VerdaderoFalsoArray[i].EntregarPuntaje();
     i = i +1;

     }
     
     i = 0; 
     while (i < this.CortaNum)  {
     this.CortaArray[i].ImprimirPregunta();
     this.puntajeObtenido=this.puntajeObtenido + CortaArray[i].EntregarRespuesta();
     this.puntajeTotal = this.puntajeTotal + CortaArray[i].EntregarPuntaje();
     this.puntajePorRevisar = this.puntajePorRevisar + CortaArray[i].EntregarPuntaje();
     i = i +1;

     }
        
       
     
     
     //RESOLUCION
     System.out.println("");
     System.out.println("Puntaje obtenido:" + this.puntajeObtenido);
     System.out.println("Puntaje por revisar:" + this.puntajePorRevisar);
     System.out.println("Puntaje Total:" + this.puntajeTotal);

    }

 
    
}
