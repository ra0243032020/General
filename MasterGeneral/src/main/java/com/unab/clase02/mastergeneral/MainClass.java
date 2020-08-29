/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.mastergeneral;

import java.util.Scanner;

/**
 *
 * @author FAMILIA
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor escribe tu Edad:");
        int Edad = sc.nextInt();

        System.out.println("Por favor escribe tu Nombre:");
        String Nombre = sc.next();

        System.out.println("Por favor escribe tu Sexo:");
        String Sexo = sc.next();

        System.out.println("Por favor escribe tu Peso:");
        float Peso = sc.nextFloat();

        System.out.println("Por favor escribe tu Altura:");
        float Altura = sc.nextFloat();

        Persona persona1 = new Persona(Nombre, Sexo, Peso, Altura, Edad);

        Persona persona2 = new Persona(persona1.getNombre(), persona1.getSexo(), persona1.getEdad());

        Persona persona3 = new Persona();
        persona3.setNombre(Nombre);
        persona3.setEdad(Edad);
        persona3.setAltura(Altura);
        persona3.setPeso(Peso);
        persona3.setSexo(Sexo);
        
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona1.persona()); 
       
        System.out.println(persona2.esMayorDeEdad()); 
        System.out.println(persona2.toString());
    
        System.out.println(persona3.esMayorDeEdad()); 
        System.out.println(persona3.persona()); 
    }

}
