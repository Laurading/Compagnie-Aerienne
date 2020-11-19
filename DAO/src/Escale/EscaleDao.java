package Escale;

import java.util.List;

import Main.Escale;

public interface EscaleDao {
	
	 Escale creer();
	 Escale recuperer(int id);
	 boolean supprimer(Escale esc);
	 List<Escale> getAllEscale();
	 Escale modifier(Escale esc);

}
