package de.kad.intech4.djservice;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.HashMap;


/**
 *  The JAX-RS Resource that handles the REST API calls
 */
@Path("/intech")
public class RestRessource {

    HashMap<String, String> mapping = new HashMap<>();





    RestRessource(){

        System.out.println("RestRessource loaded");
        mapping.put("DJ UTI","Verdammt ich kann kein lol spielen");
        mapping.put("DJ KONRAD","Priesterweihe 2.0");
        mapping.put("DJ Key","Schon wieder gewonnen");


    }

    @GET
    @Path("/debug")
    public Response get( String msg) {
        System.out.println("Debug called");
        return Response.ok().entity("Hallo Welt. Ich bin eine debug nachricht").build();
    }




    @GET
    @Path("/djs")
    public String getDJs(){

        StringBuilder ret = new StringBuilder("Dja:<br>");
        for (String s : this.mapping.keySet()) {
            ret.append(s).append("<br>");
        }
        return ret.toString();
    }


    @POST
    @Path("/pl")
    public String getPlaylist(String content){
        String s = mapping.get(content);
        return (s==null?"Keine Playlist für diesen DJ gefunden":s);
    }



}
