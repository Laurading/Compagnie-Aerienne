package Client;

import Main.Client;
import java.util.ArrayList;
import java.util.List;

public class MySQLClientDao implements ClientDao
{
    List<Client> client;

    public MySQLClientDao()
    {
        client = new ArrayList<Client>();

        Client cli1 = new Client(3, 3);

        client.add(cli1);
    }

    @Override
    public Client creer()
    {
        return null;
    }

    @Override
    public Client recuperer(int id)
    {
        return client.get(id);
    }

    @Override
    public Client modifier(Client cli)
    {
        return null;
    }

    @Override
    public boolean delete(Client cli)
    {
        return false;
    }

    @Override
    public List<Client> getAllClient()
    {
        System.out.println("Liste Client : "+ client);
        return client;
    }
}


