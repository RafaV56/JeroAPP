package tk.jero.models;

import java.util.Arrays;

public class CualidadesFisicas {
	
	public Abdominal[] abdominal;
	
	public static final int NUMEROPRUEBAS=200;

	public String toString() {
		return "\nCualidadesFisicas [abdominal=" + Arrays.toString(abdominal)
				+ "]";
	}

	public CualidadesFisicas() {
		super();
		abdominal=new Abdominal[NUMEROPRUEBAS];
	}
	
	

	


}
