package tk.jero.models.pruebasfuncionales;


import org.springframework.stereotype.Component;

import tk.jero.resources.Fecha;


/**
 * Representa a una prueba abdominal de un jugador en un minuto con su valor si es hombre o mujer
 * @author Rafael Vel�squez
 *
 */
@Component
public class Lumbar {
	/**
	 * Definición de la prueba
	 */
	public static final String definicion="Maximas lumbares en 1 minuto, "
			+ "posicion boca abajo,manos en la nuca codos en horizontal, subir hasta levantar la parte superio del pecho,"
			+ "\nHombre: 49-60 excelente(5 puntos) 37-48 bueno(4 puntos) 25-36 promedio(3 puntos) "
			+ "General hombre y mujeres: 60-84 excelente 63-47 bueno 30-46 promedio 13-29 malo 1-12 muy malo";
	
	private int puntuacionDePrueba, numeroDeLumbares;
	/**
	 * Fecha en que se hace la prueba
	 */
	private Fecha fecha;

	/**
	 * Crea una prueba vacia, solo con la fecha de la instancia
	 */
	public Lumbar() {
	}

	/**
	 *  * Si es masculino se inserta true, y el número de abdominales en el minuto
	 * @param hombre true si es masculino
	 * @param numeroDeAbdominales número de abdominales en un minuto
	 * @param fecha Fecha de la prueba
	 */
	public Lumbar(int numeroDeAbdominales,Fecha fecha) {
		this.numeroDeLumbares = numeroDeAbdominales;
		this.fecha=fecha;
		getPuntuacionDePrueba();
	}
	

	/**
	 * Retorna la fecha de la prueba
	 * @return Fecha de la prueba
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * Retorna el número de abdominales hechos en un minuto
	 * @return
	 */
	public int getNumeroDeLumbares() {
		return numeroDeLumbares;
	}

	/**
	 * El resultado de la prueba, igual para ambos sexos
	 * @return resultado en puntuación 1 a 5 
	 */
	public int getPuntuacionDePrueba() {
		if (numeroDeLumbares<0 || numeroDeLumbares >=90) {
			throw new RuntimeException("El número de lumbares es 0 o inferior, o sobrepasa los 90");
		}
		if (numeroDeLumbares >= 60) {
			puntuacionDePrueba = 5;
		} else if (numeroDeLumbares >= 47 && numeroDeLumbares <= 63) {
			puntuacionDePrueba = 4;
		} else if (numeroDeLumbares >= 30 && numeroDeLumbares <= 46) {
			puntuacionDePrueba = 3;
		} else if (numeroDeLumbares >= 13 && numeroDeLumbares <= 29) {
			puntuacionDePrueba = 2;
		} else if (numeroDeLumbares >= 1 && numeroDeLumbares <= 12) {
			puntuacionDePrueba = 1;
		} else {
			puntuacionDePrueba = 0;
		}

		return puntuacionDePrueba;
	}

	/**
	 * Añade la fecha de la prueba
	 * @param fecha Fecha de la prueba
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/**
	 * Añade los abdominales hechos en un minuto
	 * @param numeroDeAbdominales
	 */
	public void setNumeroDeLumbares(int numeroDeLumbares) {
		this.numeroDeLumbares = numeroDeLumbares;
	}

	public String toString() {
		return "\nLumbar [puntuacionDePrueba="
				+ puntuacionDePrueba + ", numeroDeAbdominales="
				+ numeroDeLumbares + ", fecha de la prueba="+(fecha!=null?fecha:"No hay fecha")+"]";
	}
}
