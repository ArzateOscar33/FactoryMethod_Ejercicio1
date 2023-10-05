/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio1;

/**
 *
 * @author Arzate
 */
public abstract class FabricaVehiculos {

    
    
    public abstract IVehiculo CrearVehiculo();
    
    public IVehiculo OrderVehiculo()
    {
        IVehiculo vehiculo= CrearVehiculo();
        vehiculo.Start();
        vehiculo.Drive();
        vehiculo.Stop();
        return vehiculo;
    }
}
