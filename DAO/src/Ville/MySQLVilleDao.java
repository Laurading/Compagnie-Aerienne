package Ville;
import java.util.ArrayList;
import java.util.List;

import Main.Ville;

public class MySQLVilleDao implements VilleDao {

	List<Ville> ville;
	
	public MySQLVilleDao() {
	
		ville = new ArrayList<Ville>();
		
		Ville vil1 = new Ville(1,"Bois-Colombes");
		Ville vil2 = new Ville(2,"Paris");
		Ville vil3 = new Ville(3,"Puybegon");
		
		ville.add(vil1);
		ville.add(vil2);
		ville.add(vil3);
	}
		
		 @Override
		    public Ville creer()
		    {
		        return null;
		    }

		    @Override
		    public Ville recuperer(int id)
		    {
		        return ville.get(id);
		    }

		    @Override
		    public Ville modifier(Ville vil)
		    {
		        return null;
		    }

		    public boolean delete(Ville vil)
		    {
		        return false;
		    }

		    @Override
		    public List<Ville> getAllVille()
		    {
		        System.out.println("Liste Reservation : "+ ville);
		        return ville;
		    }
			@Override
			public boolean supprimer(Ville vil) {
				// TODO Auto-generated method stub
				return false;
			}
}
