package fr.droneconfig.DroneConfig.composant;

public enum ComposantType {

    FRAME("Chassis"), VTX("Transmission vidéo"), CAMERA("Caméra fpv"), MOTOR("Moteur"), ESC("Controlleur de vitesse"), FC("Carte de vol");

    String description;

    ComposantType(String description) {
        this.description = description;
    }
}
