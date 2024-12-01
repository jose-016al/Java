package relojmundial;
import java.util.logging.Level;
import java.util.logging.Logger;
// Jose Almiron
public class GeneradorSegundos extends Thread {
    
    private GeneradorSegundosListener receptor;
    private boolean detener;
    
    public GeneradorSegundos(GeneradorSegundosListener r) {
        this.receptor = r;
        this.detener = false;
    }
    
    public void detener() {
        this.detener = true;
    }
    
    public void run() {
        while(!detener) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneradorSegundos.class.getName()).log(Level.SEVERE, null, ex);
            }
            receptor.procesarSegundo();
        }
    }
    
}