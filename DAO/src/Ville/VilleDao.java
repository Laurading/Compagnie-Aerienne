
package Ville;
import Main.Ville;


import java.util.List;

public interface VilleDao {

	    Ville creer();
	    Ville recuperer(int id);
	    Ville modifier(Ville vil);
	    boolean supprimer(Ville vil);
	    
	    List<Ville> getAllVille();
		boolean delete(Ville vil);
}
