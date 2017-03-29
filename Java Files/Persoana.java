package Package;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("db4c9927-86f7-4842-9e7e-cb08ed7a855d")
public class Persoana {
    @objid ("2632b88a-8404-4d9d-b78a-6b653efdec08")
    private String name;

    @objid ("ed91e085-12b7-41c2-96b7-983640165410")
    private int age;

    @objid ("97ff1502-38db-4a35-9a49-19e725eb4e98")
    private String email;

    @objid ("73a84049-6d83-48df-b541-83ffef73b957")
    private Persoana(String name, int age, String email) {
    }

    @objid ("4814c718-85f2-4bd2-8c45-4173215e9cdd")
    public String getName() {
    }

    @objid ("d422aaf5-f0a9-4128-9d68-72e3c4cf5e81")
    public int getAge() {
    }

    @objid ("e1faf498-32ca-4d45-9211-d4934b51e1f8")
    public String getEmail() {
    }

}
