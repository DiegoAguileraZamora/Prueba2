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
public class MinimizationCost {
    
    
    // Lista de comunas a cubrir
    private ArrayList<Comuna> comunasACubrir;
    
  public void InstanciarComunas(){
    comunasACubrir = new ArrayList<Comuna>();
    int a[] = {3,4,5};
    comunasACubrir.add(new Comuna(2,"Calle Larga", 1,  a));
    int b[] = {5,27,29};
    comunasACubrir.add(new Comuna(3,"San Esteban", 1.5, b));
    int c[] = {2,5,25,26,28};
    comunasACubrir.add(new Comuna(4,"Rinconada", 1.2, c));
    int d[] = {2,3,28,29};
    comunasACubrir.add(new Comuna(5,"Los Andes", 2,d));
    int e[] = {7,9,15,24,27};
    comunasACubrir.add(new Comuna(6,"Cabildo", 3,e));
    int f[] = {6,8,9,10,15};
    comunasACubrir.add(new Comuna(7,"La Ligua", 2,f));
    int g[] = {7,8};
    comunasACubrir.add(new Comuna(8,"Papudo", 1,g));
    int h[] = {6,7};
    comunasACubrir.add(new Comuna(9,"Petorca", 1,h));
    int i[] = {7,8,15,33};
    comunasACubrir.add(new Comuna(10, "Zapallar", 3,i));
    int j[] = {12,15,16,17,24,25};
    comunasACubrir.add(new Comuna(11, "Hijuelas", 4,j));
    int k[] = {11,13,15};
    comunasACubrir.add(new Comuna(12, "La Calera", 3,k));
    int l[] = {13,15,17,33};
    comunasACubrir.add(new Comuna(13, "La Cruz", 3,l));
    int m[] = {16,17,30,31,37};
    comunasACubrir.add(new Comuna(14, "Limache", 2,m));
    int n[] = {6,7,10,11,12,13,24,33};
    comunasACubrir.add(new Comuna(15, "Nogales", 2.5,n));
    int o[] = {11,14,17,30,37};
    comunasACubrir.add(new Comuna(16, "Olmué", 1.5,o));
    int p[] = {11,13,14,16,31,33,35};
    comunasACubrir.add(new Comuna(17, "Quillota", 2,p));
    int q[] = {20,34};
    comunasACubrir.add(new Comuna(18, "Algarrobo", 2,q));
    int r[] = {22,21,34};
    comunasACubrir.add(new Comuna(19, "Cartagena", 3,r));
    int s[] = {21,34,18};
    comunasACubrir.add(new Comuna(20, "El Quisco", 2,s));
    int t[] = {19,34,20};
    comunasACubrir.add(new Comuna(21, "El Tabo", 2,t));
    int u[] = {23,19};
    comunasACubrir.add(new Comuna(22, "San Antonio", 3,u));
    int v[] = {22};
    comunasACubrir.add(new Comuna(23, "Santo Domingo", 2,v));
    int w[] = {6,28,26,25,11,15};
    comunasACubrir.add(new Comuna(24, "Catemu", 3,w));
    int x[] = {4,26,24,11};
    comunasACubrir.add(new Comuna(25, "Llay-Llay", 3,x));
    int y[] = {28,24,25};
    comunasACubrir.add(new Comuna(26, "Panquehue", 1,y));
    int z[] = {3,29,28,6};
    comunasACubrir.add(new Comuna(27, "Putaendo", 2.5,z));
  ///
    int aa[] = {4,26,24,27,29};
    comunasACubrir.add(new Comuna(28, "San Felipe", 2,aa));
    int bb[] = {28,27,3};
    comunasACubrir.add(new Comuna(29, "Santa María", 3.5,bb));
    int cc[] = {34,36,38,14,37,16};
    comunasACubrir.add(new Comuna(30, "Quilpué", 2,cc));
    int dd[] = {38,14,35};
    comunasACubrir.add(new Comuna(31, "Concón", 1.5,dd));
    int ee[] = {35,13,15,10,17};
    comunasACubrir.add(new Comuna(33, "Puchuncaví", 2,ee));
    int ff[] = {19,21,20,18,36,30};
    comunasACubrir.add(new Comuna(34, "Casablanca", 3,ff));
    int gg[] = {31,17,33};
    comunasACubrir.add(new Comuna(35, "Quintero", 3.5,gg));
    int hh[] = {38,30,34};
    comunasACubrir.add(new Comuna(36, "Valparaíso", 2,hh));
    int ii[] = {14,30};
    comunasACubrir.add(new Comuna(37, "Villa Alemana", 2.5,ii));
    int jj[] = {31,30,36};
    comunasACubrir.add(new Comuna(38, "Viña del Mar", 1.5,jj));
    }

    public ArrayList<Comuna> getComunasACubrir() {
        return comunasACubrir;
    }

    public void setComunasACubrir(ArrayList<Comuna> comunasACubrir) {
        this.comunasACubrir = comunasACubrir;
    }
  
  
}
