/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo7;

/**
 *
 * @author calol
 */
public class Pokemon {
   String especie;
   int nivel,experiencia_Acumulada,experiencia_subirnivel;
   Movimiento[] movimientos = new Movimiento[4];

    public Pokemon(String especie, int nivel, int experiencia_Acumulada, int experiencia_subirnivel) {
        this.especie = especie;
        this.nivel = nivel;
        this.experiencia_Acumulada = experiencia_Acumulada;
        this.experiencia_subirnivel = experiencia_subirnivel;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia_Acumulada() {
        return experiencia_Acumulada;
    }

    public void setExperiencia_Acumulada(int experiencia_Acumulada) {
        this.experiencia_Acumulada = experiencia_Acumulada;
    }

    public int getExperiencia_subirnivel() {
        return experiencia_subirnivel;
    }

    public void setExperiencia_subirnivel(int experiencia_subirnivel) {
        this.experiencia_subirnivel = experiencia_subirnivel;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Especie= "  + especie + "Nivel=" + nivel + "Experiencia Acumulada= " + experiencia_Acumulada + "Experiencia_subirnivel= " + experiencia_subirnivel + "Movimientos=" + movimientos ;
    }
   
           
    
}
