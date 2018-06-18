package de.kad.intech4.parties.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import java.util.ArrayList;
import java.util.Random;

@WebService
@SOAPBinding(style = Style.RPC)

public class Weather{
	
	Random rand = new Random();
	
	//Funktionen
	public int getTemperature(String datum){
		return rand.nextInt(30);
	}
	
	public String getRain(String datum){

		if(rand.nextBoolean()){
			return "Sonne";

		}else{
			return "Wetter";
		}

	}
	
	
	
}
	