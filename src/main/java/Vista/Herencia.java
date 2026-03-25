/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author JuanA
 */

import Modelo.*;
import Controlador.Nomina;
public class Herencia {
    public static void main(String[] args) {
        System.out.println("Aprendiendo herencia");
        Nomina control = new Nomina();
        
        control.registarEmpleados(new Empleado ("Juan", 2600));
        control.registarEmpleados(new Gerente ("Samuel", 6000,1000));
        
        System.out.println("---Listado de pagos---");
        for (Empleado emp : control.obtenerLista()){
        System.out.println("Nonbre: "+ emp.getNombre());
        System.out.println("Pago: "+ emp.calcularpago());
        System.out.println("---------------------------");
        
        
        System.out.println("---Prueba de sobrecarga---");
        Empleado busqueda1=control.buscar("Juan");
        Empleado busqueda2= control.buscar(1);
        
        System.out.println("Prueba de sobrecarga busqueda por nombre : "+(busqueda1 !=null? busqueda1.getNombre():"no existe"));
        System.out.println("Prueba de sobrecarga busqueda por indice : "+ (busqueda2 !=null? busqueda1.getNombre():"no existe"));
        }
    }
}
