/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Modelo;

/**
 *
 * @author JuanA
 */
public class Empleado {

    protected String nombre;
    protected double salariobase;
    
    public Empleado (String nombre, double salariobase){
        this.nombre=nombre;
        this.salariobase=salariobase;
    }
    
    public double calcularpago(){
        return salariobase;
    }
    public String getNombre(){
        return nombre;
    }
}


