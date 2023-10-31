package application.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ScuderieF1 {

    private StringProperty scuderia;
    private StringProperty principal;
    private StringProperty monoposto;
    private StringProperty p1;
    private StringProperty p2;
    private StringProperty riserva;

    public ScuderieF1(String scuderia, String principal, String monoposto, String p1, String p2, String riserva) {
        this.scuderia = new SimpleStringProperty(scuderia);
        this.principal = new SimpleStringProperty(principal);
        this.monoposto = new SimpleStringProperty(monoposto);
        this.p1 = new SimpleStringProperty(p1);
        this.p2 = new SimpleStringProperty(p2);
        this.riserva = new SimpleStringProperty(riserva);
    }

    public void setScuderia(String scuderia) { this.scuderia.set(scuderia); }
    public void setPrincipal(String principal) { this.principal.set(principal); }
    public void setMonoposto(String monoposto) { this.monoposto.set(monoposto); }
    public void setP1(String p1) { this.p1.set(p1); }
    public void setP2(String p2) { this.p2.set(p2); }
    public void setRiserva(String riserva) { this.riserva.set(riserva); }

    public String getScuderia() { return scuderia.get(); }
    public String getPrincipal() { return principal.get(); }
    public String getMonoposto() { return monoposto.get(); }
    public String getP1() { return p1.get(); }
    public String getP2() { return p2.get(); }
    public String getRiserva() { return riserva.get(); }

    public StringProperty scuderiaProperty() { return scuderia; }
    public StringProperty principalProperty() { return principal; }
    public StringProperty monopostoProperty() { return monoposto; }
    public StringProperty p1Property() { return p1; }
    public StringProperty p2Property() { return p2; }
    public StringProperty riservaProperty() { return riserva; }

}
