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
        System.out.println("getTrains");

        return TrainBD.getTrains();
    }

    @GET
    @Path("numTrain-{id}")
    public Train getTrain(@PathParam("id") String numTrain) {
        System.out.println("getTrain");

        for (Train current : TrainBD.getTrains()) {
            if (numTrain.equals(current.getNumTrain())) {
                return current;
            }
        }
        return null;
    }

    @GET
    @Path("/recherche")
    public Train rechercheTrainsAvecCriteres(@QueryParam("depart") String depart, @QueryParam("arrivee") String arrivee, @QueryParam("heurearrivee") String heureArrivee) {
        System.out.println("searchTrainsByCriteria");

        return TrainBD.getTrains().get(0);
    }

    @Path("/trainsreserves")
    public TrainReserveResource getBookTrainResource() {
        return new TrainReserveResource();
    }
}