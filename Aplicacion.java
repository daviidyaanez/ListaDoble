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
			
			
			lista.imprimirLista();
			
			lista.eliminarElemento("Juan");
			lista.imprimirLista();
			
	      	lista.buscar("Rebeca");
	      	
	      	lista.buscarPos(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
