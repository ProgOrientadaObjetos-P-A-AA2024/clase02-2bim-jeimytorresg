/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 13 junio 2024
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        String n, a, ide;
        byte edad;
        double costo;
        int creditos;
        
        
        while(bandera){
            System.out.println("Ingrese el nombre del estudiante: ");
            n = sc.nextLine();
            System.out.println("Ingresar el apellido del estudiante: ");
            a = sc.nextLine();
            System.out.println("Ingrese la identificacion del estudiante: ");
            ide = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad = sc.nextByte();
            
            System.out.println("Ingrese el numero de creditos: ");
            creditos = sc.nextInt();
            System.out.println("Ingrese el costo de los creditos: ");
            costo = sc.nextDouble();
            
            EstudiantePresencial est = new EstudiantePresencial(n,a,ide,edad,
                    costo,creditos);
            est.calcularMatriculaPresencial();
            sc.nextLine();
            cadena = String.format("%s%s\n", cadena, est);
            System.out.println("Desea salir, pulse S");
            String opcion = sc.nextLine();
            if(opcion.equalsIgnoreCase("S")){
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", cadena);
        
        
    }
}




