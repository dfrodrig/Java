package arrayListClases;

import java.util.ArrayList;

public class Beans {
	private float caracteristica;
	  private String nombre;
	    private int edad;
	      private double descripcion;
	      
	/*
	 Array que ordena las variables Se nombre como objetos
	  porque va a recibir todo tipo de ATRIBUTO
	 */
	public ArrayList<Object> recogidaArray(){
	   ArrayList<Object> basePadre = new ArrayList<Object>();
	  	 basePadre.add(caracteristica);
	  	 basePadre.add(nombre);
	  	 basePadre.add(edad);
	  	 basePadre.add(descripcion);
	  	 return (basePadre);
	}      
	
	//Constructor para que al llamarla se puedan ir nombrando enseguida
	  public Beans(float caracteristica, String nombre, int edad, double descripcion) {
		this.caracteristica = caracteristica;
		 this.nombre = nombre;
		  this.edad = edad;
		   this.descripcion = descripcion;
	  }
	
	//GET and Setter
	public float getCaracteristica() {
		return caracteristica;
	}
	
	public void setCaracteristica(float caracteristica) {
		this.caracteristica = caracteristica;
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
	
	public double getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(double descripcion) {
		this.descripcion = descripcion;
	}
}
