/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6;

/**
 *
 * @author javi
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Alumno alumno = new Alumno();
        alumno.nombre = "Pancho";       
        alumno.calificacion[0]= 50d;
        alumno.calificacion[1]= 60d;
        alumno.calificacion[2]= 100d;
        alumno.calificacion[3]= 25d;
        alumno.calificacion[4]= 100d;    
        
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);
    }
    
    public static Double promedio(Double[] calificacion) {      
        Double promedio = 0d;               
        for (int i = 0; i <calificacion.length; i++) {
            promedio += calificacion[i];
        }               
        promedio = promedio / calificacion.length;        
        return promedio;
    }

    public static String calificacion(Double promedio) {
        String calificacion = "";
        
        if (promedio <= 50) {
            calificacion = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacion = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacion = "C";
        }
        if (promedio >= 81 && promedio <= 90) {
            calificacion = "B";
        }
        if (promedio >= 91 && promedio <= 100) {
            calificacion = "A";
        }
        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {       
        System.out.println("Nombre del estudiante: " + alumno.nombre);     
        for (int i = 0; i < 5; i++) {          
            System.out.println("Calificación " + (i) + ": " + "{" + alumno.calificacion[i] + "}");
        }      
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
    


    

