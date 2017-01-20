package lista;



public class Lista {

	
protected NodoDoble cabeza;  
protected long tamaño;	
protected NodoDoble ultimo;

public Lista(){
	cabeza = null;
	ultimo =null;
	tamaño =0;
}	


// Pregunta si la lista esta vacia
public boolean esVacia(){
    return cabeza == null;
}


//Inserta un elemnto al inicio de la lista 

public void insertarInicio(String dato) {
	NodoDoble nuevo = new NodoDoble(dato);
    if (esVacia()) 
    cabeza = nuevo;
    else
    nuevo.setSiguiente(cabeza);
    cabeza.setAnterior(nuevo);
    cabeza=nuevo;

  }




//Inserta un elemnto al final de la lista 

public void insertarFinal(String dato){
    NodoDoble nuevo = new NodoDoble(dato);
    if(cabeza == null){
    cabeza = nuevo;
    ultimo=nuevo;
    }else{
    NodoDoble aux = cabeza;
    while(aux.getSiguiente() != null){
    aux = aux.getSiguiente();
   
    }
    aux.setSiguiente(nuevo);
    nuevo.setAnterior(aux);

    }
   
    }

 
 
 

 // Imprime la lista 


public void imprimir2()
{
    System.out.println(" << LISTA DESCENDENTE >> ");

    NodoDoble actual= ultimo;
    while(actual!=cabeza)
    {
    	
        System.out.println(actual.getElemento());
        actual=actual.getAnterior();
    }
         // System.out.println(actual.getElemento());

}


    public void imprimir()
{
        System.out.println(" << LISTA ASCENDENTE >> ");
    NodoDoble actual = cabeza;
   
    while(actual!=ultimo)
    {
        System.out.println(actual.getElemento());
        actual=actual.getSiguiente();
    }
         //  System.out.println(actual.getElemento());
             
}


 
 

//Cuenta el numero de elementos 
 
	 public long tamañooo(){
	     NodoDoble aux;
	     tamaño=0;
	     aux = cabeza;

	     while(aux != null){
	         tamaño++;
	         aux = aux.getSiguiente();
	     }
	   //  System.out.println("El tamaño de la lista es: "+tamaño);
	     return tamaño;
	 }
	 
	 // Eliminar Elemento
	 
	 public void eliminarElemento(String dato){
         if (cabeza != null){
                    NodoDoble aux = cabeza;
                    NodoDoble ant = null;
                    while (aux != null){
                                if (aux.getElemento().equals(dato)  ){
                                            if (ant == null){
                                                        cabeza = cabeza.getSiguiente();
                                                        aux.setSiguiente(null);
                                                        aux= cabeza;
                                           
                                            }else {
                                                        ant.setSiguiente(aux.getSiguiente());
                                                        aux.setSiguiente(null);
                                                        aux = ant.getSiguiente();
                                            }                                             
                                            }else{
                                                        ant = aux;
                                                        aux = aux.getSiguiente();
                                            }
                                }
                    }
                   
         }

 // Buscar Elemento 
	  
	 public void buscar(String dato){
	        NodoDoble aux=cabeza;
	        int con=1;
	        
	            while(aux!=null){
	                if (aux.getElemento().equalsIgnoreCase(dato)){
	                  
	                	
	                	  System.out.println("Elemento encontrado: "+aux.getElemento());
	                    System.out.println	("Su posicion es: "+ con );

	                }
	                con ++;
	                aux=aux.getSiguiente();
	                
	                
	                 
	            }
	        }
// Buscar Elemento por posicion 
	 
 public void buscarPos(int pos){
		 
	     NodoDoble aux= cabeza;
	     int contador=1;

	     if(pos<1 || pos>=tamañooo()){
	         System.out.println("Posicion Incorrecta");
	     }else{
	         while(aux!=null){
	             if (pos == contador){
	                 System.out.println("Elemento encontrado: "+aux.getElemento());
	                 System.out.println	("Su posicion es: "+ pos);
	                 aux=null;
	                 }
	                 
	             else{                 
	                 aux=aux.getSiguiente();
	                 contador++;
	             }
	         }
	     }
	 }
	 
	 
	 
	 









}
