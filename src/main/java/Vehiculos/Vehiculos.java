/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author emili
 */
public abstract class Vehiculos{
    /**
     * Atributos de la clase vehiculo
     */
    private String Combustible;
    private int CantidadCombustible;
    private int Pasajeros;
    private int VelocidadMax;
    private double AceleracionBase;
     /**
     *Constructor de Vehiculos
     */
   
    public Vehiculos(String Combustible, int CantidadCombustible, int Pasajeros, int VelocidadMax, double AceleracionBase) {
        this.Combustible = Combustible;
        this.CantidadCombustible = CantidadCombustible;
        this.Pasajeros = Pasajeros;
        this.VelocidadMax = VelocidadMax;
        this.AceleracionBase = AceleracionBase;
    }
     /**
     * Gettersy Setters Metodos para obtener y Settear los parametros
     */
    
    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public int getCantidadCombustible() {
        return CantidadCombustible;
    }

    public void setCantidadCombustible(int CantidadCombustible) {
        this.CantidadCombustible = CantidadCombustible;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public int getVelocidadMax() {
        return VelocidadMax;
    }

    public void setVelocidadMax(int VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }

    public double getAceleracionBase() {
        return AceleracionBase;
    }

    public void setAceleracionBase(double AceleracionBase) {
        this.AceleracionBase = AceleracionBase;
    }
     
}
