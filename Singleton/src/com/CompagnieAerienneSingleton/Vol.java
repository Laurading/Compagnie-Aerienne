package com.CompagnieAerienneSingleton;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;


public class Vol extends UtilString {

    class VolInfo{
        UUID idVol;
        LocalTime heureDeDepart;
        LocalTime heureArrivee;
        LocalDate dateDepart;
        LocalDate dateArrivee;
        UUID idAeroportDepart;
        UUID idAeroportArrivee;
        UUID idVilleEscale;
        LocalTime heureEscaleDepart;
        LocalTime getHeureEscalArrivee;

        VolInfo(UUID idVol , LocalTime heureDeDepart,LocalTime heureArrivee,LocalDate dateDepart,LocalDate dateArrivee, UUID idAeroportDepart, UUID idAeroportArrivee,UUID idVilleEscale,LocalTime heureEscaleDepart,LocalTime getHeureEscalArrivee){
            this.idVol = idVol;
            this.heureDeDepart = heureDeDepart;
            this.heureArrivee = heureArrivee;
            this.dateDepart = dateDepart;
            this.dateArrivee = dateArrivee;
            this.idAeroportDepart = idAeroportDepart;
            this.idAeroportArrivee = idAeroportArrivee;
            this.idVilleEscale = idVilleEscale;
            this.heureEscaleDepart = heureEscaleDepart;
            this.getHeureEscalArrivee = getHeureEscalArrivee;
        }


    }

    private static Vol firstInstance = null;

    VolInfo v1 = new VolInfo(UUID.randomUUID(), LocalTime.now(),LocalTime.now(),LocalDate.now(),LocalDate.now(),UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID(),LocalTime.now(),LocalTime.now());


    private ArrayList<VolInfo> volListe = new ArrayList<VolInfo>();

    private void volListe(){volListe.add(v1);}


    static boolean firstThread = true;


    public static Vol getInstance(){

        if(firstInstance == null){

            if(firstInstance == null){
                if(firstThread){
                    firstThread = false;

                    Thread.currentThread();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            firstInstance = new Vol();
        }

        return firstInstance;

    }

    public ArrayList<VolInfo> getvolListe(){ return firstInstance.volListe ; }

    public String addVol(
            UUID idVol,
            LocalTime heureDeDepart,
            LocalTime heureArrivee,
            LocalDate dateDepart,
            LocalDate dateArrivee,
            UUID idAeroportDepart,
            UUID idAeroportArrivee,
            UUID idVilleEscale,
            LocalTime heureEscaleDepart,
            LocalTime getHeureEscalArrivee
    ){
        VolInfo objAeroport = new VolInfo(idVol,heureDeDepart,heureArrivee,dateDepart,dateArrivee,idAeroportDepart,idAeroportArrivee,idVilleEscale,heureEscaleDepart,getHeureEscalArrivee);
        volListe.add(objAeroport);

        return returnStatusPostif;
    }



}
