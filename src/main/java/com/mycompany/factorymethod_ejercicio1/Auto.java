package com.mycompany.factorymethod_ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arzate
 */
public class Auto implements IVehiculo{

    @Override
    public void Start() {
        System.out.println("Estoy empezando desde el Automovil"); }

    @Override
    public void Stop() {
        System.out.println("Estoy Deteniendo el Automovil"); }

    @Override
    public void Drive() {
        System.out.println("Estoy manejando el automovil");}
    
}
