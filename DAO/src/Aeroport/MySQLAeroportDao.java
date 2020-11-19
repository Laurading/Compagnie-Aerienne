package Aeroport;
import Main.Aeroport;
import java.util.ArrayList;
import java.util.List;

public class MySQLAeroportDao implements AeroportDao {

    List<Aeroport> aeroport;

    public MySQLAeroportDao() {

    	aeroport = new ArrayList<Aeroport>();

    	Aeroport aero = new Aeroport(1,"Charles de Gaulle");

        aeroport.add(aero);
    }

    @Override
    public Aeroport creer()
    {
        return null;
    }

    @Override
    public Aeroport recuperer(int id)
    {
        return aeroport.get(id);
    }

    @Override
    public Aeroport modifier(Aeroport aero)
    {
        return null;
    }

    public boolean delete(Aeroport aero)
    {
        return false;
    }

    @Override
    public List<Aeroport> getAllAeroport()
    {
        System.out.println("Liste Reservation : "+ aeroport);
        return aeroport;
    }
    @Override
    public boolean supprimer(Aeroport aero) {
        // TODO Auto-generated method stub
        return false;
    }
}

