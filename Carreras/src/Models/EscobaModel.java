
package Models;

/**
 *
 * @author celad
 */
public class EscobaModel {
    private int IdEscoba;
    private String EscobaTipo;
    
    public EscobaModel(int IdEscoba, String EscobaTipo, int Dormir) {
        this.IdEscoba = IdEscoba;
        this.EscobaTipo = EscobaTipo;
        this.Dormir = Dormir;
    }

    public int getIdEscoba() {
        return IdEscoba;
    }

    public void setIdEscoba(int IdEscoba) {
        this.IdEscoba = IdEscoba;
    }

    public String getEscobaTipo() {
        return EscobaTipo;
    }

    public void setEscobaTipo(String EscobaTipo) {
        this.EscobaTipo = EscobaTipo;
    }

    public int getDormir() {
        return Dormir;
    }

    public void setDormir(int Dormir) {
        this.Dormir = Dormir;
    }
    int Dormir;
    
    
    
}
