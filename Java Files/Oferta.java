package Package;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5e4af3f5-72e3-401c-a35e-87c28ddb5b5c")
public class Oferta {
    @objid ("1a4e2167-53ef-4f11-8449-994494cc37e2")
    private String locatie;

    @objid ("274543ba-2d9f-4d48-b7bf-7bda734dc7c0")
    private float pret;

    @objid ("ab56596a-427b-490e-a471-0604f0e9a4b9")
    private String recenzii;

    @objid ("3903f1e3-6611-4e76-9b43-a5ecef6cc08a")
    private int id;

    @objid ("e32569cf-d867-4520-b26a-a6b585f95e5f")
    private Oferta(String locatie, float pret, String recenzii) {
    }

    @objid ("f0d1e053-4145-446a-96ea-8b5dd2bdc4e6")
    public String getLocatie() {
    }

    @objid ("6521325c-4af4-48a1-b9b5-ed1f7a24aded")
    public float getPret() {
    }

    @objid ("7585206d-6245-4e11-ac7d-33c0114b12a6")
    public String getRecenzii() {
    }

    @objid ("b36aaaab-e6ba-48c0-87e2-7c37c858b90c")
    public int getId() {
    }

}
