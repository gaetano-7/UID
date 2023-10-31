package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ScuderieMotoGp {

    private StringProperty team;
    private IntegerProperty nPiloti;
    private IntegerProperty podi;
    private IntegerProperty v;

    public ScuderieMotoGp(String team, int nPiloti, int podi, int v) {
        this.team = new SimpleStringProperty(team);
        this.nPiloti = new SimpleIntegerProperty(nPiloti);
        this.podi = new SimpleIntegerProperty(podi);
        this.v = new SimpleIntegerProperty(v);
    }

    public void setTeam(String team) { this.team.set(team); }
    public void setNPiloti(int nPiloti) { this.nPiloti.set(nPiloti); }
    public void setPodi(int podi) { this.podi.set(podi); }
    public void setV(int v) { this.v.set(v); }

    public String getTeam() { return team.get(); }
    public int getNPiloti() { return nPiloti.get(); }
    public int getPodi() { return podi.get(); }
    public int getV() { return v.get(); }

    public StringProperty teamProperty() { return team; }
    public IntegerProperty nProperty() { return nPiloti; }
    public IntegerProperty podiProperty() { return podi; }
    public IntegerProperty vProperty() { return  v; }

}
