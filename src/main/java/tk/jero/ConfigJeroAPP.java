package tk.jero;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.jero.models.PruebasFuncionales;
import tk.jero.models.pruebasfuncionales.Abdominal;
import tk.jero.models.pruebasfuncionales.Lumbar;
import tk.jero.resources.Fecha;


@Configuration
public class ConfigJeroAPP {

	@Bean("funcionales")
	public List<PruebasFuncionales> funcionales(){
		//***************BORRAR***********************************************
		
		PruebasFuncionales uno=new PruebasFuncionales();
		PruebasFuncionales dos=new PruebasFuncionales();
		
		uno.abdominal=new Abdominal(5, Fecha.creaFechaDeAhora());
		dos.abdominal=new Abdominal(55, Fecha.creaFechaDeAhora());
		uno.lumbar=new Lumbar(48,Fecha.creaFechaDeAhora());
		dos.lumbar=new Lumbar(22, Fecha.creaFechaDeAhora());
		
		//*********************************************************************
		return Arrays.asList(uno,dos);
	}
}
