package fr.cours.rest;

import java.util.ArrayList;
import java.util.List;

public class TrainBD {

    private static List<Train> trains = new ArrayList<Train>();


    static {
        trains.add(new Train("TR123", "Poitiers", "Paris", 1250));
        trains.add(new Train("TR127", "Poitiers", "Paris", 1420));
        trains.add(new Train("TR129", "Poitiers", "Paris", 1710));
    }
	
	// accesseurs pour la liste des trains
}