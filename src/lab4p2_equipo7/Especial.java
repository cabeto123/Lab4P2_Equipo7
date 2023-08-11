/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo7;

/**
 *
 * @author calol
 */
public class Especial extends Movimiento{
    int puntosdepoder,puntosdeprecision;

    public Especial(int puntosdepoder, int puntosdeprecision, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.puntosdepoder = puntosdepoder;
        this.puntosdeprecision = puntosdeprecision;
    }

    public int getPuntosdepoder() {
        return puntosdepoder;
    }

    public void setPuntosdepoder(int puntosdepoder) {
        this.puntosdepoder = puntosdepoder;
    }

    public int getPuntosdeprecision() {
        return puntosdeprecision;
    }

    public void setPuntosdeprecision(int puntosdeprecision) {
        this.puntosdeprecision = puntosdeprecision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString()+  "Puntos de poder=" + puntosdepoder + "puntos de precision=" + puntosdeprecision ;
    }
    
    
}
