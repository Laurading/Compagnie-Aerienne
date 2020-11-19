package com.CompagnieAerienneSingleton;

import java.util.ArrayList;

public class Ville extends UtilString {

    private static Ville firstInstance = null;

    private ArrayList<String> villeList = new ArrayList<String>();

    static boolean firstThread = true;

    //constructor
    private Ville(){ villeList.add("velzou");}

    public static Ville getInstance(){

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

            firstInstance = new Ville();
        }

        return firstInstance;

    }

    public ArrayList<String> getVille(){ return firstInstance.villeList ;}

    public String addVille(String newVille){
        villeList.add(newVille);
        return returnStatusPostif;
    }

    public String removeVille(String removeVille){
        villeList.remove(removeVille);
        return returnStatusPostif;
    }
    //TODO try/catch
    public String renameVille(String originalNameVille, String newNameVille){
        int indexVille = villeList.indexOf(originalNameVille);
        villeList.set(indexVille,newNameVille);
        return returnStatusPostif;
    }
}
