package Main;

import Aeroport.AeroportDao;
import Aeroport.MySQLAeroportDao;

import Client.ClientDao;
import Client.MySQLClientDao;

import Compagnie.CompagnieDao;
import Compagnie.MySQLCompagnieDao;

import Escale.EscaleDao;
import Escale.MySQLEscaleDao;

import Reservation.ReservationDao;
import Reservation.MySQLReservationDao;

import Ville.VilleDao;
import Ville.MySQLVilleDao;

import Vol.VolDao;
import Vol.MySQLVolDao;



public class FabriquePersistance {
	
    public static AeroportDao createAeroportDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLAeroportDao();
    }
    
    public static ClientDao createClientDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLClientDao();
    }
    
    public static CompagnieDao createCompagnieDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLCompagnieDao();
    }
    
    public static EscaleDao createEscaleDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLEscaleDao();
    }
    
    public static ReservationDao createReservationDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLReservationDao();
    }
    
    public static VilleDao createVilleDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLVilleDao();
    }
    
    public static VolDao createVolDao() {
        // elle prend en compte le type d'accès aux données
        return new MySQLVolDao();
    }

}
