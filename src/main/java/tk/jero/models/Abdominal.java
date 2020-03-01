package tk.jero.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tk.jero.resources.Fecha;


/**
 * Representa a una prueba abdominal de un jugador en un minuto con su valor si es hombre o mujer
 * @author Rafael Vel�squez
 *
 */
public class Abdominal {
	/**
	 * Definici�n de la prueba
	 */
	public static final String definicion="Maximas abdominales en 1 minuto, posicion espalda suelo,"
			+ " pies flexionados en el aire y cruzando uno en el pie,\n subir hasta levantar la parte superior de la espalda"
			+ "\nHombre: 49-60 excelente(5 puntos) 37-48 bueno(4 puntos) 25-36 promedio(3 puntos) "
			+ "13-24 malo(2 puntos) 1-12 muy malo(1 punto)\n"
			+ "Mujeres 41-50 excelente(5 puntos) 31-40 bueno(4 puntos) 21-31 promedio(3 puntos)"
			+ " 11-20 malo(2 putnos) 1-10 muy malo(1 punto)";
	
	/**
	 * Si el jugador masculino su valor  debe ser true, si es femenino ser� false
	 */
	boolean hombre;
	private int puntuacionDePrueba, numeroDeAbdominales;
	/**
	 * Fecha en que se hace la prueba
	 */
	private Fecha fecha;


	/**
	 * Crea una prueba vacia, solo con la fecha de la instancia
	 */
	public Abdominal() {
	}

	/**
	 *  * Si es masculino se inserta true, y el n�mero de abdominales en el minuto
	 * @param hombre true si es masculino
	 * @param numeroDeAbdominales N�mero de abdominales en un minuto
	 * @param fecha Fecha de la prueba
	 */
	public Abdominal(boolean hombre, int numeroDeAbdominales,Fecha fecha) {
		super();
		this.hombre=hombre;
		this.numeroDeAbdominales = numeroDeAbdominales;
		this.fecha=fecha;
		getPuntuacionDePrueba(hombre);
	}
	

	/**
	 * Retorna la fecha de la prueba
	 * @return Fecha de la prueba
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * Retorna el n�mero de abdominales hechos en un minuto
	 * @return
	 */
	public int getNumeroDeAbdominales() {
		return numeroDeAbdominales;
	}

	/**
	 * El resultado de la prueba seg� su sexo
	 * @return resultado en puntuaci�n 1 a 5 
	 */
	public int getPuntuacionDePrueba(boolean hombre) {
		if (numeroDeAbdominales<0 || numeroDeAbdominales >=90) {
			throw new RuntimeException("El n�mero de abdominales es 0 o inferior, o sobrepasa los 90");
		}
		if (hombre) {
			if (numeroDeAbdominales>=49) {
				puntuacionDePrueba=5;
			} else if (numeroDeAbdominales>=37 && numeroDeAbdominales<=48) {
				puntuacionDePrueba=4;
			} else if (numeroDeAbdominales>=25 && numeroDeAbdominales<=36) {
				puntuacionDePrueba=3;
			} else if (numeroDeAbdominales>=13 && numeroDeAbdominales<=24) {
				puntuacionDePrueba=2;
			} else if (numeroDeAbdominales>=1&& numeroDeAbdominales<=12) {
				puntuacionDePrueba=1;
			}else{
				puntuacionDePrueba=0;
			}
		}else{
			if (numeroDeAbdominales>=41) {
				puntuacionDePrueba=5;
			} else if (numeroDeAbdominales>=31 && numeroDeAbdominales<=40) {
				puntuacionDePrueba=4;
			} else if (numeroDeAbdominales>=21 && numeroDeAbdominales<=30) {
				puntuacionDePrueba=3;
			} else if (numeroDeAbdominales>=11 && numeroDeAbdominales<=20) {
				puntuacionDePrueba=2;
			} else if (numeroDeAbdominales>=1&& numeroDeAbdominales<=10) {
				puntuacionDePrueba=1;
			}else{
				puntuacionDePrueba=0;
			}
		}
		return puntuacionDePrueba;
	}

	/**
	 * A�ade la fecha de la prueba
	 * @param fecha Fecha de la prueba
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/**
	 * A�ade los abdominales hechos en un minuto
	 * @param numeroDeAbdominales
	 */
	public void setNumeroDeAbdominales(int numeroDeAbdominales) {
		this.numeroDeAbdominales = numeroDeAbdominales;
	}

	public String toString() {
		return "\nAbdominal [hombre=" + hombre + ", puntuacionDePrueba="
				+ puntuacionDePrueba + ", numeroDeAbdominales="
				+ numeroDeAbdominales + ", fecha de la prueba="+fecha+"]";
	}
}
