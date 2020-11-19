package com.CompagnieAerienneSingleton;

import java.util.ArrayList;

public class CompagnieAerienne extends UtilString {

    private static CompagnieAerienne firstInstance = null;


    private ArrayList<String> compagnieAerienneList = new ArrayList<String>();

    static boolean firstThread = true;

    //constructor
    private CompagnieAerienne(){
        compagnieAerienneList.add("air france");
    }

    public static CompagnieAerienne getInstance(){
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

            firstInstance = new CompagnieAerienne();
        }

        return firstInstance;
    }

    public  ArrayList<String> getCompagnieAerienne(){
        return firstInstance.compagnieAerienneList;
    }

    public String addCompagnieAerienne(String newCompagnieAerienne){
        compagnieAerienneList.add(newCompagnieAerienne);
        return returnStatusPostif;
    }

    public String removeCompagnieAerienne(String removeCompagnieAerienne){
        compagnieAerienneList.remove(removeCompagnieAerienne);
        return returnStatusPostif;
    }
    //TODO ajouter try/catch
    public String renameCompagnieAerienne(String originalNameCompagnieAerienne, String newNameCompagnieAerienne){
        int indexCompagnieAerienne = compagnieAerienneList.indexOf(originalNameCompagnieAerienne);
        compagnieAerienneList.set(indexCompagnieAerienne, newNameCompagnieAerienne);
        return returnStatusPostif;
    }
}
