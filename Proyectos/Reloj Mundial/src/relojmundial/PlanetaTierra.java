package relojmundial;
import java.time.*;
import java.util.*;
// Jose Almiron
public class PlanetaTierra {
 
    public String [] getZonasHorariasDisponibles() {
         Set <String> horariosZona = ZoneId.getAvailableZoneIds();
         List<String> lista = new ArrayList<>(horariosZona);
         Collections.sort(lista);
         String [] zona = new String [lista.size()];
         int i = 0;
         for (String s : lista) {
             zona[i++] = s;
         }
         return zona;
    } 
    
    public LocalTime getHora(String zonaHoraria) {
         ZonedDateTime zona = ZonedDateTime.now(ZoneId.of(zonaHoraria));
         return LocalTime.of(zona.getHour(), zona.getMinute(), zona.getSecond());
    }
    
}