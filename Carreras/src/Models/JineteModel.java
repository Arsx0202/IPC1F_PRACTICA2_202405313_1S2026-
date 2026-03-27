
package Models;

/**
 *
 * @author celad
 */
public class JineteModel {
    private int IdJinete;
    private String nombre;
    private Casa casa;
    private EscobaModel escoba;

    public int getIdJinete() {
        return IdJinete;
    }

    public void setIdJinete(int IdJinete) {
        this.IdJinete = IdJinete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public EscobaModel getEscoba() {
        return escoba;
    }

    public void setEscoba(EscobaModel escoba) {
        this.escoba = escoba;
    }
    
    
}
