package tryCatch;

public class Prueba {
	public void Sum(){
		try{
			Datos();
		}catch(Exception e){
		    System.out.println("Cero");
		}
	}
    public boolean Datos () throws Exception{
    	try{
    		int i=1,h=1;
    		i=h;
    		return true;
    	}catch(Exception e){
    		throw new Exception("Datos invalidos");
    	}
    	
    }
	public static void main(String[] args) {
		Prueba objeto=new Prueba();
           objeto.Sum();
	}
}
