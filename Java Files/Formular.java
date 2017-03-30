import java.util.ArrayList;
import java.util.List;

public class Formular {
    private String locatieFinala;
    private List<String> locatieIntermediara;

    private float pret;

    Formular(String locatie, float pret) {
    	this.locatieFinala=locatie;
    	this.pret=pret;
        locatieIntermediara=new ArrayList<>();
    }

    public void setLocatie(String locatie) {
    	this.locatieFinala=locatie;
    }

    public void addLocatieIntermediara(String locatie,int newpret)
    {
        locatieIntermediara.add(locatie);
        this.pret+=newpret;
    }
    public void setPret(float pret) {
    	this.pret=pret;
    	
    }

    public String getLocatie() {
		return locatieFinala;
    }

    public float getPret() {
    	return this.pret;
    }

    public List<String> getLocatieIntermediara()
    {
        return locatieIntermediara;
    }

}
