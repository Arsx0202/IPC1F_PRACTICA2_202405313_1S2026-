
package Hilos;

import Models.JineteModel;
import javax.swing.JLabel;

/**
 *
 * @author celad
 */
public class HilosCarrera extends Thread {
    private JLabel etiquetaJinete; 
    private JineteModel datosJinete;
    private int meta; 

    public HilosCarrera(JLabel etiqueta, JineteModel jinete, int meta) {
        this.etiquetaJinete = etiqueta;
        this.datosJinete = jinete;
        this.meta = meta;
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
            
       
            System.out.println("Llegó: " + datosJinete.getNombre());
            
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
    }
}

