package Package;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fce9ad30-71ac-4f77-b487-24fec3833c16")
public class BazaDeDate {
    @objid ("c81448e0-4e09-4cc9-97ab-c3eac2d69e4c")
    private Client[] clienti;

    @objid ("b63cd2df-bd15-48e9-9e2d-838fe580f39f")
    private Oferta[] oferte;

    @objid ("4216792b-d932-4c65-9f83-6aa18b2b6cfe")
    private String[] hoteluri;

    @objid ("e84f1b0e-119e-43c3-80c9-c06fb61c2774")
    public List<Oferta> oferta = new ArrayList<Oferta> ();

    @objid ("10afb7fb-61a2-4685-9c95-749041779c1c")
    public List<Hotel> hotel = new ArrayList<Hotel> ();

}
