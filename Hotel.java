package Package;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e587dfd7-05f9-4d83-a7ad-ff3c96ab76af")
public class Hotel {
    @objid ("8ff9e6ad-178c-42ea-903e-0ae18174f1cf")
    private String nume;

    @objid ("c83a4f90-08a2-4f94-b213-b37f0083304f")
    private String adresa;

    @objid ("9f08e195-3a8b-4e7c-a0eb-c0b0c48a73fb")
    private int nrCamere;

    @objid ("32c37ef4-efeb-477c-a9b8-b87105d9235f")
    private Hotel(String nume, String adresa, int nrCamere) {
    }

    @objid ("9fb331f8-ba9d-4fc8-ab48-2459d8545ede")
    public String getNume() {
    }

    @objid ("4f439bf0-07ce-4341-9eb7-1c6c945a1193")
    public String getAdresa() {
    }

    @objid ("d4acebb9-bc46-4768-8558-09ab2a5578ba")
    public int getNrCamere() {
    }

}
