package Client;
import Main.Client;
import java.util.List;

public interface ClientDao
{
        Client creer();
        Client recuperer(int id);
        Client modifier(Client cli);
        boolean delete(Client cli);

        List<Client> getAllClient();
}
