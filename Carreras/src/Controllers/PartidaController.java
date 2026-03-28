
package Controllers;

import Models.PartidaModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JPanel;


/**
 *
 * @author celad
 */
public class PartidaController {
    public static PartidaModel[] historial = new PartidaModel[100];
    private static  int NoPartida = 0;
    
    
    public void AgregarPartida(String jugador, String oponente, String ganador, int puntos) {
        if (NoPartida < historial.length) {
            PartidaModel nuevaPartida = new PartidaModel(jugador, oponente, ganador, puntos);
            historial[NoPartida] = nuevaPartida;
            NoPartida++;
        }
}
    public JPanel generarGrafica() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        
        for (int i = 0; i < NoPartida; i++) {
            PartidaModel p = historial[i];
            if (p != null) {
                
                datos.addValue(p.getPuntos(), "Puntos", p.getJugador());
            }
        }

     
        JFreeChart grafica = ChartFactory.createBarChart("Rendimiento de Jinetes","Jinetes","Punteo total",datos,PlotOrientation.VERTICAL,true, true, false);
        return new ChartPanel(grafica);
    }
            
}
