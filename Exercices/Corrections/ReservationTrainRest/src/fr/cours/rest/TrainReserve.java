package fr.cours.rest;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "trainreserve")
public class TrainReserve {

    private String numReservation;

    private Train currentTrain;

    private int numberPlaces;

    public String getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(String numReservation) {
        this.numReservation = numReservation;
    }

    public Train getCurrentTrain() {
        return currentTrain;
    }

    public void setCurrentTrain(Train currentTrain) {
        this.currentTrain = currentTrain;
    }

    public TrainReserve() {
		super();
	}

	public int getNumberPlaces() {
        return numberPlaces;
    }

    public void setNumberPlaces(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }
}