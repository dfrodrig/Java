/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numAleatorios;

import java.util.ArrayList;

public class numAleatorios {
    public static void main(String[] args){
    ArrayList<String> names =new ArrayList<>();    
    names.add("Diego");names.add("David");names.add("Juan");
    //names.add("Jesus");names.add("Angel");names.add("Andres");
    //names.add("Cristian");names.add("July");names.add("Camilo");
    //names.add("Luis");names.add("Cristian");names.add("Pedro");
  
     int cont=0;
     int i=0;
    while(cont<=2){
        int numero = (int)(Math.random()*3);              
        if(names.get(numero)==names.get(0) && names.get(0)!=""){
               i=i+1;
                    System.out.println(i+" "+names.get(0)); 
                     names.set(0,"");
                       cont++;                                                 
              } else if(names.get(numero)==names.get(1) && names.get(1)!=""){                 
                  i=i+1;
                    System.out.println(i+" "+names.get(1)); 
                     names.set(1,"");
                       cont++;                                                 
              } else if(names.get(numero)==names.get(2) && names.get(2)!=""){                 
                  i=i+1;
                    System.out.println(i+" "+names.get(2)); 
                     names.set(2,"");
                       cont++;                                                 
              }             
          }      
    }
 }