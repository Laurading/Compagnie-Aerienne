package Reservation;
import Main.Reservation;
import java.util.ArrayList;
import java.util.List;

public class MySQLReservationDao implements ReservationDao
{
    List<Reservation> reservation;

    public MySQLReservationDao()
    {
        reservation = new ArrayList<Reservation>();

        Reservation res1 = new Reservation(1, 1, 1, "Paul");
        Reservation res2 = new Reservation(22, 9, 2, "Marin");
        Reservation res3 = new Reservation(78, 19, 02, "toto");

        

        reservation.add(res1);
        reservation.add(res2);
        reservation.add(res3);
    }

    @Override
    public Reservation creer()
    {
        return null;
    }

    @Override
    public Reservation recuperer(int id)
    {
        return reservation.get(id);
    }

    @Override
    public Reservation modifier(Reservation res)
    {
        return null;
    }

    @Override
    public boolean delete(Reservation res)
    {
        return false;
    }

    @Override
    public List<Reservation> getAllReservation()
    {
        System.out.println("Liste Reservation : "+ reservation);
        return reservation;
    }
}
