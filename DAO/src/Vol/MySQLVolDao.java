package Vol;
import Main.Vol;
import java.util.ArrayList;
import java.util.List;

public class MySQLVolDao implements VolDao
{
    List<Vol> vol;

    public MySQLVolDao() {

        vol = new ArrayList<Vol>();

        Vol vil1 = new Vol(1, "10h30", "14h30", "19/11/20", "19/11/20",1, 2, 4,"12h30", "12h00");

        vol.add(vil1);
    }

    @Override
    public Vol creer()
    {
        return null;
    }

    @Override
    public Vol recuperer(int id)
    {
        return vol.get(id);
    }

    @Override
    public Vol modifier(Vol vol)
    {
        return null;
    }

    public boolean delete(Vol vol)
    {
        return false;
    }

    @Override
    public List<Vol> getAllVol()
    {
        System.out.println("Liste Reservation : "+ vol);
        return vol;
    }
    @Override
    public boolean supprimer(Vol vol) {
        return false;
    }
}
