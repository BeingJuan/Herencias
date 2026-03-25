/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author JuanA
 */
public class Nomina {
private ArrayList<Empleado> listaEmpleados;

public Nomina(){
    this.listaEmpleados=new ArrayList<>();
}
public void registarEmpleados(Empleado e){
    listaEmpleados.add(e);
}

public Empleado buscar (String nombre){
    for (Empleado e : listaEmpleados){
        if(e.getNombre().equalsIgnoreCase(nombre)){
            return e;
        }
    }
    return null;
  }
public Empleado buscar(int indice){
    if (indice >=0 && indice <listaEmpleados.size()){
        return listaEmpleados.get(indice);
    }
    return null;
}
public ArrayList<Empleado> obtenerLista(){
    return listaEmpleados;
    }
}

