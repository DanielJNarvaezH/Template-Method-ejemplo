package co.uniquindio.edu.javafx.Modelo;

public abstract class EnemigoPlantilla {

    public abstract String setHabilidades();
    public abstract String ataque();
    public abstract String proteccion();
    public abstract String resultado();

    public final String template() {
        String mensaje ="El resultado de la batalla es:\n" + setHabilidades() + ataque() + proteccion() + resultado();
        return mensaje;
    }
}
