/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import TiposDeVehiculos.VehiculodeCarrera;
import TiposDeVehiculos.VehiculoCarga;
import TiposDeVehiculos.Camioneta;

/**
 *
 * @author emili
 */
public class Inicializador {


    /**
     * Vector de vehiculos
     */
    private final Vehiculos[] vehiculos;

    /**
     * Constructor de vehiculos
     */
    public Inicializador() {
        vehiculos = new Vehiculos[20];
    }

    /**
     * Metodo que obtiene el vector
     *
     * @return
     */
    public Vehiculos[] getVehiculos() {
        return vehiculos;
    }

    /**
     * Metodo para inicializar vehiculos
     */
    public void IncicializarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            if (i >= 0 && i < 6) {
                vehiculos[i] = new Camioneta("Diesel", 100, 25, 85, 10.5);
            } else if (i >= 6 && i <= 12) {
                vehiculos[i] = new VehiculodeCarrera("Gasolina", 100, 2, 435, 21.7);
            } else if (i > 12 && i <= 20) {
                vehiculos[i] = new VehiculoCarga("Diesel", 75, 3, 65, 3.5);
            }
        }

    }

    public void MostrarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] instanceof Camioneta) {
                System.out.println("------ Camioneta " + (i + 1) + " ------");
                vehiculos[i].presentarVehiculo();
            } else if (vehiculos[i] instanceof VehiculoCarga) {
                System.out.println("------ Vehiculo de Carga " + (i + 1) + " ------");
                vehiculos[i].presentarVehiculo();
            } else if (vehiculos[i] instanceof VehiculodeCarrera) {
                System.out.println("------ Vehiculo de Carrera " + (i + 1) + " ------");
                vehiculos[i].presentarVehiculo();

            }

        }
    }

}
