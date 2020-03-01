package tk.jero.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PruebasFuncionales {
	
	

	public List<Abdominal> listAbdominal;
	

	public String toString() {
		StringBuffer string=new StringBuffer("\n[abdominal: \n");
		for (Abdominal abdominal : listAbdominal) {
			string.append(abdominal);
		}
		return string.toString().trim();
	}
	
	public void setAbdominal(Abdominal abd) {
		listAbdominal.add(abd);
	}

	
	public PruebasFuncionales() {
		listAbdominal=new ArrayList<>();
	}

}
