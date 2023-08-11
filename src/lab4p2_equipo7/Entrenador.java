/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo7;

import java.util.ArrayList;

/**
 *
 * @author calol
 */
public class Entrenador {
    String nombre;
    int edad;
    double dinero;
    Pokemon[] pokemones= new Pokemon[6];
    ArrayList<Pokemon> cajapokemon= new ArrayList();

    public Entrenador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Pokemon[] getPokemones() {
        return pokemones;
    }

    public void setPokemones(Pokemon[] pokemones) {
        this.pokemones = pokemones;
    }

    public ArrayList<Pokemon> getCajapokemon() {
        return cajapokemon;
    }

    public void setCajapokemon(ArrayList<Pokemon> cajapokemon) {
        this.cajapokemon = cajapokemon;
    }

    @Override
    public String toString() {
        return   "Nombre= " + nombre + "Edad= " + edad + "Dinero= "  + dinero + "Pokemones= " + pokemones + "Caja de pokemon=" + cajapokemon ;
    }
    
    
}
