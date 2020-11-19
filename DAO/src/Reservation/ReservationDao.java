package Reservation;



import Main.Reservation;
import java.util.List;

public interface ReservationDao
{

    Reservation creer();
    Reservation recuperer(int id);
    Reservation modifier(Reservation res);
    boolean delete(Reservation res);

    List<Reservation> getAllReservation();
}

