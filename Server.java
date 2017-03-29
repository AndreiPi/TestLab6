package Package;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e9cd4f68-fc0e-4652-bb15-2c023cce4180")
public class Server {
    @objid ("a058db74-633b-4398-bfba-543f91dcfffe")
    private Client[] clientiInregistrati;

    @objid ("17c5aa65-b797-4a82-b604-a409f4246aac")
    public List<Client> client = new ArrayList<Client> ();

    @objid ("8c3fd2cb-7ab9-45eb-b881-43d5bf6902e5")
    public BazaDeDate bazaDeDate;

    @objid ("ad33b575-f9da-4bdc-b8b6-7bfeb88652a5")
    public void inregistrareClient(Client client) {
    }

    @objid ("33de7e7d-eee7-44bd-bd8f-ed6ef37cd51b")
    public void getOferta(int poz) {
    }

}
