package fr.cours.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "train")
public class Train {

    private String numTrain;
    
    private String villeDepart;
    
    private String villeArrivee;
    
    private int heureDepart; // Format : 1230 = 12h30

    public Train() {
    }

	// constructeur paramétré
	
	// accesseurs
}