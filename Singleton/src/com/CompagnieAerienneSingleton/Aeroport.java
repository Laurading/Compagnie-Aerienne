package com.CompagnieAerienneSingleton;

import java.util.ArrayList;

public class Aeroport extends UtilString {

    private static Aeroport firstInstance = null;

    private ArrayList<String> aeroportList = new ArrayList<String>();

    static boolean firstThread = true;

    //constructor
    private Aeroport(){}

    public static Aeroport getInstance(){

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

            firstInstance = new Aeroport();
        }

        return firstInstance;

    }

    public ArrayList<String> getAeroport(){ return firstInstance.aeroportList ;}


}