package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SquadraNbaOvest {

    private StringProperty nomeSquadra;
    private IntegerProperty posizione;
    private IntegerProperty partiteGiocate;
    private IntegerProperty partiteVinte;
    private IntegerProperty partitePerse;
    private IntegerProperty puntifatti;
    private IntegerProperty puntisubiti;

    public SquadraNbaOvest(String nomeSquadra, int posizione, int partiteVinte, int partitePerse, int puntifatti, int puntisubiti){
        this.nomeSquadra = new SimpleStringProperty(nomeSquadra);
        this.posizione = new SimpleIntegerProperty(posizione);
        this.partiteVinte = new SimpleIntegerProperty(partiteVinte);
        this.partitePerse = new SimpleIntegerProperty(partitePerse);
        this.partiteGiocate = new SimpleIntegerProperty(partiteVinte + partitePerse);
        this.puntifatti = new SimpleIntegerProperty(puntifatti);
        this.puntisubiti = new SimpleIntegerProperty(puntisubiti);
    }

    public String getNomeSquadra() {
        return nomeSquadra.get();
    }
    public StringProperty nomeSquadraProperty() {
        return nomeSquadra;
    }
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra.set(nomeSquadra);
    }

    public int getPosizione() {
        return posizione.get();
    }
    public IntegerProperty PosizioneProperty() {
        return posizione;
    }
    public void setPosizione(int posizione) {
        this.posizione.set(posizione);
    }

    public int getPartiteGiocate() {
        return partiteGiocate.get();
    }
    public IntegerProperty partiteGiocateProperty() {
        return partiteGiocate;
    }
    public void setPartiteGiocate(int partiteGiocate) {
        this.partiteGiocate.set(partiteGiocate);
    }

    public int getPartiteVinte() {
        return partiteVinte.get();
    }
    public IntegerProperty partiteVinteProperty() {
        return partiteVinte;
    }
    public void setPartiteVinte(int partiteVinte) {
        this.partiteVinte.set(partiteVinte);
    }

    public int getPartitePerse() {
        return partitePerse.get();
    }
    public IntegerProperty partitePerseProperty() {
        return partitePerse;
    }
    public void setPartitePerse(int partitePerse) {
        this.partitePerse.set(partitePerse);
    }

    public int getPuntifatti() {
        return puntifatti.get();
    }
    public IntegerProperty puntifattiProperty() {
        return puntifatti;
    }
    public void setPuntifatti(int puntifatti) {
        this.puntifatti.set(puntifatti);
    }

    public int getPuntisubiti() {
        return puntisubiti.get();
    }
    public IntegerProperty puntisubitiProperty() {
        return puntisubiti;
    }
    public void setPuntisubiti(int puntisubiti) {
        this.puntisubiti.set(puntisubiti);
    }
}
