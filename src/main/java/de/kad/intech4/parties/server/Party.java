package de.kad.intech4.parties.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.ArrayList;

@WebService
@SOAPBinding(style = Style.RPC)

public class Party{


	private static final int MAX_GUESTS = 100;


	//Objektvariablen
	private final String[] guestlist ;
	private final int max ;
	private String datum = "unkown";
	private String dj = "unknown";
	private String name = "inkown";
	private int indexGuest =0;

	public Party() {
	    this.max = MAX_GUESTS;
        this.guestlist  = new String[MAX_GUESTS];
	}


	public Party(final  String name, final String datum, final String dj, int max){
	   this.guestlist  = new String[max];
        this.max = max;
	    this.datum = datum;
	    this.dj = dj;
	    this.name =name;
    }



	public void setDatum(String datum) {
		this.datum = datum;
	}

	public void setDj(String dj) {
		this.dj = dj;
	}

	//Funktionen
	public String getDatum(){
		return datum;
	}
	
	public String getDj(){
		return dj;
	}
	
	public int amountOfGuest(){
		return guestlist.length;
	}
	
	public String[] getGuestList(){
		return guestlist;
	}
	
	public boolean invite(String guest){

	    if(this.guestlist.length >= max){
            System.out.println("Gast " + guest + " wurde erfolgreich eingetragen!");
            guestlist[indexGuest++]=guest;
            return true;
        }else{
            System.out.println("Gast " + guest + " konnte nicht eingeladen werden, da die Gästeliste voll ist!");
            return false;
        }

	}
	
	
	
}
	