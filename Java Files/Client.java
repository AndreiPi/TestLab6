package Package;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b3600782-9ccb-4317-bdd1-53e9d859bed3")
public class Client extends Persoana {
    @objid ("2f0b2e6e-6d49-4efd-89f5-a6a47afb7c7b")
    private String username;

    @objid ("7af6c43e-e081-4369-83ee-8f304c94f21b")
    private String password;

    @objid ("b40f1f1c-5f49-4c36-850a-20217c0d7ec4")
    private Formular form;

    @objid ("732f967d-606e-441e-a041-788a01e41a75")
    public Formular formular;

    @objid ("a22e94f7-17ad-49fe-ab74-42e298d17f62")
    public void connect() {
    }

    @objid ("a2167cc8-4f62-4a58-b6eb-3b60e881799a")
    public void orderOferta() {
    }

    @objid ("1023144c-5cd6-4591-9313-dcdc901ac21b")
    private Client(int age, String email, Formular form, Persoana persoana) {
    }

}
