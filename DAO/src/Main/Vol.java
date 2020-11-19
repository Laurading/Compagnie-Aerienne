package Main;

public class Vol
{
    int idVol;
    String heureDepart;
    String heureArivee;
    String dateDepart;
    String dateArrivee;
    int idAeroDepart;
    int idAeroArrivee;
    int idVilleEscale;
    String heureEscaleDepart;
    String heureEscalearrivée;

    public Vol()
    {
    }

    public Vol(int idVol, String heureDepart, String heureArivee, String dateDepart, String dateArrivee, int idAeroDepart, int idAeroArrivee, int idVilleEscale, String heureEscaleDepart, String heureEscalearrivée)
    {
        this.idVol = idVol;
        this.heureDepart = heureDepart;
        this.heureArivee = heureArivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.idAeroDepart = idAeroDepart;
        this.idAeroArrivee = idAeroArrivee;
        this.idVilleEscale = idVilleEscale;
        this.heureEscaleDepart = heureEscaleDepart;
        this.heureEscalearrivée = heureEscalearrivée;
    }

    public int getIdVol()
    {
        return idVol;
    }

    public void setIdVol(int idVol)
    {
        this.idVol = idVol;
    }

    public String getHeureDepart()
    {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart)
    {
        this.heureDepart = heureDepart;
    }

    public String getHeureArivee()
    {
        return heureArivee;
    }

    public void setHeureArivee(String heureArivee)
    {
        this.heureArivee = heureArivee;
    }

    public String getDateDepart()
    {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart)
    {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee()
    {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee)
    {
        this.dateArrivee = dateArrivee;
    }

    public int getIdAeroDepart()
    {
        return idAeroDepart;
    }

    public void setIdAeroDepart(int idAeroDepart)
    {
        this.idAeroDepart = idAeroDepart;
    }

    public int getIdAeroArrivee()
    {
        return idAeroArrivee;
    }

    public void setIdAeroArrivee(int idAeroArrivee)
    {
        this.idAeroArrivee = idAeroArrivee;
    }

    public int getIdVilleEscale()
    {
        return idVilleEscale;
    }

    public void setIdVilleEscale(int idVilleEscale)
    {
        this.idVilleEscale = idVilleEscale;
    }

    public String getHeureEscaleDepart()
    {
        return heureEscaleDepart;
    }

    public void setHeureEscaleDepart(String heureEscaleDepart)
    {
        this.heureEscaleDepart = heureEscaleDepart;
    }

    public String getHeureEscalearrivée()
    {
        return heureEscalearrivée;
    }

    public void setHeureEscalearrivée(String heureEscalearrivée)
    {
        this.heureEscalearrivée = heureEscalearrivée;
    }
}
