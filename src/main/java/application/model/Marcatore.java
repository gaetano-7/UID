package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Marcatore {
    private IntegerProperty posizione;
    private StringProperty nomeGiocatore;
    private StringProperty nomeSquadra;
    private IntegerProperty goalsFatti;
    private IntegerProperty assistsFatti;

    public Marcatore(int posizione, String nomeGiocatore, String nomeSquadra, int goalsFatti, int assistsFatti) {
        this.posizione = new SimpleIntegerProperty(posizione);
        this.nomeGiocatore = new SimpleStringProperty(nomeGiocatore);
        this.nomeSquadra = new SimpleStringProperty(nomeSquadra);
        this.goalsFatti = new SimpleIntegerProperty(goalsFatti);
        this.assistsFatti = new SimpleIntegerProperty(assistsFatti);
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

    public String NomeGiocatore() {
        return nomeGiocatore.get();
    }
    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore.set(nomeGiocatore);
    }
    public StringProperty nomeGiocatoreProperty() {
        return nomeGiocatore;
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

    public int getGoalsFatti() {
        return goalsFatti.get();
    }
    public void setGoalsFatti(int goalsFatti) {
        this.goalsFatti.set(goalsFatti);
    }
    public IntegerProperty goalsFattiProperty() {
        return goalsFatti;
    }

    public int getAssistsFatti() {
        return assistsFatti.get();
    }
    public void setAssistsFatti(int assistsFatti) {
        this.assistsFatti.set(assistsFatti);
    }
    public IntegerProperty assistsFattiProperty() {
        return assistsFatti;
    }
}
