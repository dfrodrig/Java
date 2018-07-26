package arrayListClases;

import java.util.ArrayList;

public class Index {
	
	 public static void main(String[] args){
		  
		 // Nombre los objetos de Beans
		 reciboDeBens resector=new reciboDeBens(7f,"Diego",19,1.2);
		  
		 //Nombramiento del array para retorne los objetos de la clase Beans
		 ArrayList<Object> datos = resector.recogidaArray();
		    
		 //Llamada de un objeto Estatico
		 System.out.println(reciboDeBens.getDatos());
		    
		 //Recoge los objetos de la clase Construct
		 datos.add(resector);
		     
		 //Vista previa de el array 
		 for (int i=0;i<datos.size();i++){
			 
		    System.out.println(datos.get(i));
		    
		 }  
	 }
 } 
