package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Formula1 {

    private IntegerProperty pos;
    private StringProperty nazione;
    private StringProperty scuderia;
    private StringProperty pilota;
    private IntegerProperty podi;
    private IntegerProperty punti;

    public Formula1(int pos, String nazione, String scuderia, String pilota, int podi, int punti) {
        this.pos = new SimpleIntegerProperty(pos);
        this.nazione = new SimpleStringProperty(nazione);
        this.scuderia = new SimpleStringProperty(scuderia);
        this.pilota = new SimpleStringProperty(pilota);
        this.podi = new SimpleIntegerProperty(podi);
        this.punti = new SimpleIntegerProperty(punti);
    }

    public int getPos() { return pos.get(); }
    public void setPos(int pos) { this.pos.set(pos);}
    public IntegerProperty posProperty() { return pos; }

    public String getNazione() { return nazione.get(); }
    public void setNazione(String nazione) { this.nazione.set(nazione); }
    public StringProperty nazProperty() { return nazione; }

    public String getScuderia() { return scuderia.get(); }
    public void setScuderia(String scuderia) { this.scuderia.set(scuderia); }
    public StringProperty scuderiaProperty() { return scuderia; }

    public String getPilota() { return pilota.get(); }
    public void setPilota(String pilota) { this.pilota.set(pilota); }
    public StringProperty pilotaProperty() { return pilota; }

    public int getPodi() { return podi.get(); }
    public void setPodi(int podi) { this.podi.set(podi); }
    public IntegerProperty podiProperty() { return podi; }

    public int getPunti() { return punti.get(); }
    public void setPunti(int punti) { this.punti.set(punti); }
    public IntegerProperty puntiProperty() { return punti; }
}
