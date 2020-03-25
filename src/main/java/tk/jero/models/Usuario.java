package tk.jero.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import tk.jero.resources.Fecha;

/**
 * Representa a un jugador de un equipo
 * 
 * @author Rafael Velásquez 13/1/2020
 *
 */
@Component
public class Usuario {

	private Fecha fechaNacimiento;
	private String nombre;

	@Autowired
	@Qualifier("funcionales")
	public List<PruebasFuncionales> pruebasFuncionales;

	private double talla, peso;

	public Usuario() {
	}

	public Usuario(String nombre, Fecha fechaNacimiento, double talla, double peso) {
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setTalla(talla);
		setPeso(peso);
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public List<PruebasFuncionales> getPruebasFuncionales() {
		return pruebasFuncionales;
	}

	public double getTalla() {
		return talla;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		if (fechaNacimiento == null) {
			throw new RuntimeException("La fecha de nacimiento del usuario es nula");
		}

		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNombre(String nombre) {

		if (nombre.isEmpty() || nombre == null) {
			this.nombre = "Sin nombre conocido";
		}
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		if (peso <= 0 || peso > 350) {
			throw new RuntimeException("El peso del usuario es 0 o inferior, o supera los 350 kg.");
		}
		this.peso = peso;
	}

	public void setPruebasFuncionales(List<PruebasFuncionales> pruebasFuncionales) {
		this.pruebasFuncionales = pruebasFuncionales;
	}

	public void setTalla(double talla) {
		if (talla < 0 || talla > 2.50) {
			throw new RuntimeException("La estatura no es correcta, [0mts - 2.50mts]");
		}
		this.talla = talla;
	}

	public String toString() {
		return "Usuario [nombre : " + getNombre() + ", Fecha de Nacimiento : " + getFechaNacimiento() + ", talla : "
				+ talla + "mts.  Años : " + fechaNacimiento.calcularAnnos() + " Peso: " + getPeso()
				+ "kg, Pruebas Funcionales : " + pruebasFuncionales + "]";
	}

}
