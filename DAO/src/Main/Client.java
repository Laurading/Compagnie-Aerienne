package Main;

public class Client
{
    int idClient;
    int idReservation;

    public Client()
    {
    }

    public Client(int idClient, int idReservation)
    {
        this.idClient = idClient;
        this.idReservation = idReservation;
    }

    public int getIdClient()
    {
        return idClient;
    }

    public void setIdClient(int idClient)
    {
        this.idClient = idClient;
    }

    public int getIdReservation()
    {
        return idReservation;
    }

    public void setIdReservation(int idReservation)
    {
        this.idReservation = idReservation;
    }
}
