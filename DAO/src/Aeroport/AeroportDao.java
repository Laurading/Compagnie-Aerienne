package Aeroport;
import Main.Aeroport;

import java.util.List;

public interface AeroportDao
{
	Aeroport creer();
	Aeroport recuperer(int id);
	Aeroport modifier(Aeroport aero);
    boolean supprimer(Aeroport aero);

    List<Aeroport> getAllAeroport();
    boolean delete(Aeroport aero);
}


