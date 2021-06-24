/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDeVehiculos;

import Interfaces.GiroDerecha;
import Interfaces.GiroIzquierda;
import Vehiculos.Vehiculos;

/**
 *
 * @author emili
 */
public class VehiculoCarga extends Vehiculos implements GiroDerecha, GiroIzquierda {

    /**
     * Constructor del Vehiculo de Carga
     *
     * @param Combustible
     * @param CantidadCombustible
     * @param Pasajeros
     * @param VelocidadMax
     * @param AceleracionBase
     */
    public VehiculoCarga(String Combustible, int CantidadCombustible, int Pasajeros, int VelocidadMax, double AceleracionBase) {
        super(Combustible, CantidadCombustible, Pasajeros, VelocidadMax, AceleracionBase);
    }

    /**
     * Metodo de la clase abstract
     */
    @Override
    public void presentarVehiculo() {
        System.out.println("VEHICULO DE CARGA");
    }

    /**
     * Metodos de interfaces
     */
    @Override
    public void moverDerecha() {
        System.out.println("Me movi a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("Me movi a la izquierda");
    }
}
