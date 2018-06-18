package de.kad.intech4.parties.client;


import generated.de.kad.intech4.parties.server.*;
import generated.net.java.dev.jaxb.array.StringArray;

import java.net.URL;
import java.util.List;

public class Client {

    public static void main(String[] args) throws Exception {



        PartyService utisService = new PartyService(new URL("http://localhost:8080/uti"));
        Party utisParty = utisService.getPartyPort();

        PartyService konradsService = new PartyService(new URL("http://localhost:8080/konrad"));
        Party konradsParty = konradsService.getPartyPort();

        PartyService danisService = new PartyService(new URL("http://localhost:8080/dani"));
        Party sanisParty = danisService.getPartyPort();

        utisParty.invite("Adam Smith");
        utisParty.invite("John Doe");

        konradsParty.invite("Konrads Muada");
        konradsParty.invite("An haufa gloarne Kinda");

        sanisParty.invite("My freindin");
        sanisParty.invite("neamde");




        System.out.println("\n\nUtis Party");
        System.out.println("Datum:" + utisParty.getDatum());
        System.out.println("Anzahl der Gäste :" + utisParty.amountOfGuest());
        StringArray guestList = utisParty.getGuestList();
        System.out.println("Gaeste:" + guestList.getItem());
        System.out.println("DJ:" + utisParty.getDj());


        System.out.println("\n\nKonrad Party");
        System.out.println("Datum:" + konradsParty.getDatum());
        System.out.println("Anzahl der Gäste :" + konradsParty.amountOfGuest());
        System.out.println("Gaeste:" +  konradsParty.getGuestList().getItem());
        System.out.println("DJ:" + konradsParty.getDj());

        System.out.println("\n\nDanis Party");
        System.out.println("Datum:" + sanisParty.getDatum());
        System.out.println("Anzahl der Gäste :" + sanisParty.amountOfGuest());
        System.out.println("Gaeste:" +  sanisParty.getGuestList().getItem());
        System.out.println("DJ:" + sanisParty.getDj());



        sanisParty.invite("mich");
        System.out.println("\n\nDanis Party");
        System.out.println("Datum:" + sanisParty.getDatum());
        System.out.println("Anzahl der Gäste :" + sanisParty.amountOfGuest());
        System.out.println("Gaeste:" +  sanisParty.getGuestList().getItem());
        System.out.println("DJ:" + sanisParty.getDj());

    }





}
