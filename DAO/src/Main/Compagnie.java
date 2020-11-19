package Main;

public class Compagnie
{
    int idComp;
    String nomComp;

    public Compagnie()
    {
    }

    public Compagnie(int idComp, String nomComp)
    {
        this.idComp = idComp;
        this.nomComp = nomComp;
    }

    public int getIdComp()
    {
        return idComp;
    }

    public void setIdComp(int idComp)
    {
        this.idComp = idComp;
    }

    public String getNomComp()
    {
        return nomComp;
    }

    public void setNomComp(String nomComp)
    {
        this.nomComp = nomComp;
    }
}
