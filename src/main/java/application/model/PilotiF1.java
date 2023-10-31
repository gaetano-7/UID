package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PilotiF1 {

    private StringProperty nome;
    private StringProperty nazione;
    private IntegerProperty eta;
    private StringProperty scuderia;
    private IntegerProperty gpVinti;

    public PilotiF1(String nome, String nazione, int eta, String scuderia, int gpVinti) {
        this.nome = new SimpleStringProperty(nome);
        this.nazione = new SimpleStringProperty(nazione);
        this.eta = new SimpleIntegerProperty(eta);
        this.scuderia = new SimpleStringProperty(scuderia);
        this.gpVinti = new SimpleIntegerProperty(gpVinti);
    }

    public void setNome(String nome) { this.nome.set(nome); }
    public void setNazione(String nazione) { this.nazione.set(nazione); }
    public void setEta(int eta) { this.eta.set(eta); }
    public void setScuderia(String scuderia) { this.scuderia.set(scuderia); }
    public void setGpVinti(int gpVinti) { this.gpVinti.set(gpVinti); }

    public String getNome() { return nome.get(); }
    public String getNazione() { return nazione.get(); }
    public int getEta() { return eta.get(); }
    public String getScuderia() { return scuderia.get(); }
    public int getGpVinti() { return gpVinti.get(); }

    public StringProperty nomeProperty() { return nome; }
    public StringProperty nazioneProperty() { return nazione; }
    public IntegerProperty etaProperty() { return eta; }
    public StringProperty scuderiaProperty() { return scuderia; }
    public IntegerProperty gpVintiProperty() { return gpVinti; }

}
