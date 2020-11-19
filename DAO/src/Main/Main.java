package Main;

import Aeroport.AeroportDao;
import Client.ClientDao;
import Compagnie.CompagnieDao;
import Escale.EscaleDao;
import Reservation.ReservationDao;
import Ville.VilleDao;
import Vol.VolDao;

public class Main {

    public static void main(String[] args) {

        AeroportDao aero1 = FabriquePersistance.createAeroportDao();
        for (Aeroport a : aero1.getAllAeroport()) {
            System.out.println("Id Aeroport : " + a.getIdAeroport() + ", Nom aeroport : "+ a.getNomAeroport());
        }
        
        ClientDao cli1 = FabriquePersistance.createClientDao();
        for (Client cli : cli1.getAllClient()) {
            System.out.println("Id Client : " + cli.getIdClient() + " Id Reservation : " + cli.getIdReservation());
        }
        
        CompagnieDao comp1 = FabriquePersistance.createCompagnieDao();
        for (Compagnie compaero :comp1.getAllCompAero()) {
            System.out.println("Id Compagnie Aerienne : " + compaero.getIdComp() + " Nom Compagnie Aerienne : " + compaero.getNomComp());
        }
        
        EscaleDao esc = FabriquePersistance.createEscaleDao();
        for (Escale e :esc.getAllEscale()) {
            System.out.println("Id Escale : " + e.getIdEscale() + ", Nom ville : "+ e.getNomEscale()+", heure de depart : " + e.getHeuredepart() + " , heure d'arrivé : "+ e.getHeurearrive());
        }
        
        ReservationDao res1 = FabriquePersistance.createReservationDao();
        for (Reservation res :res1.getAllReservation())
        {
            System.out.println("Id Reservation : " + res.getIdReservation() + ", " + "Id Vol : " + res.getIdVol() + " Id Passager : " + res.getIdPassager()+ ", Nom du passager : "+res.getNomPassager());
        }
        
        VilleDao vil = FabriquePersistance.createVilleDao();
        for (Ville v :vil.getAllVille())
        {
            System.out.println("Id Ville : " + v.getIdVille() + ", Nom ville : "+ v.getNomVille());
        }
        
        VolDao vol1 = FabriquePersistance.createVolDao();
        for (Vol vol :vol1.getAllVol())
        {
            System.out.println("Id Vol : " + vol.getIdVol() + " Heure depart : " + vol.getHeureDepart()+ " Heure arrivée : " + vol.getHeureArivee() + " Date depart : " + vol.getDateDepart() + " Date Arrivée : " + vol.getDateArrivee() + " Id Aéroport Depart : " + vol.getIdAeroDepart() + " Id Aéroport Arrivée : " + vol.getIdAeroArrivee() + " Id Ville Escale : " + vol.getIdVilleEscale() + " Heure Arrivée Escale : " + vol.getHeureEscalearrivée() + " Heure Depart Escale : " + vol.getHeureEscaleDepart());
        }

    }
    
    

}
