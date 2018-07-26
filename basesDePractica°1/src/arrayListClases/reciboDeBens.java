package arrayListClases;



public class reciboDeBens extends Beans{
	
  //Objeto de metodo estatico
	private static String datos="Funcion Static";

   public static String getDatos() {
      return datos;
   }

   public static void setDatos(String datos) {
	  reciboDeBens.datos = datos;
   }

   public reciboDeBens( float c, String n, int e, double Ci) {
     //Instanciamiento del constructor de Beans
	   super(c,n,e,Ci);
	  }
}
