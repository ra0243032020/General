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
public class Persona {

    private String Nombre, Sexo;
    private float Peso, Altura;
    private int Edad;

    public Persona() {

    }

    public Persona(String Nombre, String Sexo, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }

    public Persona(String Nombre, String Sexo, float Peso, float Altura, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Edad = Edad;
    }

    public String persona() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + ", Edad=" + Edad + '}';
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Edad=" + Edad + '}';
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    String esMayorDeEdad() {
            int Edad = this.Edad;
        if (Edad >= 18) {
            return "Eres meyor de edad";
        } else {
            return "Eres Menor de edad";

        }

    }
}
