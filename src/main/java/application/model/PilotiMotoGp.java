package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PilotiMotoGp {

    private StringProperty nome;
    private StringProperty eta;
    private StringProperty nazione;
    private StringProperty team;
    private IntegerProperty vittorie;

    public PilotiMotoGp(String nome, String eta, String nazione, String team, int vittorie) {
        this.nome = new SimpleStringProperty(nome);
        this.eta = new SimpleStringProperty(eta);
        this.nazione = new SimpleStringProperty(nazione);
        this.team = new SimpleStringProperty(team);
        this.vittorie = new SimpleIntegerProperty(vittorie);
    }

    public void setNome(String nome) { this.nome.set(nome); }
    public void setEta(String eta) { this.eta.set(eta); }
    public void setNazione(String nazione) { this.nazione.set(nazione); }
    public void setTeam(String team) { this.team.set(team); }
    public void setVittorie(int vittorie) { this.vittorie.set(vittorie); }

    public String getNome() { return nome.get(); }
    public String getEta() { return eta.get(); }
    public String getNazione() { return nazione.get(); }
    public String getTeam() { return team.get(); }
    public int getVittorie() { return vittorie.get(); }

    public StringProperty nomeProperty() { return nome; }
    public StringProperty etaProperty() { return eta; }
    public StringProperty nazProperty() { return nazione; }
    public StringProperty teamProperty() { return team; }
    public IntegerProperty vProperty() { return  vittorie; }

}
