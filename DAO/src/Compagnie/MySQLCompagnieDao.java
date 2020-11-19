package Compagnie;
import java.util.ArrayList;
import java.util.List;
import Main.Compagnie;

public class MySQLCompagnieDao implements CompagnieDao
{
    List<Compagnie> compAero;

    public MySQLCompagnieDao()
    {
        compAero = new ArrayList<Compagnie>();

        Compagnie compAero1 = new Compagnie(1, "Super Compagnie Aérienne");

        compAero.add(compAero1);
    }

    @Override
    public Compagnie creer()
    {
        return null;
    }

    @Override
    public Compagnie recuperer(int id)
    {
        return compAero.get(id);
    }

    @Override
    public Compagnie modifier(Compagnie compAero)
    {
        return null;
    }

    @Override
    public boolean delete(Compagnie compAero)
    {
        return false;
    }

    @Override
    public List<Compagnie> getAllCompAero()
    {
        System.out.println("Liste CompAero : "+ compAero);
        return compAero;
    }
}
