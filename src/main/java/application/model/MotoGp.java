package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MotoGp {

    private IntegerProperty posizione;
    private StringProperty pilota;
    private StringProperty scuderia;
    private IntegerProperty podi;
    private IntegerProperty punti;

    public MotoGp(int posizione, String pilota, String scuderia, int podi, int punti) {
        this.posizione = new SimpleIntegerProperty(posizione);
        this.pilota = new SimpleStringProperty(pilota);
        this.scuderia = new SimpleStringProperty(scuderia);
        this.podi = new SimpleIntegerProperty(podi);
        this.punti = new SimpleIntegerProperty(punti);
    }

    public void setPosizione(int posizione) { this.posizione.set(posizione); }
    public void setPilota(String pilota) { this.pilota.set(pilota); }
    public void setScuderia(String scuderia) { this.scuderia.set(scuderia); }
    public void setPodi(int podi) { this.podi.set(podi); }
    public void setPunti(int punti) { this.punti.set(punti); }

    public int getPosizione() { return posizione.get(); }
    public String getPilota() { return pilota.get(); }
    public String getScuderia() { return scuderia.get(); }
    public int getPodi() { return podi.get(); }
    public int getPunti() { return punti.get(); }

    public IntegerProperty posProperty() { return posizione; }
    public StringProperty pilotaProperty() { return pilota; }
    public StringProperty teamProperty() { return scuderia; }
    public IntegerProperty podiProperty() { return podi; }
    public IntegerProperty puntiProperty() { return punti; }

}
