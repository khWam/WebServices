package fr.cours.rest;

import java.util.ArrayList;
import java.util.List;

public class TrainBD {

    private static List<Train> trains = new ArrayList<Train>();

    private static List<TrainReserve> trainsReserves = new ArrayList<TrainReserve>();

    static {
        trains.add(new Train("TR123", "Poitiers", "Paris", 1250));
        trains.add(new Train("TR127", "Poitiers", "Paris", 1420));
        trains.add(new Train("TR129", "Poitiers", "Paris", 1710));
    }

    public static List<Train> getTrains() {
        return trains;
    }

    public static List<TrainReserve> getTrainsReserves() {
        return trainsReserves;
    }
}