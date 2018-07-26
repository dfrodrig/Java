package Polimorfimo;

import java.util.ArrayList;
import java.util.Arrays;

public class index {
	public static  ArrayList<Padre> familia1=new ArrayList<Padre>();

	  public static void main(String[] args) {
		  
		    Padre sister=new Hijo("Diego","Rodrig",323,232,1.2,"INGLES");
		       familia1.add(sister);
		     for(int i=0;i < familia1.size();i++){
		    	 System.out.println(familia1.get(0));
		      }
		    }      

}
