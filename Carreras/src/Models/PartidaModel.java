
package Models;

/**
 *
 * @author celad
 */
public class PartidaModel {
    private String jugador;
    private String oponente;
    private String ganador;
    private int puntos;
    
    public PartidaModel(String jugador, String oponente, String ganador, int puntos) {
        this.jugador = jugador;
        this.oponente = oponente;
        this.ganador = ganador;
        this.puntos = puntos;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getOponente() {
        return oponente;
    }

    public void setOponente(String oponente) {
        this.oponente = oponente;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}