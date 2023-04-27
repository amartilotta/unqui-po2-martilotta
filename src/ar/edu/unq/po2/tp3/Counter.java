package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Counter {
	//Variables de instancia (pirvadas, solo la va a poder ver y modificar counter
	private List<Integer> listaDeNumeros = new ArrayList<Integer>();
	//Variables de instancia (pirvadas, solo la va a poder ver y modificar counter
	
	//Metodos (tipo de alcanzce del metodo (public,private o protected), luego el tipo que va a 
	// retornar ese metodo y el nombre del metodo
	public int cantidadDePares() {
	    return (int) listaDeNumeros.stream()
	                               .filter(numero -> esPar(numero))
	                               .count();
	}
		
	public int cantidadDeImpares() {
	    return (int) listaDeNumeros.stream()
	                               .filter(numero -> !esPar(numero))
	                               .count();
	}


	public int cantidadDeMultiplosDeNumeroHasta(int numero, int rangoMaximo) {
		int cantidadDeMultiplosFinal = 0;
		
		for (int rangoInferior = 0; rangoInferior <= 100; rangoInferior++) {
			if (rangoInferior% numero == 0){
				cantidadDeMultiplosFinal++;
			}
		}
		return (cantidadDeMultiplosFinal);
	}
	
	public Boolean esPar(int unNumero) {
		return unNumero%2 == 0;
	}
	
	public void addNumber(int numero) {
        this.listaDeNumeros.add(numero);
    }
	
	public void addListNumber(List<Integer> listaDeNumeros) {
		
        for (int numero:listaDeNumeros) {
        	this.addNumber(numero);
        }
    }
}
	
	/*
	 * Cantidad de pares
	 * Cantidad de impares
	 * Cantidad de multiplos de numero dado
	 * */
