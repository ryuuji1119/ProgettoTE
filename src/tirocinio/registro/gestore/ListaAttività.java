package tirocinio.registro.gestore;

import java.util.ArrayList;
import java.util.List;

import bean.Attivity;
 
 

public class ListaAttivit� {

	private List<Attivity> attivity;
	
	
	public ListaAttivit�() {
		this.attivity = new ArrayList<Attivity>();
	}
	
	 public List<Attivity> getAttivit�() {
		    return attivity;
		  }
	
	 public void aggiungi(Attivity reg) {
		 attivity.add(reg);
		  }
}
