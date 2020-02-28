package tk.jero.models;

import org.springframework.stereotype.Component;

import tk.jero.resources.Fecha;

/**
 * Representa a un jugador de un equipo
 * @author Rafael Velásquez 13/1/2020
 *
 */
@Component
public class Jugador {
	
	private String nombre;
	private Fecha fechaNacimiento;
	private double talla;
	public CualidadesFisicas cualidadesFisicas;
	
	public Jugador() {
	}
	
	public Jugador(String nombre, Fecha edad) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = edad;
		talla=1.50;
		cualidadesFisicas=new CualidadesFisicas();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getEdad() {
		return fechaNacimiento;
	}
	public void setEdad(Fecha feechaNacimiento) {
		this.fechaNacimiento = feechaNacimiento;
	}

	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + fechaNacimiento + ", talla="
				+ talla + ", cualidadesFisicas=" + cualidadesFisicas + "]";
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		if (talla<0 || talla>2.50) {
			throw new RuntimeException("La estatura no es correcta, [0mts - 2.50mts]");			
		}
		this.talla = talla;
	}

	
	

}
