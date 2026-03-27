
package Controllers;

import Models.Casa;
import Models.EscobaModel;
import Models.JineteModel;

public class JineteController {
    
    private int NoJinete = 0; 
    public static JineteModel[] jinetes = new JineteModel[100];

    public JineteController() {
        JinetesPredefinidos();
    }
    
    public void JinetesPredefinidos(){
        EscobaModel Saeta = new EscobaModel(3, "Saeta de Fuego", 1000);
        NuevoJinete(1, "Harry Potter", Casa.Gryffindor, Saeta);
        
        EscobaModel Nimbus = new EscobaModel(2, "Nimbus 2001", 2000);
        NuevoJinete(2, "Draco Malfoy", Casa.Slytherin, Nimbus);
    }

    // El Switch ahora vive aquí para centralizar la lógica de las escobas
    public EscobaModel generarEscoba(String tipo) {
        switch (tipo) {
            case "Saeta de Fuego":
                return new EscobaModel(3, "Saeta de Fuego", 1000);
            case "Nimbus 2001":
                return new EscobaModel(2, "Nimbus 2001", 2000);
            case "Nimbus 2000":
                return new EscobaModel(1, "Nimbus 2000", 3000);
            default:
                return new EscobaModel(1, "Nimbus 2000", 3000);
        }
    }

    public String Validacion(int id, String nombre, Casa casa, EscobaModel escoba) {
        // 1. Validar ID duplicado
        for (int i = 0; i < NoJinete; i++) {
            if (jinetes[i].getIdJinete() == id) {
                return "Error: El ID ya existe.";
            }
        }
        
        // 2. Validar límite del vector
        if (NoJinete >= jinetes.length) {
            return "Error: El vector de jinetes está lleno.";
        }

        // 3. Si todo está bien, crear
        NuevoJinete(id, nombre, casa, escoba);
        return "Éxito: Jinete registrado.";
    }

    private void NuevoJinete(int id, String nombre, Casa casa, EscobaModel escoba) {
        JineteModel JineteNuevo = new JineteModel();
        JineteNuevo.setIdJinete(id);
        JineteNuevo.setNombre(nombre);
        JineteNuevo.setCasa(casa);
        JineteNuevo.setEscoba(escoba);
        
        this.jinetes[NoJinete] = JineteNuevo;
        this.NoJinete++;
    }

    // Método para la CPU en la vista de carrera
    public JineteModel obtenerOponenteAleatorio(JineteModel jugador) {
        if (NoJinete < 2) return null;
        JineteModel oponente;
        do {
            int random = (int) (Math.random() * NoJinete);
            oponente = jinetes[random];
        } while (oponente.getIdJinete() == jugador.getIdJinete());
        return oponente;
    }
}
