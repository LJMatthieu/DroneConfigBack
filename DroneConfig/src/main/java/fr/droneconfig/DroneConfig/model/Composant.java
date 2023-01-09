package fr.droneconfig.DroneConfig.model;

import fr.droneconfig.DroneConfig.composant.ComposantType;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Composant {

    ComposantType composantType;

    LocalDate dateCreation;

    String description;

    String linkToShop;

    double price;

    double size;

    double maxVoltage;

    public Composant(ComposantType composantType, LocalDate dateCreation, String description, String linkToShop, double price, double size, double maxVoltage) {
        this.composantType = composantType;
        this.dateCreation = dateCreation;
        this.description = description;
        this.linkToShop = linkToShop;
        this.price = price;
        this.size = size;
        this.maxVoltage = maxVoltage;
    }

    public ComposantType getComposantType() {
        return composantType;
    }

    public void setComposantType(ComposantType composantType) {
        this.composantType = composantType;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkToShop() {
        return linkToShop;
    }

    public void setLinkToShop(String linkToShop) {
        this.linkToShop = linkToShop;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMaxVoltage() {
        return maxVoltage;
    }

    public void setMaxVoltage(double maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    @Override
    public String toString() {
        return "Composant{" +
                "composantType=" + composantType +
                ", dateCreation=" + dateCreation +
                ", description='" + description + '\'' +
                ", linkToShop='" + linkToShop + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", maxVoltage=" + maxVoltage +
                '}';
    }
}
