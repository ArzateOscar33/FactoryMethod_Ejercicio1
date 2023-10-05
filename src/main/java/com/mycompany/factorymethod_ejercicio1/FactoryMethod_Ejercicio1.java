/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Arzate
 */
public class FactoryMethod_Ejercicio1 {

    public static void main(String[] args) {
        FabricaVehiculos FV= null;
        while(true){
            System.out.println("Elija una opcion para crear un vehiculo");
            System.out.println("1)Auto");
            System.out.println("2)Bicicleta");
            Scanner leer= new Scanner(System.in);
            int num= leer.nextInt();
            if(num==1){
                FV= new CarFactory();
            }
            else{
                FV= new BikeFactory();
            }
            IVehiculo vehiculo= FV.OrderVehiculo();
        }//while
    }
}
