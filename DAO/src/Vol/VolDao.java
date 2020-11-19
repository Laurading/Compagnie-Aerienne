package Vol;

import Main.Vol;

import java.util.List;

public interface VolDao
{
    Vol creer();
    Vol recuperer(int id);
    Vol modifier(Vol vol);
    boolean supprimer(Vol vol);

    List<Vol> getAllVol();
    boolean delete(Vol vol);
}