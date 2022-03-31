package Test;
import adivinanza.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//@ Jose Almiron
public class TestAdivinanza {
    
    @Test
    public void test1()  {
        try {
            Adivinanza a = new Adivinanza("enunciado", "respuesta");
            assertEquals("enunciado", a.getEnunciado());
            String respuesta = "respuesta";
            a.comprobar(respuesta);
        } catch (AdivinanzaException ex) {
            Logger.getLogger(TestAdivinanza.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
