package test;
import relojmundial.*;
import java.time.*;
import org.junit.Test;
import static org.junit.Assert.*;
// Jose Almiron
public class TestPlanetaTierra {

    @Test
    public void Test1() {
        PlanetaTierra p = new PlanetaTierra();
        String [] zonas = p.getZonasHorariasDisponibles();
        int europa = 0, canarias = 0;
        for (int i = 0; i < zonas.length; i++) {
           //  System.out.println(zonas);
            if (zonas[i].equals("Europe/Madrid")) {
                europa = i;
            } else if (zonas[i].equals("Atlantic/Canary")) {
                canarias = i;
            }
        }
        assertEquals("Europe/Madrid", zonas[europa]);
        assertEquals("Atlantic/Canary", zonas[canarias]);
    }
    
    @Test
    public void Test2() {
       PlanetaTierra p = new PlanetaTierra();
       LocalTime time = LocalTime.now();
       int hora = time.getHour();
       int minutos = time.getMinute();
       LocalTime zona = p.getHora("Europe/Madrid");
       assertEquals(hora, zona.getHour());
       assertEquals(minutos, zona.getMinute());
    }
    
    @Test
    public void Test3() {
       PlanetaTierra p = new PlanetaTierra();
       LocalTime europa = p.getHora("Europe/Madrid");
       int horaEuropa = europa.getHour();
       int minutosEuropa = europa.getMinute();
       LocalTime canarias = p.getHora("Atlantic/Canary");
       assertEquals(horaEuropa - 1, canarias.getHour());
       assertEquals(minutosEuropa, canarias.getMinute());
    }
    
}