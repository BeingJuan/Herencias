/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */
public class Gerente extends Empleado{
    private double bono;
    public Gerente(String nombre, double salariobase,double bono) {
        super(nombre,salariobase);
        this.bono=bono;
    }
    @Override
    public double calcularpago(){
        return salariobase + bono;
    }
    
}
