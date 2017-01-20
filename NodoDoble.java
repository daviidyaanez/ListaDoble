package lista;

public class NodoDoble {
	
	
	private String elemento;
	private NodoDoble siguiente;
	private NodoDoble anterior;
	
	
	
	public NodoDoble(String elemento, NodoDoble siguiente, NodoDoble anterior) {
		
		this.elemento = elemento;
		this.siguiente = siguiente;
		this.anterior = anterior;
		
		
	}
	public NodoDoble(String elemento, NodoDoble siguiente) {
	
		this.elemento = elemento;
		this.siguiente = siguiente;
		this.anterior=null;
		
	}
	public NodoDoble(String elemento) {
		
			this.elemento = elemento;
			this.siguiente=null;
			this.anterior=null;
		}

	
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public NodoDoble getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}
	public NodoDoble getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	
	
	
	
	
	
	

}
