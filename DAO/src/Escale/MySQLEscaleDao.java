package Escale;
import java.util.ArrayList;
import java.util.List;

import Main.Escale;

public class MySQLEscaleDao implements EscaleDao {
	
List<Escale> escale;
	
	public MySQLEscaleDao() {
	
		escale = new ArrayList<Escale>();
		
		Escale esc1 = new Escale(1,"Bois-Colombes","18:9h","20:39h");
		Escale esc2 = new Escale(2,"Paris","11:9h","23:59h");
		Escale esc3 = new Escale(3,"Paris","8:9h","13:59h");
		
		
		escale.add(esc1);
		escale.add(esc2);
		escale.add(esc3);
		
	}
	
	public Escale creer()
    {
        return null;
    }

    public Escale recuperer(int id)
    {
        return escale.get(id);
    }

   
	public Escale modifier(Escale esc)
    {
        return null;
    }

    public boolean delete(Escale esc)
    {
        return false;
    }

    public List<Escale> getAllEscale()
    {
        System.out.println("Liste Reservation : "+ escale);
        return escale;
    }
	public boolean supprimer(Escale esc) {
		// TODO Auto-generated method stub
		return false;
	}

}
