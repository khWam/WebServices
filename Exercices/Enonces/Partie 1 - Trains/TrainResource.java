package fr.cours.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/trains")
@Produces("application/xml")
public class TrainResource {

    public TrainResource() {
    }

    @GET
    public List<Train> getTrains() {
    }

    @GET
    @Path("numTrain-{id}")
    public Train getTrain(@PathParam("id") String numTrain) {
     }

    @GET
    @Path("/recherche")
     }

}