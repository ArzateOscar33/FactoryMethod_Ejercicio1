/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio1;

/**
 *
 * @author Arzate
 */
public class CarFactory extends FabricaVehiculos{

    @Override
    public IVehiculo CrearVehiculo() {
     return new Auto(); 
    }
    
}
