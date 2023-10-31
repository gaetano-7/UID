package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Squadra {

    private IntegerProperty posizione;
    private StringProperty nomeSquadra;
    private IntegerProperty partiteVinte;
    private IntegerProperty partitePareggiate;
    private IntegerProperty partitePerse;
    private IntegerProperty punti;
    private IntegerProperty partiteGiocate;

    public Squadra(int posizione, String nomeSquadra, int partiteVinte, int partitePareggiate, int partitePerse, int punti, int partiteGiocate) {
        this.posizione = new SimpleIntegerProperty(posizione);
        this.nomeSquadra = new SimpleStringProperty(nomeSquadra);
        this.partiteVinte = new SimpleIntegerProperty(partiteVinte);
        this.partitePareggiate = new SimpleIntegerProperty(partitePareggiate);
        this.partitePerse = new SimpleIntegerProperty(partitePerse);
        this.punti = new SimpleIntegerProperty(punti);
        this.partiteGiocate = new SimpleIntegerProperty(partiteGiocate);
    }

    public int getPosizione() {
        return posizione.get();
    }
    public void setPosizione(int posizione) {
        this.posizione.set(posizione);
    }
    public IntegerProperty posizioneProperty() {
        return posizione;
    }

    public String getNomeSquadra() {
        return nomeSquadra.get();
    }
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra.set(nomeSquadra);
    }
    public StringProperty nomeSquadraProperty() {
        return nomeSquadra;
    }

    public int getPartiteVinte() {
        return partiteVinte.get();
    }
    public void setPartiteVinte(int partiteVinte) {
        this.partiteVinte.set(partiteVinte);
    }
    public IntegerProperty partiteVinteProperty() {
        return partiteVinte;
    }

    public int getPartitePareggiate() {
        return partitePareggiate.get();
    }
    public void setPartitePareggiate(int partitePareggiate) {
        this.partitePareggiate.set(partitePareggiate);
    }
    public IntegerProperty partitePareggiateProperty() {
        return partitePareggiate;
    }

    public int getPartitePerse() {
        return partitePerse.get();
    }
    public void setPartitePerse(int partitePerse) {
        this.partitePerse.set(partitePerse);
    }
    public IntegerProperty partitePerseProperty() {
        return partitePerse;
    }

    public int getPunti() {
        return punti.get();
    }
    public void setPunti(int punti) {
        this.punti.set(punti);
    }
    public IntegerProperty puntiProperty() {
        return punti;
    }

    public int getPartiteGiocate() {
        return partiteGiocate.get();
    }
    public void setPartiteGiocate(int partiteGiocate) {
        this.partiteGiocate.set(partiteGiocate);
    }
    public IntegerProperty partiteGiocateProperty() {
        return partiteGiocate;
    }
}
