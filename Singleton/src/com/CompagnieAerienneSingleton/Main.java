package com.CompagnieAerienneSingleton;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        CompagnieAerienne newInstanceCompagnieAerienne = CompagnieAerienne.getInstance();

        newInstanceCompagnieAerienne.addCompagnieAerienne("rayan air");
        newInstanceCompagnieAerienne.removeCompagnieAerienne("rayan air");
        newInstanceCompagnieAerienne.addCompagnieAerienne("cnd air");
        newInstanceCompagnieAerienne.renameCompagnieAerienne("cnd air", "air canada");

        System.out.println(newInstanceCompagnieAerienne.getCompagnieAerienne());

        Ville newInstanceVille = Ville.getInstance();

        System.out.println(newInstanceVille.getVille());

        Vol newInstanceVol = Vol.getInstance();
        newInstanceVol.addVol(UUID.randomUUID(), LocalTime.now(),LocalTime.now(), LocalDate.now(),LocalDate.now(),UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID(),LocalTime.now(),LocalTime.now());
        newInstanceVol.addVol(UUID.randomUUID(), LocalTime.now(),LocalTime.now(), LocalDate.now(),LocalDate.now(),UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID(),LocalTime.now(),LocalTime.now());

        System.out.println(newInstanceVol.getvolListe());

    }
}
