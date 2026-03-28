
package Hilos;

import Controllers.PartidaController;
import Models.JineteModel;
import carreras.VistaPista;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author celad
 */
public class HilosCarrera extends Thread {
    private JLabel etiquetaJinete; 
    private JineteModel datosJinete;
    private int meta; 
    
    private String nombreJugador;
    private String nombreCpu;
    private VistaPista ventana;

    public HilosCarrera(JLabel etiqueta, JineteModel jinete, int meta,String pJugador, String pCpu, VistaPista pVentana) {
        this.etiquetaJinete = etiqueta;
        this.datosJinete = jinete;
        this.meta = meta;
        this.nombreJugador = pJugador;
        this.nombreCpu = pCpu;
        this.ventana = pVentana;
    }

    @Override
    public void run() {
        
        int velocidad = datosJinete.getEscoba().getDormir();

        try {
           
            while (etiquetaJinete.getX() < meta) {
                
                Thread.sleep(velocidad);

                
                int nuevaX = etiquetaJinete.getX() + 10;
                etiquetaJinete.setLocation(nuevaX, etiquetaJinete.getY());
            }
            synchronized(PartidaController.class) {
            if (!VistaPista.hayGanador) { 
                VistaPista.hayGanador = true; 
                
                String nombreGanador = datosJinete.getNombre();
                int puntos = (nombreGanador.equals(nombreJugador)) ? 100 : 0;

                
                PartidaController ControlP = new PartidaController();
                ControlP.AgregarPartida(nombreJugador, nombreCpu, nombreGanador, puntos);

                JOptionPane.showMessageDialog(null, "¡Ganador: " + nombreGanador + "!");
            
       
            System.out.println("Ganado: " + datosJinete.getNombre());
            }
          }
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
    }
}
    
