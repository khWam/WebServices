package fr.cours.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class TrainReserveResource {
    // @POST
	@GET
	@Path("reserve")
    public String createReservationTrain(@QueryParam("numTrain") String numTrain, @QueryParam("nbPlaces") int nbPlaces) {  	
        Train currentTrain = null;

        for (Train current : TrainBD.getTrains()) {
            if (current.getNumTrain().equals(numTrain)) {
                currentTrain = current;
            }
        }
        
        if (currentTrain == null) {
            return "";
        }

        TrainReserve newTrainReserve = new TrainReserve();
        newTrainReserve.setNumberPlaces(nbPlaces);
        newTrainReserve.setCurrentTrain(currentTrain);
        newTrainReserve.setNumReservation(Long.toString(System.currentTimeMillis()));

        TrainBD.getTrainsReserves().add(newTrainReserve);

        String numReservation = newTrainReserve.getNumReservation();
        System.out.println(numReservation);
		return numReservation;
    }

    @GET
    public List<TrainReserve> getTrainsReserves() {
        System.out.println("getTrainsReserves");

        return TrainBD.getTrainsReserves();
    }

    @GET
    @Path("{id}")
    public TrainReserve getReservationTrain(@PathParam("id") String bookNumber) {
        List<TrainReserve> trainsReserves = TrainBD.getTrainsReserves();

        for (TrainReserve current : trainsReserves) {
            if (current.getNumReservation().equals(bookNumber)) {
                return current;
            }
        }

        return null;
    }

    // @DELETE
    @Path("annule/{id}")
    public String annuleReservationTrain(@PathParam("id") String reservationNombre) {
    	TrainReserve currentTrainReserve = null;
        for (TrainReserve current : TrainBD.getTrainsReserves()) {
            if (current.getNumReservation().equals(reservationNombre)) {
            		currentTrainReserve = current;
            		TrainBD.getTrainsReserves().remove(currentTrainReserve);
            		return reservationNombre;
            }
        }
        return "<reservation>" + reservationNombre + " inexistante </reservation>";
        
    }
}
