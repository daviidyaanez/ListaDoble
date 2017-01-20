package lista;

public class Aplicacion {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Lista lista = new Lista ();
			
		    lista.insertarInicio("Juan");
			lista.insertarFinal("Mario");
			lista.insertarInicio("Carla");
			lista.insertarFinal("Tatiana");
			lista.insertarFinal("Rebeca");
			lista.insertarInicio("Jose");
			
			
			lista.imprimir();
			
			
			
			
	      	lista.buscar("Rebeca");
	      	lista.eliminarElemento("Juan");
	      	
	      	lista.buscarPos(3);
	
	      	lista.imprimir();
	      	

	      
	    //	lista.imprimir2();
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
