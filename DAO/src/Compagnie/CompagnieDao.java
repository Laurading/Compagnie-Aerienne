package Compagnie;
import Main.Compagnie;
import java.util.List;

public interface CompagnieDao
{
    // Vous proposez vos CRUD
    Compagnie creer(); // Pour créer un Produit
    Compagnie recuperer(int id); // Pour récup un Produit
    Compagnie modifier(Compagnie compAero); // Pour modif un Produit
    boolean delete(Compagnie compAero); // Pour suppr un Produit

    List<Compagnie> getAllCompAero();
}
