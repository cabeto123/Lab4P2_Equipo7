/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo7;

/**
 *
 * @author calol
 */
public class Estado extends Movimiento{
   String problemadeestado; 

    public Estado(String problemadeestado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.problemadeestado = problemadeestado;
    }

    public String getProblemadeestado() {
        return problemadeestado;
    }

    public void setProblemadeestado(String problemadeestado) {
        this.problemadeestado = problemadeestado;
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
        return super.toString()+" problemadeestado=" + problemadeestado + '}';
    }
   
}
