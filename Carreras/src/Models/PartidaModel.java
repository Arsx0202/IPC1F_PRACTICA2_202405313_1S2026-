/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author celad
 */
public class PartidaModel {
    private int IdPartida;
    private int PunteoJugador1;
    private int PunteoJugador2;
    private JineteModel Jugador1;
    private JineteModel Jugador2;

    public int getIdPartida() {
        return IdPartida;
    }

    public void setIdPartida(int IdPartida) {
        this.IdPartida = IdPartida;
    }

    public int getPunteoJugador1() {
        return PunteoJugador1;
    }

    public void setPunteoJugador1(int PunteoJugador1) {
        this.PunteoJugador1 = PunteoJugador1;
    }

    public int getPunteoJugador2() {
        return PunteoJugador2;
    }

    public void setPunteoJugador2(int PunteoJugador2) {
        this.PunteoJugador2 = PunteoJugador2;
    }

    public JineteModel getJugador1() {
        return Jugador1;
    }

    public void setJugador1(JineteModel Jugador1) {
        this.Jugador1 = Jugador1;
    }

    public JineteModel getJugador2() {
        return Jugador2;
    }

    public void setJugador2(JineteModel Jugador2) {
        this.Jugador2 = Jugador2;
    }
}
