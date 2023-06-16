/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2;

/**
 *
 * @author Mi PC
 */
public class Tarea2 {

    public static void main(String[] args) {
   
      //// Desde aqui
      // bucle que haga 10 veces al azar 
    for(int i=0; i<10 ;i++){
        int contador =0;
        while(true){// condicion que se llenen las conecciones 
            MinimizationCost prueba =new MinimizationCost();
            prueba.InstanciarComunas();
            int SinConeccion[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,33,34,35,36,37,38};
            
            int random_int = (int)Math.floor(Math.random() * (37 - 2 + 1) + 2); //random entre 2 y 37(+1) prox linea para excluir el 32
            // error pq va de 2 a 38 y no cuenta el 0,1  creo... // numero maximo 36
            if(random_int>=32) {
                random_int++;
            }
            System.out.println("numero random es : "+random_int); // se escribe el numero random que se pone el satelite 
            for(int j=0; j< prueba.getComunasACubrir().get(random_int).getVecindario().length ;j++){
                for(int k=0;k<36;k++){
                    //if(prueba.getComunasACubrir().get(random_int).getVecindario(j)==SinConeccion[k]){ //dfg
                    SinConeccion[k]=0;
                    }
                }
                
                
                System.out.println(prueba.getComunasACubrir().size());
                System.out.println(prueba.getComunasACubrir().get(random_int).getVecindario().length );
                contador=36;
                break;
            }
            
           
            System.out.println("aaaaa");
                
             
        if(contador ==36) break;  // hacer que si se cumplen todas las regiones break 
         
         
        }
        
    }
    //Seleccionar mejor solucion 
      
    

}

   
          