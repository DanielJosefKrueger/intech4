package de.kad.intech4.parties.server;

import javax.xml.ws.Endpoint;

public class Server {


    public static void main(String[] args) {
        Party party_uti = new Party("Gebi vom Uti", "1.8.98", "DJ NAZ", 1);

        Party party_konrads_kommunion = new Party("party_konrads_kommunion", "1.1.1970", "DJ PEDO", 10);

        Party party_fachschaft = new Party("party_fachschaft", "25.6.2018", "DJ Curvegott", 1000);

        Weather weather = new Weather();


        Endpoint utisEnd = Endpoint.publish("http://localhost:8080/uti", party_uti);
        Endpoint lebeerkaassemme = Endpoint.publish("http://localhost:8080/konrad", party_konrads_kommunion);
        Endpoint fachschaftparty = Endpoint.publish("http://localhost:8080/dani", party_fachschaft);
        Endpoint wettastation = Endpoint.publish("http://localhost:8080/wedda", weather);
        System.out.println("Auf gehts! Boggmas!");
    }


}
