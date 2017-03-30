import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by piand on 3/30/2017.
 */
public class TesteAndrei {

    @Test
    public void Formular_test()
    {
        Formular form=new Formular("Sibiu",250);
        assertEquals("Sibiu",form.getLocatie());
        //System.out.println(form.getPret());
        assertEquals(250f,form.getPret());
        float pretexpected=250;
        List<String> locatiiExpected=new ArrayList<>();
        for(int i=0; i<=1000000; ++i)
        {
            form.addLocatieIntermediara("NewLoc",i);
            locatiiExpected.add("NewLoc");
            pretexpected+=i;
        }
        assertEquals(locatiiExpected,form.getLocatieIntermediara());
        assertEquals(pretexpected,form.getPret());
        form.setLocatie("Brasov");
        assertEquals(form.getLocatie(),"Brasov");
        form.setPret(2000);
        assertEquals(2000f,form.getPret());
    }

}
