/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDeVehiculos;

import Interfaces.GiroDerecha;
import Interfaces.GiroIzquierda;
import Vehiculos.Vehiculos;
import Vehiculos.Vehiculos;
import Vehiculos.Vehiculos;

/**
 *
 * @author emili
 */
public class VehiculodeCarrera extends Vehiculos implements GiroDerecha, GiroIzquierda {

    /**
     * Constructor del Vehiculo de Carrera
     *
     * @param Combustible
     * @param CantidadCombustible
     * @param Pasajeros
     * @param VelocidadMax
     * @param AceleracionBase
     */
    public VehiculodeCarrera(String Combustible, int CantidadCombustible, int Pasajeros, int VelocidadMax, double AceleracionBase) {
        super(Combustible, CantidadCombustible, Pasajeros, VelocidadMax, AceleracionBase);
    }

    /**
     * Metodo de la clase abstract
     */
    @Override
    public void presentarVehiculo() {
        System.out.println("VEHICULO DE CARRERA");
    }

    /**
     * Metodos de interfaces
     */
    @Override
    public void moverDerecha() {
        System.out.println("Me moví a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("Me movi a la izquierda");
    }

}
