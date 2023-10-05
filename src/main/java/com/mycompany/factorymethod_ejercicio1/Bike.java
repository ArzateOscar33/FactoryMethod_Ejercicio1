/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio1;

/**
 *
 * @author Arzate
 */
public  class Bike implements IVehiculo{

    @Override
    public void Start() {
        System.out.println("Empiezo con la bicicleta");}


    @Override
    public void Drive() {
        System.out.println("Estoy manejando la bicicleta");}
    
        @Override
    public void Stop() {
        System.out.println("Me detengo con la bicicleta");}

    
}
