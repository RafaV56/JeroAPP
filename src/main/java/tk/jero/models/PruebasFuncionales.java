package tk.jero.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tk.jero.models.pruebasfuncionales.Abdominal;
import tk.jero.models.pruebasfuncionales.Lumbar;
import tk.jero.resources.Fecha;

@Component
public class PruebasFuncionales {

	public Fecha fecha;
	@Autowired
	public Abdominal abdominal;
	@Autowired
	public Lumbar lumbar;

	public Fecha getFecha() {
		return fecha;
	}

	public PruebasFuncionales(Fecha fecha, Abdominal abdominal, Lumbar lumbar) {
		super();
		this.fecha = fecha;
		this.abdominal = abdominal;
		this.lumbar = lumbar;
	}

	public PruebasFuncionales() {
		super();
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Abdominal getAbdominal() {
		return abdominal;
	}

	public void setAbdominal(Abdominal abdominal) {
		this.abdominal = abdominal;
	}

	public Lumbar getLumbar() {
		return lumbar;
	}

	public void setLumbar(Lumbar lumbar) {
		this.lumbar = lumbar;
	}

	@Override
	public String toString() {
		return "PruebasFuncionales [fecha=" + (getFecha()==null?"No hay fecha":fecha) + 
				", abdominal=" + (abdominal==null?"No hay prueba abdominal":abdominal) +
				", lumbar=" + (lumbar==null?"No hay prueba lumbar":lumbar)+ "]";
	}

}
