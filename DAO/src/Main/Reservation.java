package Main;

public class Reservation
{
   private int idReservation;
   private int idVol;
   private int IdPassager;
   private String NomPassager;

    public Reservation()
    {
    }

    public Reservation(int idReservation, int idVol, int idPassager, String NomPassager)
    {
        this.idReservation = idReservation;
        this.idVol = idVol;
        this.IdPassager = idPassager;
        this.NomPassager = NomPassager;
    }

    public int getIdReservation()
    {
        return idReservation;
    }

    public void setIdReservation(int idReservation)
    {
        this.idReservation = idReservation;
    }

    public int getIdVol()
    {
        return idVol;
    }

    public void setIdVol(int idVol)
    {
        this.idVol = idVol;
    }

    public int getIdPassager()
    {
        return IdPassager;
    }

    public void setIdPassager(int idPassager)
    {
        IdPassager = idPassager;
    }
    public String getNomPassager()
    {
        return NomPassager;
    }

    public void setNomPassager(String NomPassager)
    {
    	this.NomPassager = NomPassager;
    }
}

