/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto1prueba;

//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Esteban
 */
//clase prueba
public class prueba {

    //atributos
    int puntajeObtenido = 0;
    int puntajeTotal = 0;

    //si es que implemento lo del respuesta mas corta
    int puntajePorRevisar = 0;
    

    
    //Arrays de tipos de preguntas
    
    preguntaSeleccionMul[] SelecccionArray = new preguntaSeleccionMul[20];
    int SelecccionNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    preguntaVerdaderoFalso[] VerdaderoFalsoArray = new preguntaVerdaderoFalso[20];
    int VerdaderoFalsoNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    preguntaRespuestaCorta[] CortaArray = new preguntaRespuestaCorta[20];
    int CortaNum = 0; //numero de preguntas de este tipo, empeieza en 0
    
    
    
    //constructor
    public prueba (int puntajeObtenido, int puntajeTotal, int puntajePorRevisar){
    this.puntajeObtenido = 0;
    this.puntajeTotal = 0; 
    this.puntajePorRevisar = 0;
    
     }   
    
    
    //
    
    
    
    
    
    //metodo abc
    public void añadirPreguntaSeleccion(preguntaSeleccionMul preguntaNuevo) {
    
    SelecccionArray[SelecccionNum] = preguntaNuevo;
    SelecccionNum = SelecccionNum + 1;
        
    }
    
    //metodo w f
    public void añadirPreguntaVerdaderoFalso(preguntaVerdaderoFalso preguntaNuevo) {
    
    VerdaderoFalsoArray[VerdaderoFalsoNum] = preguntaNuevo;
    VerdaderoFalsoNum = VerdaderoFalsoNum + 1;
        
    }
    
    //metodo r:
    public void añadirPreguntaRespuestaCorta(preguntaRespuestaCorta preguntaNuevo) {
    
    CortaArray[CortaNum] = preguntaNuevo;
    CortaNum = CortaNum + 1;
        
    }
    
    
    public void LeerArchivo(){
    
    System.out.println("INICIANDO PRUEBA POR FAVOR ESCOJA EL ARCHIVO EN FORMATO TXT");
    JFileChooser FileChooser = new JFileChooser();
        
    
         int Response = FileChooser.showOpenDialog(null); //select a file to open}
         if (Response==JFileChooser.APPROVE_OPTION) { 
             try {
             //si se abrio bien
             
             File Archivo = new File(FileChooser.getSelectedFile().getAbsolutePath());
             
             
             Scanner scan = new Scanner(Archivo);

             //inicia variables
             int NumPregMul = 0;
             int NumPregVer = 0;
             int NumPregRes = 0;
             
             //verifica la primera linea para ver que tipo de pregunta es
             while(scan.hasNextLine()){
                 
                 //primero verifica cual es el tipo de pregunta que viene
                 String opcionPregunta = scan.nextLine();
                 
                 
                 switch(opcionPregunta) {
                     //si es M es seleccion multiple
                     case "M" -> {
                         System.out.println("MULTIPLE");
                         
                         //guarda cada linea en variable correspondiente
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
                         //crea la pregunta con los parametros recolectados de archivo
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
                         //añadido
                         String palabraClave = scan.nextLine();  
                                                  //añadido clave (palabra clave)
                         CortaArray[NumPregRes] = new preguntaRespuestaCorta(enunciado,puntaje,palabraClave);
                         System.out.println(NumPregRes);
                         NumPregRes = NumPregRes+1;
                         
                     }

                     
                 }
                 
                 SelecccionNum = NumPregMul;
                 CortaNum = NumPregRes;
                 VerdaderoFalsoNum = NumPregVer;
                 
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
    
    
    
    
    
    //metodo
    public void responderPrueba() {
        //hola
        
     //multiple   
     int i = 0;
     while (i < this.SelecccionNum)  {
     SelecccionArray[i].ImprimirPregunta();
     puntajeObtenido=puntajeObtenido + SelecccionArray[i].EntregarRespuesta();
     puntajeTotal = puntajeTotal + SelecccionArray[i].EntregarPuntaje();
     i = i +1;

     }
     
     i = 0; 
     while (i < VerdaderoFalsoNum)  {
     this.VerdaderoFalsoArray[i].ImprimirPregunta();
     this.puntajeObtenido= puntajeObtenido + VerdaderoFalsoArray[i].EntregarRespuesta();
     this.puntajeTotal = puntajeTotal + VerdaderoFalsoArray[i].EntregarPuntaje();
     i = i +1;

     }


        //MODIFICADO quitado el por revisar
     i = 0; 
     while (i < CortaNum)  {
     CortaArray[i].ImprimirPregunta();
     puntajeObtenido=puntajeObtenido + CortaArray[i].EntregarRespuesta();
     puntajeTotal = puntajeTotal + CortaArray[i].EntregarPuntaje();
     i = i +1;

     }
        
       
     
     
     //RESOLUCION
     System.out.println("");
     System.out.println("Puntaje obtenido:" + puntajeObtenido);
     //COMENTADO ESO: System.out.println("Puntaje por revisar:" + this.puntajePorRevisar);
     System.out.println("Puntaje Total:" + puntajeTotal);

    }
    
    
    //metodood guarda archivio
    public void guardarResultados(String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("Resultados de la Prueba:");
            writer.println("Puntaje obtenido: " + puntajeObtenido);
            writer.println("Puntaje total: " + puntajeTotal);
            writer.println();

            //guarda las multiples formato
            for (int i = 0; i < SelecccionNum; i++) {
                writer.println("Pregunta Selección Múltiple: " + SelecccionArray[i].getEnunciado());
                writer.println("Respuesta del usuario: " + SelecccionArray[i].getRespuestaUsuario());
                writer.println("Puntaje: " + SelecccionArray[i].EntregarPuntaje());
                writer.println();
            }

            //guarda v/f formato
            for (int i = 0; i < VerdaderoFalsoNum; i++) {
                writer.println("Pregunta Verdadero/Falso: " + VerdaderoFalsoArray[i].getEnunciado());
                writer.println("Respuesta del usuario: " + VerdaderoFalsoArray[i].getRespuestaUsuario());
                writer.println("Puntaje: " + VerdaderoFalsoArray[i].EntregarPuntaje());
                writer.println();
            }

            //guarda rcorta fortmato
            for (int i = 0; i < CortaNum; i++) {
                writer.println("Pregunta Respuesta Corta: " + CortaArray[i].getEnunciado());
                writer.println("Respuesta del usuario: " + CortaArray[i].getRespuestaUsuario());
                writer.println("Puntaje: " + CortaArray[i].EntregarPuntaje());
                writer.println();
            }

            System.out.println("Resultados guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar resultados: " + e.getMessage()); //exepcion
        }
    }
    

 
    
}
