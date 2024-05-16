package co.uniquindio.edu.javafx.Modelo;

public class Mago extends EnemigoPlantilla{

    @Override
    public String setHabilidades() {
        String mensajeHabilidades = "Salud: 100, Mana: 100, Stamina: 100";
        return mensajeHabilidades;
    }

    @Override
    public String ataque() {
        String mensajeAtaque = ". El mago atacó";
        return mensajeAtaque;
    }

    @Override
    public String proteccion() {
        String mensajeProteccion =", no pudo protegerse";
        return mensajeProteccion;
    
    }

    @Override
    public String resultado() {
        String mensajeResultado = ", no ha sobrevivido";
        return mensajeResultado;
    }
}
