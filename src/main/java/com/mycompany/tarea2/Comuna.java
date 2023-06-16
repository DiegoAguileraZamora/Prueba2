/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

import java.util.ArrayList;

/**
 *
 * @author Mi PC
 */
public class Comuna {
  private int id;
  private String nombre;
  private double costo ;
  private int Antena;
  private int Vecindario[];
  //ArrayList<Comuna> ComunasValparaiso=new ArrayList<>();

  //Contructores
  
  
  public Comuna(int id,String nombre,double costo,int[] vecindario ){
    this.id=id;
    this.nombre=nombre;
    this.costo=costo;
    this.Vecindario=vecindario;
  }

  //Setters
  
  

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setAntena(int Antena) {
        this.Antena = Antena;
    }

    public void setVecindario(int[] Vecindario) {
        this.Vecindario = Vecindario;
    }


  //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public int getAntena() {
        return Antena;
    }

    public int[] getVecindario() {
        return Vecindario;
    }


  
}
